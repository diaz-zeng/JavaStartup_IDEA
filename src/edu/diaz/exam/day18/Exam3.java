package edu.diaz.exam.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam3 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("./src/edu/diaz/exam/day18/F-15C DCS Flaming Cliffs Flight Manual CN.pdf");
             FileInputStream fis = new FileInputStream("C:\\Users\\zly98\\OneDrive\\文档\\DCS飞行手册\\F-15C DCS Flaming Cliffs Flight Manual CN.pdf")) {
            int len = -1;
            int postion = 0;

            byte[] buffer = new byte[1024];
            while((len= fis.read(buffer))!=-1)
            {
                fos.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
