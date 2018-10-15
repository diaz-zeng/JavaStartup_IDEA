package edu.diaz.exam.day8.exam4;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account = new Account("00040");
		account.deposit(8000);
		account.Withdrawal(1000);
		System.out.println(account.getuID()+" Balance: "+account.getBalance());
	}
}
