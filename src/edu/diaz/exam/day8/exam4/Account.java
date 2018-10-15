package edu.diaz.exam.day8.exam4;

public class Account
{
	private String uID;
	private double balance=0;

	public Account(String id)
	{
		// TODO Auto-generated constructor stub
		this.uID = id;
	}

	public void deposit(int amount)
	{
		balance += amount;
	}

	public void Withdrawal(int amount)
	{
		if (balance > amount)
		{
			balance -= amount;
		} else
		{
			System.out.println("余额不足");
		}
	}

	public double getBalance()
	{
		return balance;
	}

	public String getuID()
	{
		return uID;
	}
}
