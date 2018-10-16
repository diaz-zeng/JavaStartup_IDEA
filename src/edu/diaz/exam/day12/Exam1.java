package edu.diaz.exam.day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam1 {
    public static void main(String[] args) {
        System.out.println("请输入密码：");
        String userInput = new Scanner(System.in).nextLine();
        String sPattern = "^[A-Za-z][^%&',;=?$\\x22]+$";
        Pattern pattern = Pattern.compile(sPattern);
        Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher.find());
    }
}
