package edu.diaz.exam.day6;
import java.util.Arrays;

import edu.diaz.randomarray.BuildRandomArray;
public class Exam5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr = BuildRandomArray.getIntegerRandomArray();
		System.out.println(Arrays.toString(arr));
		int max=0,min=0,sum=0,avg=0;
		for (int i : arr)
		{
			if (max == 0 || min == 0)
			{
				max = i;
				min = i;
			}
			max = i > max ? i : max;
			min = i < min ? i : min;
			sum+=i;
		}
		avg = sum/10;
		System.out.println("MAX:"+max+" MIN:"+min+" SUM:"+sum+" AVG:"+avg);
	}

}
