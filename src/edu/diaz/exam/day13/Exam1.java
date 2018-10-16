package edu.diaz.exam.day13;

import java.util.*;

public class Exam1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        outloop:
        while (true) {
            System.out.println("请输入：");
            String userInput = scanner.nextLine();
            if("#end".equals(userInput))
                break;
            for (String temp : arr) {
                if(temp.equals(userInput)){
                    System.out.println("输入重复请重试");
                    continue outloop;
                }
            }
            arr.add(userInput);
        }
        System.out.println(arr.toString());
    }
}
