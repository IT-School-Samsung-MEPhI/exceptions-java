package example1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
    private static final String FILE_NAME = "file.txt";

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader(FILE_NAME);
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed to find file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
    }
}
