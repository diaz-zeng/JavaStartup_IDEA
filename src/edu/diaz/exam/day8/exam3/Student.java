package edu.diaz.exam.day8.exam3;

public class Student
{
	private int sNo;
	private String sName;
	private boolean sGender;
	private int sAge;
	private int sResults;

	public Student(int numberOf, String name, boolean gender, int age, int results)
	{
		// TODO Auto-generated constructor stub
		this.sNo = numberOf;
		this.sName = name;
		this.sGender = gender;
		this.sAge = age;
		this.sResults = results;
	}

	public int getsNo()
	{
		return sNo;
	}

	public String getsName()
	{
		return sName;
	}

	public boolean issGender()
	{
		return sGender;
	}

	public int getsAge()
	{
		return sAge;
	}

	public int getsResults()
	{
		return sResults;
	}
	
}
