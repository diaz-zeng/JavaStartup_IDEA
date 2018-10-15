package edu.diaz.exam.day5;

import java.util.Arrays;

public class Exam3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr1[] = new int[]
		{ 2, 3, 5, 7, 11, 13, 17, 19 };

		int arr2[];
		arr2 = arr1;
		for (int i : arr1)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i = 0;i<arr2.length;i++)
		{
			if(i%2==0)
			{
				arr2[i]=i;
			}
			System.out.print(arr1[i]+"\t");
		}
		Arrays.toString(arr1);
	}

}
