package edu.diaz.exam.day13.Exam2;

public class Student {
    private String Name;
    private int ID, Age;
    private boolean Gander;

    public Student(int id, String name, boolean gander, int age) {
        ID = id;
        Name = name;
        Age = age;
        Gander = gander;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public boolean isGander() {
        return Gander;
    }

    public boolean equals(Student student) {
        return this.ID == student.getID();
    }

    @Override
    public String toString() {
        return new String("学号：" + ID + " 姓名：" + Name + " 性别：" + (Gander ? "男" : "女") + " 年龄：" + Age);
    }
}
