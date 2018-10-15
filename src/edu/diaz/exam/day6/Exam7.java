package edu.diaz.exam.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class Exam7
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		System.out.println("请输入第一个数:");
		arr[0] = new Scanner(System.in).nextInt();
		System.out.println("请输入第二个数:");
		arr[1] = new Scanner(System.in).nextInt();
		System.out.println("请输入第三个数:");
		arr[2] = new Scanner(System.in).nextInt();
		System.out.println("请输入第四个数:");
		arr[3] = new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(arr));
		ArrayList<Integer> arrTemp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]>10)
			{
				arrTemp.add(arr[i]);
			}
		}
		if(!arrTemp.isEmpty())
		{
			String outPut = "大于十的元素有:\t";
			for (Integer integer : arrTemp)
			{
				
				outPut+=integer.toString()+"\t";
			}
			System.out.println(outPut);
		}
	}

}
