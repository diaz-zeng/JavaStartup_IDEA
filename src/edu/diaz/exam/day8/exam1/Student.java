package edu.diaz.exam.day8.exam1;

public class Student
{
	int results;
	String name;
	
	
	public Student()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Student(int results , String name)
	{
		// TODO Auto-generated constructor stub
		this.name = name;
		this.results = results;
	}
	public String getName()
	{
		return name;
	}
	public int getResults()
	{
		return results;
	}
	public void setName(String name)
	{
		name = name;
	}
	public void setResults(int results)
	{
		this.results = results;
	}
}
