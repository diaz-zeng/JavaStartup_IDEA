package edu.diaz.exam.day7.exam3;

public class Rectangle extends Shape
{
	private double height, width;

	public Rectangle()
	{
		// TODO Auto-generated constructor stub
		height = 1.0;
		width = 1.0;
	}

	public Rectangle(double h, double w)
	{
		width = w;
		height = h;
	}

	public Rectangle(int x, int y, double h, double w)
	{
		super(x,y);
		width = w;
		height = h;
	}
	@Override
	public void draw()
	{
		// TODO Auto-generated method stub
		System.out.println("draw in rectangle "+getX()+" "+getY()+" "+height+" "+width);
	}
}
