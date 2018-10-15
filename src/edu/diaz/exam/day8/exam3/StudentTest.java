package edu.diaz.exam.day8.exam3;

import java.util.ArrayList;

public class StudentTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student[] students = new Student[5];
		int sum = 0, avg = 0, max = 0, min = 100;
		for (int i = 0; i < students.length; i++)
		{
			students[i] = new Student(i + 1000, "student" + i, i % 2 == 0 ? true : false, i + 15, i + 90);
			sum += students[i].getsResults();
			max = students[i].getsResults() > max ? students[i].getsResults() : max;
			min = students[i].getsResults() < min ? students[i].getsResults() : min;
			System.out.println("Name:"+students[i].getsName()+" No:"+students[i].getsNo()+" Age"+students[i].getsAge()+" Result:"+students[i].getsResults());
		}
		avg = sum/students.length;
		System.out.println("Max:"+max+" Min:"+min+" Avg:"+avg);

	}

}
