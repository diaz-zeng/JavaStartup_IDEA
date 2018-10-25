package edu.diaz.exam.day14.exam3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = StudentService.getInstance();
        String userInput;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生信息（学号,姓名,性别,年龄）：");
            userInput = scanner.nextLine();
            if ("#end".equals(userInput))
                break;
            Student student = createStudent(userInput);
            if (null != student) {
                if (service.add(student)) {
                    System.out.println(student.toString());
                } else {
                    System.out.println("该学生号已存在，请重新输入");
                    continue;
                }
            } else {
                System.out.println("输入有误,请重新输入");
                continue;
            }
        }
        System.out.println(Arrays.toString(service.getAll().toArray()));
    }

    public static Student createStudent(String studentString) {
        try {
            String[] datas = studentString.split(",");
            int id = Integer.parseInt(datas[0]);
            String name = datas[1];
            boolean gander;
            if ("男".equals(datas[2])) {
                gander = true;
            } else if ("女".equals(datas[2])) {
                gander = false;
            } else {
                throw new InputMismatchException();
            }
            int age = Integer.parseInt(datas[3]);
            Student student = new Student(id, name, gander, age);
            return student;

        } catch (InputMismatchException e) {
            return null;
        }
    }
}
