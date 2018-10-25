package edu.diaz.exam.day14.exam5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exam5 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        Random random = new Random();
        while (nums.size() < 10) {

            nums.add(random.nextInt(20) + 1);
        }
        System.out.println(Arrays.toString(nums.toArray()));
    }
}
