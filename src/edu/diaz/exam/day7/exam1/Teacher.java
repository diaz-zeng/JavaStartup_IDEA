package edu.diaz.exam.day7.exam1;

public class Teacher
{
	private String name;		//濮撳�?
	private int age;			//骞撮�?
	private double salary;	//钖�?

	//鐢ㄤ簬骞撮緞澧炲姞鐨勬柟娉�
	public void increaseAge(){
		age++;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}	
}

