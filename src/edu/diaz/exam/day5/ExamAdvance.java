package edu.diaz.exam.day5;

import java.util.Arrays;
import java.util.Scanner;

public class ExamAdvance
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.err.println("请输入想要打印的行数");
		int n = new Scanner(System.in).nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][0] = 1;
				arr[i][i] = 1;
			}
		}
		for (int i = 2; i < arr.length; i++)
		{
			for (int j = 1; j < arr[i].length - 1; j++)
			{
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			String output = "";
			for (int j = 0; j <= i; j++)
			{
				output+=arr[i][j]+"\t\t";
			}
			int count = (arr[i].length-i-1)/2;
			for(int j = 0;j<count;j++)
			{
				output="\t\t"+output;
			}
			if((i%2==0&&n%2==0)||(i%2!=0&&n%2!=0))
			{
				output="\t"+output;
			}
			//System.out.println(count);
			System.out.println(output);
		}
	}

}
