package edu.diaz.exam.day4;

public class Exam4_1
{

	public static void main(String[] args)
	{
		int count = 0;
		// TODO Auto-generated method stub
		for (int i = 123; i <= 432; i++)
		{
			int a = i / 100;
			int b = i % 100 / 10;
			int c = i % 10;
			if (a != b && b != c && c != a && a <= 4 && b <= 4 && c <= 4 && a != 0 && b != 0 && c != 0)
			{
				System.out.println(i);
				count += 1;
			}
		}
		System.out.printf("共%s种结果", count);
	}

}
