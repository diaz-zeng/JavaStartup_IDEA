package edu.diaz.exam.day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam2 {
    public static void main(String[] args) {
        System.out.println("请输入");
        String userInput = new Scanner(System.in).nextLine();
        String sPattern = "[\u4e00-\u95fa5]+";
        System.out.println(Pattern.matches(sPattern,userInput));
    }
}
