package example6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Example6 {
    private static final String FILE_NAME = "file.txt";

    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME))) {
            System.out.println(bf.readLine());
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
    }
}