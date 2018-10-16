package edu.diaz.exam.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam7 {
    public static void main(String[] args) {
        String sPattern = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";
        System.out.println("请输入");
        String userInput = new Scanner(System.in).nextLine();
        System.out.println(Pattern.matches(sPattern,userInput));
    }
}
