package edu.diaz.exam.day6;
import java.util.Arrays;

import edu.diaz.randomarray.BuildRandomArray;
public class Exam3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = BuildRandomArray.getIntegerRandomArray();
		System.out.println(Arrays.toString(arr));
		int[] arr_r = new int[arr.length];
		for(int i = 0;i<arr.length;i++)
		{
			arr_r[i] = arr[arr.length-i-1];
		}
		System.out.println(Arrays.toString(arr_r));
	}

}
