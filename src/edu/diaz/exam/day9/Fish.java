package edu.diaz.exam.day9;

import java.util.jar.Attributes.Name;

public class Fish extends Animal implements Pet
{

	private String name ; 
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

		System.out.println("Fish playing");
	}

	@Override
	public void eat()
	{
		// TODO Auto-generated method stub

		System.out.println("Fish eating");

	}

	@Override
	public void walk()
	{
		// TODO Auto-generated method stub
		System.out.println("Fish can`t walk!!!");
	}
}
