package Assigment.Six_Assigment19_22_June;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q19_Read_File {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("data.txt");
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error while reading file");

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }
    }
}