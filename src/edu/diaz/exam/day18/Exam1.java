package edu.diaz.exam.day18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam1 {
    public static void main(String[] args) {
        String[] names = new String[]{"John","Woods","Oliver","Tom"};
        File fIle = new File("./src/edu/diaz/exam/day18/Names.txt");
        try(FileOutputStream fos = new FileOutputStream(fIle,true))
        {
            for(String s : names)
            {
                fos.write((s+"\r\n").getBytes("UTF-8"));
            }
        }catch (Exception e)
        {

        }
    }
}
