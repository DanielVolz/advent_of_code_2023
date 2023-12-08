package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/day2.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
