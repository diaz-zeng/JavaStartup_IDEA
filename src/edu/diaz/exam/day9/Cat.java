package edu.diaz.exam.day9;

public class Cat extends Animal implements Pet
{

	private String name;

	public Cat()
	{
		// TODO Auto-generated constructor stub
	}

	public Cat(String name)
	{
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name)
	{
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play()
	{
		// TODO Auto-generated method stub
		System.out.println("Cat playing");
	}

	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println("Cat eating");

	}

}
