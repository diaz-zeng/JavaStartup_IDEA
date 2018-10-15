package edu.diaz.exam.day7.exam3;

public class Circle extends Shape
{
	private double r;

	public Circle()
	{
		// TODO Auto-generated constructor stub
		r = 1.0;
	}

	public Circle(int r)
	{
		this.r = r;
	}

	public Circle(int x, int y, int r)
	{
		super(x, y);
		this.r = r;
	}
	@Override
	public void draw()
	{
		// TODO Auto-generated method stub
		System.out.println("draw in circle"+" "+getX()+" "+getY()+" "+r);
	}

	public double getR()
	{
		return r;
	}
	
}
