package edu.diaz.exam.day4;

public class Exam4_2
{

	public static void main(String[] args)
	{

		for (int i = 100; i < 200; i++)
		{
			int a = 0;
			for (int j = 2; j <= i; j++)
			{

				if (i % j == 0 && j != i)
				{
					break;
				} 
				else if (i % j == 0 && j == i)
				{
					a = i;
				}
			}
			if(a!=0)
			{
				System.out.println(a);
			}
		}

	}
}
