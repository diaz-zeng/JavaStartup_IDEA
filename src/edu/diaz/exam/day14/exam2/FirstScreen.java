package edu.diaz.exam.day14.exam2;

import java.util.Scanner;

public class FirstScreen {
    private StudentService service;

    public FirstScreen() {
        service = StudentService.getInstance();
    }

    public void start() {
        while (true) {
            System.out.println("请选择功能：1.添加 2.查询");
            try {
                switch (new Scanner(System.in).nextInt()) {
                    case 1: {
                        add();
                        break;
                    }
                    case 2: {
                        get();
                        break;
                    }
                    default: {

                        throw new Exception();
                    }
                }
            } catch (Exception e) {
                System.out.println("输入错误，程序结束");
                System.exit(0);
            }
        }
    }

    private void add() {
        while (true) {
            System.out.println("请输入学生信息（学号,姓名,性别,年龄）：");
            String userInput = new Scanner(System.in).nextLine();
            if ("#end".equals(userInput))
                break;
            String[] datas = userInput.split(",");
            try {
                int id = Integer.parseInt(datas[0]);
                String name = datas[1];
                boolean gender;
                if ("男".equals(datas[2]) || "女".equals(datas[2])) {

                    gender = "男".equals(datas[2]) ? true : false;
                } else {
                    throw new Exception("性别不对");
                }
                int age = Integer.parseInt(datas[3]);
                Student student = new Student(id, name, gender, age);
                if (service.add(student)) {
                    System.out.println("添加成功");
                } else {
                    System.out.println("添加失败，可能已经存在");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void get() {
        while (true) {
            System.out.println("请输入学号（#end退出）：");
            String userInput = new Scanner(System.in).nextLine();
            if ("#end".equals(userInput))
                break;
            try {
                int id = Integer.parseInt(userInput);
                Student student = service.get(id);
                if (null != student) {
                    System.out.println(student);
                } else {
                    System.out.println("查无此人");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
