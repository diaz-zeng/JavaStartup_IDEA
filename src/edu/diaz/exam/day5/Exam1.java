package edu.diaz.exam.day5;
/**
 * @author Diaz
 *
 */
public class Exam1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] integers =new int[10];//创建数组
		for(int i = 0;i<10;i++)//填充数组
		{
			integers[i] = Integer.valueOf(i+1);
		}
		System.out.println(getMultiplyResultFromIntegerArray(integers));//调用方法计算
		
	}
	/**
	 * 将所有数组元素相乘并返回结果
	 * @param integers 要计算的数组
	 * @return 计算结果
	 */
	public static int getMultiplyResultFromIntegerArray(int[] integers)
	{
		int result  = 1;
		for(int i = 0;i<integers.length;i++)
		{
			result*=integers[i];
		}
		return result;
	}

}
