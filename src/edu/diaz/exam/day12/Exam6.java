package edu.diaz.exam.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam6 {
    public static void main(String[] args) {

        System.out.println("请输入");
        String userInput = new Scanner(System.in).nextLine();
        String sPattern = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
        System.out.println(Pattern.matches(sPattern,userInput));
    }
}
