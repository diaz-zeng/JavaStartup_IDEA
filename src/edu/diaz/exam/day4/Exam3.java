package edu.diaz.exam.day4;

public class Exam3
{
	public static String space = "  ";

	public static void main(String[] args)
	{
		System.out.println("这是风格1：");
		mode1();
		System.out.println();
		System.out.println("这是风格2：");
		mode2();

		System.out.println();
		System.out.println("这是风格3：");
		mode3();

		System.out.println();
		System.out.println("这是风格4：");
		mode4();
	}

	public static void mode1()
	{
		for (int i = 1; i <= 9; i++)
		{
			String printLine = "";
			for (int i2 = 1; i2 <= i; i2++)
			{
				String blank = (i2 * i) / 10 != 0 ? "" : " ";
				printLine += i2 + "*" + i + "=" + blank + i2 * i + space;
			}
			System.out.println(printLine);
		}
	}

	public static void mode2()
	{
		for (int i = 9; i >= 1; i--)
		{
			String printLine = "";
			for (int i2 = 1; i2 <= i; i2++)
			{
				String blank = (i2 * i) / 10 != 0 ? "" : " ";
				printLine += i2 + "*" + i + "=" + blank + i2 * i + space;
			}
			System.out.println(printLine);
		}
	}

	public static void mode3()
	{
		for (int y = 1; y <= 9; y++)
		{
			String printLine = "";
			for (int x = 1; x <= y; x++)
			{
				String blank = (x * y) / 10 != 0 ? "" : " ";
				printLine += space + x + "*" + y + "=" + blank + x * y;
			}
			for (int sc = 1; sc <= 9 - y; sc++)
			{
				printLine = "        " + printLine;
			}
			System.out.println(printLine);
		}
	}

	public static void mode4()
	{
		for (int y = 9; y >= 1; y--)
		{
			String printLine = "";
			for (int x = 1; x <= y; x++)
			{
				String blank = (x * y) / 10 != 0 ? "" : " ";
				printLine += space + x + "*" + y + "=" + blank + x * y;
			}
			for (int sc = 1; sc <= 9 - y; sc++)
			{
				printLine = "        " + printLine;
			}
			System.out.println(printLine);
		}
	}
}
