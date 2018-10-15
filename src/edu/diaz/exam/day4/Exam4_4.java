package edu.diaz.exam.day4;

import java.awt.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4_4
{

	public static ArrayList<Integer> results;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		try
		{
			int input = scanner.nextInt();
			int temp = input;
			results = new ArrayList<>();
			for (int i = 1; i <= input; i++)
			{
				if (input % i == 0)
				{
					input = input / i;
					results.add(i);
					i=1;
				}
			}
			System.out.println(temp + "=" + getResultString(results));
		} catch (InputMismatchException e)
		{
			// TODO: handle exception
			System.err.println("输入错误，请重新输入");
			main(args);
			return;
		}
	}

	public static String getResultString(ArrayList<Integer> integers)
	{
		String result = "";
		for (Integer integer : integers)
		{
			if (result == "")
			{
				result += integer;
			} else
			{
				result += ("*" + integer);
			}
		}
		return result;
	}

}
