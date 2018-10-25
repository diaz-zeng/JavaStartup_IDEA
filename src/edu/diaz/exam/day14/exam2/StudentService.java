package edu.diaz.exam.day14.exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class StudentService {
    private static StudentService instance;
    HashMap<Integer, Student> students;

    public static synchronized StudentService getInstance() {
        if (null == instance) {
            instance = new StudentService();
            return instance;
        } else {
            return instance;
        }
    }

    private StudentService() {
        students = new HashMap<>();
    }

    public boolean add(Student student) {
        if (!students.containsKey(student.getID())) {
            students.put(student.getID(), student);
            return true;
        }
        return false;
    }

    public Student get(Integer id) {
//        for (Student student:students) {
//            if(id.equals(student.getID()))
//            {
//                return student;
//            }
//        }
        if (students.containsKey(id)) {
            return students.get(id);
        }
        return null;
    }
}
