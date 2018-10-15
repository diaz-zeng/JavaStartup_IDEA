package edu.diaz.exam.day11;

public class Exam3
{
	public static void main(String[] args)
	{
		String currentPath = System.getProperty("user.dir") + "\\Text.txt";
		System.out.println(currentPath);
		String a, b, d;
		a = currentPath.split(":")[0];
		b = currentPath.split(":")[1];
		String[] c = currentPath.split("\\\\");
		d = currentPath.split("\\.")[1];
		System.out.println("盘符是:" + a + " 路径是:" + b + " 文件名是:" + c[c.length-1]+" 文件类型是:"+d);
	}
}
