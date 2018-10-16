package edu.diaz.exam.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam5 {
    public static void main(String[] args) {

        System.out.println("请输入");
        String userInput = new Scanner(System.in).nextLine();
        String sPattern = "^1[3|4|5|8][0-9]\\d{8}$";
        System.out.println(Pattern.matches(sPattern,userInput));
    }
}
