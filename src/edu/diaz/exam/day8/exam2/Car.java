package edu.diaz.exam.day8.exam2;

public class Car
{
	private int speed;
	private String licensePlate;
	private double loadWeight;

	public Car(Integer speed, String licensePlate, Double loadWeight)
	{
		// TODO Auto-generated constructor stub
		this.speed = speed;
		this.licensePlate = licensePlate;
		this.loadWeight = loadWeight;
	}

	public Car()
	{
		// TODO Auto-generated constructor stub
		licensePlate = "XX1234";
		speed = 100;
		loadWeight = 100;

	}

	public void setLicensePlate(String licensePlate)
	{
		this.licensePlate = licensePlate;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public void setLoadWeight(double loadWeight)
	{
		this.loadWeight = loadWeight;
	}

	public void speedUp()
	{
		this.speed++;
	}

	public void speedDown()
	{
		this.speed--;
	}

}
