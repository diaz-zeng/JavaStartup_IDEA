package edu.diaz.exam.day14.exam3;


import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class StudentService {
    private static StudentService instance;
    TreeMap<Integer, Student> students;

    public static synchronized StudentService getInstance() {
        if (null == instance) {
            instance = new StudentService();
            return instance;
        } else {
            return instance;
        }
    }

    private StudentService() {
        students = new TreeMap<>();
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
    public Collection<Student> getAll()
    {
        return students.values();
    }
}
