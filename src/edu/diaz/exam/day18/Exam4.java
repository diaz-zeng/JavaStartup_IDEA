package edu.diaz.exam.day18;

import java.io.*;
import java.util.Scanner;

public class Exam4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            System.out.println("请输入");
            userInput = scanner.nextLine();
            if ("#end".equals(userInput))
                end();
            try (
                    FileWriter writer = new FileWriter("./src/edu/diaz/exam/day18/names.txt",true)) {
                writer.write(userInput + "\r\n");
            } catch (Exception e) {

            }
        }
    }

    public static void end() {
        try (FileReader reader = new FileReader("./src/edu/diaz/exam/day18/names.txt");) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String read;
            while (null!=(read=bufferedReader.readLine()))
            {
                System.out.println(read);
            }
            System.exit(0);
        } catch (Exception e) {

        }
    }

}
