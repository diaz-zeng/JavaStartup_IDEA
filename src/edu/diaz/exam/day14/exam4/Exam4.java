package edu.diaz.exam.day14.exam4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        System.out.println("输入一个字符串：");
        String userInput = new Scanner(System.in).nextLine();
        char[] arr = userInput.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : arr) {
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
            } else {
                counts.put(c, counts.get(c) + 1);
            }
        }
        System.out.println(Arrays.toString(counts.entrySet().toArray()));
    }
}
