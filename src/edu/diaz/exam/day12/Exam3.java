package edu.diaz.exam.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam3 {
    public static void main(String[] args) {

        System.out.println("请输入");
        String userInput = new Scanner(System.in).nextLine();
        String sPattern = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        System.out.println(Pattern.matches(sPattern,userInput));
    }
}
