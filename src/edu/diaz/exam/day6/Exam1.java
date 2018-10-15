package edu.diaz.exam.day6;

public class Exam1
{
	public static void main(String[] args)
	{
		int[] a =
		{ 12, 13, 5, 6, 8, 5 };
		int max = 0, min = 0;
		for (int i : a)
		{
			if (max == 0 || min == 0)
			{
				max = i;
				min = i;
			}
			max = i > max ? i : max;
			min = i < min ? i : min;
		}
		System.out.println("MAX:"+max+" MIN:"+min);
	}
}
