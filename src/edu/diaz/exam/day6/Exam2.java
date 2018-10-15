package edu.diaz.exam.day6;

import java.util.Scanner;

public class Exam2
{

	static boolean flag = false;

	static int[] a = {12,13,5,6,8,5};

	public static void main(String[] args)
	{
		System.out.println( "请输入你要查询的元素值");
		int target = new Scanner(System.in).nextInt();
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				flag = true;
				System.out.println(a[i]+"的索引值为："+i);
			}
		}
		if(flag==false)
		{
			System.out.println("未找到该元素");
		}
	}

}
