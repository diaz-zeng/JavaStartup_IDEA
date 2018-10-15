package edu.diaz.exam.day8.exam2;

public class CarTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car c1,c2;
		c1 = new Car();
		c1.setLicensePlate("辽A1234");
		c1.setLoadWeight(100);
		c1.setSpeed(100);
		c2 = new Car(100, "辽A1234", (double) 100);
	}

}
