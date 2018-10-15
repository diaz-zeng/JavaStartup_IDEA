package edu.diaz.exam.day11;

import java.util.Scanner;

public class Exam2
{
	public static void main(String[] args)
	{
		StringBuilder builder = new StringBuilder();
		outloop:
		while(true)
		{
			StringBuilder temp = new StringBuilder(new Scanner(System.in).nextLine());
			if("#end".equals(temp.toString()))
			{
				break;
			}
			for (int i = 0; i < temp.length(); i++)
			{
				if(Character.isUpperCase(temp.charAt(i)))
				{

					continue outloop;
				}
			}
			builder.append(temp.toString());
		}
		System.out.println(builder.toString());
	}
}
