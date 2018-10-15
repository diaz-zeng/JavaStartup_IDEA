package edu.diaz.exam.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.diaz.randomarray.ArrayLengthException;
import edu.diaz.randomarray.BuildRandomArray;
/**
 * 
 * 关于排序的作业
 * @author Diaz
 *
 */
public class Exam2
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		try
		{

			int[] randomArray;
			System.out.println("请定义一个数组的长度");
			randomArray = BuildRandomArray.getIntegerRandomArray(new Scanner(System.in).nextInt());//获取一个随机数组
			System.out.print("数组已生成：");
			for (int i : randomArray)//显示原始数组
			{
				System.out.print(i+"\t");
			}
			System.out.println();
			System.out.println("请选择循环类型:1.选择排序\t2.冒泡排序");
			switch (new Scanner(System.in).nextInt())//选择排序类型
			{
			case 1:
			{
				selectionSort(randomArray);
				break;
			}

			case 2:
			{
				bubbleSort(randomArray);
				break;
			}
			default://异常处理，如果输入有误退出程序
			{
				System.err.println("输入错误，程序退出");
				Thread.sleep(1000);//线程休眠，防止看不到信息
				return;
			}
			}
		} catch (ArrayLengthException e)//自定义的异常捕获，当用户输入的数组长度小于1时出发
		{
			// TODO: handle exception
			e.printStackTrace();
		} catch (InputMismatchException e)//防止输入格式不匹配
		{
			// TODO: handle exception
			System.err.println("输入有误请重新输入");
			main(args);
		}
	}

	/**
	 * 
	 * 选择排序
	 * @param arr 要进行筛选 的数组
	 */
	public static void selectionSort(int[] arr)
	{

		for (int i = 0; i < arr.length; i++)
		{
			int temp = 0;
			for (int j = i; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i : arr)
		{
			System.out.print(i + "\t");
		}
	}

	
	/**
	 * 冒泡排序
	 * @param arr 要进行筛选 的数组
	 */
	public static void bubbleSort(int[] arr)
	{

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 1; j < arr.length-i; j++)
			{
				int temp = 0;
				if (arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr)
		{
			System.out.print(i + "\t");
		}
	}

}
