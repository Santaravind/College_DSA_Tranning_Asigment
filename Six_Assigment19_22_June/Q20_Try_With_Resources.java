package Assigment.Six_Assigment19_22_June;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q20_Try_With_Resources {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("data.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
