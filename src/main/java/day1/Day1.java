package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/day1.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            String trebuchetCoordinate;
            int solution = 0;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("[a-z]", "");
                char firstNumber = line.charAt(0);
                char lastNumber = line.charAt(line.length() - 1);
                if(line.length() == 1){
                    trebuchetCoordinate = "" + firstNumber + firstNumber;
                }
                trebuchetCoordinate = "" + firstNumber + lastNumber;
                solution += Integer.parseInt(trebuchetCoordinate);


            }
                System.out.println(solution);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
