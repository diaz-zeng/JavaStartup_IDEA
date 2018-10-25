package edu.diaz.exam.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\zly98\\Desktop\\B.jpg");
             FileOutputStream fos = new FileOutputStream("./src/edu/diaz/exam/day18/B.jpg")) {
            byte[] len = new byte[fis.available()];
            fis.read(len);
            fos.write(len);
        } catch (Exception e) {

        }
    }
}
