package edu.diaz.exam.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4_5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{

			Scanner scanner = new Scanner(System.in);
			int inputA, inputB, tempA, tempB, tempC;
			System.out.println("请输值A：");
			inputA = scanner.nextInt();
			System.out.println("请输值B：");
			inputB = scanner.nextInt();
			tempA = inputA > inputB ? inputA : inputB;
			tempB = inputA < inputB ? inputA : inputB;
			while (tempB != 0)
			{
				tempC = tempA % tempB;
				tempA = tempB;
				tempB = tempC;
			}
			System.out.println(inputA+"和"+inputB+"的最小公约数是"+tempA+",最小公倍数是："+inputA*inputB/tempA);

		} catch (InputMismatchException e)
		{
			// TODO: handle exception
			System.err.println("输入有误请重新输入!");
			main(args);
			return;
		}
	}

}

