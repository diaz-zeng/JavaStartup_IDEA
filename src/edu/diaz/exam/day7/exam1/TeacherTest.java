package edu.diaz.exam.day7.exam1;

public class TeacherTest
{
	public static void main(String[] args)
	{
		// 创建对象
		Teacher t = new Teacher();

		// 为对象的属性赋值
		t.setName("George");
		t.setAge(30);
		t.setSalary(10000);

		// 输出对象的属性
		System.out.println("name=" + t.getName());
		System.out.println("age=" + t.getAge());
		System.out.println("salary=" + t.getSalary());
		// 调用使年龄增加的方法并输出增加后的年龄
		t.increaseAge();
		System.out.println("new age=" + t.getAge());
	}
}
