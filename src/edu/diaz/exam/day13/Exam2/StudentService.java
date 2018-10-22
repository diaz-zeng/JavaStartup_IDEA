package edu.diaz.exam.day13.Exam2;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentService {
    private static StudentService instance;
    private ArrayList<Student> students;

    public static synchronized StudentService getInstance() {
        if (null == instance) {
            instance = new StudentService();
            return instance;
        } else {
            return instance;
        }
    }

    private StudentService() {
        students = new ArrayList<Student>();
    }

    public boolean add(Student student) {
        if (!isExists(student)) {
            students.add(student);
            return true;
        } else {
            return false;
        }
    }

    private boolean isExists(Student student) {
        for (Student temp : students) {
            if (temp.equals(student)) {
                return true;
            }
        }
        return false;
    }

    public Student get(String id) {
//        for (Student student:students) {
//            if(id.equals(student.getID()))
//            {
//                return student;
//            }
//        }
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (id.equals(student.getID()))
                return student;
        }
        return null;
    }
}
