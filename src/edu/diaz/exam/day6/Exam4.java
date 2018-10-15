package edu.diaz.exam.day6;

public class Exam4
{

	
	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int result = 1;
		for (int i : arr)
		{
			result*=i;
		}
		System.out.println(result);
	}

}
