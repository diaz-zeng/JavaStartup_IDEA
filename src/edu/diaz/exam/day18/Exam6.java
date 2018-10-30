package edu.diaz.exam.day18;

import java.util.*;

public class Exam6 {
    public static void main(String[] args) {

        HashMap<Character, Integer> counter = new HashMap<>();
        while (true) {
            System.out.println("请输入一个字符串:");
            String userInput = new Scanner(System.in).nextLine();
            if ("#end".equals(userInput))
                break;
            for (Character c : userInput.toCharArray()) {
                if (counter.containsKey(c)) {
                    counter.put(c, counter.get(c)+1);
                } else {
                    counter.put(c, 1);
                }
            }
            Iterator<Map.Entry<Character, Integer>> iterator = counter.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Character, Integer> entry = iterator.next();
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
