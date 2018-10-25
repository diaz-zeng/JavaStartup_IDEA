package edu.diaz.exam.day14.exam6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Exam6 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random random = new Random();
        while (nums.size() < 5) {
            nums.add(random.nextInt(9) + 1);
        }
        System.out.println(Arrays.toString(nums.toArray()));
        for (int i = 0; i < nums.size(); i++) {
            int temp = nums.get(i);
            for (int j = i; j < nums.size(); j++) {
                if (nums.get(i) > nums.get(j)) {
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }
            }
        }
        System.out.println(Arrays.toString(nums.toArray()));
    }
}
