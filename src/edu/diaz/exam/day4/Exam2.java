package edu.diaz.exam.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入一个整数");
		try
		{
			int inputNum = scanner.nextInt();
			int result = inputNum--;
			while (inputNum>=1)
			{
				result*=inputNum;
				inputNum-=1;
			}
			System.out.println("乘阶为："+result);
		}
		catch (InputMismatchException e)
		{
			System.out.println("输入错误，请重新输入");
			Exam2.main(args);
		}
	}
}
