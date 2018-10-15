package edu.diaz.randomarray;

/**
 * 创建随机数组的类
 * 
 * @author zly98
 *
 */
public class BuildRandomArray
{
	/**
	 * 一个元素随机长度为十的int数组
	 * @return 随机数组
	 */
	public static int[] getIntegerRandomArray()
	{
		int[] result = new int[10];
		for (int i = 0; i < 10; i++)
		{
			result[i] = (int) (Math.random() * 100);
		}
		return result;
	}
	/**
	 * 创建一个元素随机长度自定的整形数组
	 * @param arrayLength 数组的长度
	 * @return 随机数组
	 * @throws ArrayLengthException 数组长度小于1
	 */
	public static int[] getIntegerRandomArray(int arrayLength) throws ArrayLengthException
	{
		if(arrayLength>0) {
			int[] result = new int[arrayLength];
			for (int i = 0; i < result.length; i++)
			{
				result[i] = (int) (Math.random() * 100);
			}
			return result;
		}
		else
		{
			throw new ArrayLengthException();
		}
		
	}
}


