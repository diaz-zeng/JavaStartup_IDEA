package edu.diaz.exam.day4;

import java.util.ArrayList;

public class Exam4_6
{

	public static void main(String[] args)
	{
		ArrayList<Integer> integers = new ArrayList<>();
		// TODO Auto-generated method stub
		for(int i = 1;i<1000;i++)
		{
			int tag = 0;
			for(int j = 1;j<i;j++)
			{
				if(i%j==0)
				{
					tag+=j;
				}
			}
			if(tag==i)
			{
				integers.add(tag);
			}
		}
		for (Integer integer : integers)
		{
			System.out.println(integer);
		}
	}

}
