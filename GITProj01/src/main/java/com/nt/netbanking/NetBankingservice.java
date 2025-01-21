package com.nt.netbanking;

import java.util.Random;

public class NetBankingservice 
{
	public String openAccount(String aadhar,double initialamount,String type)
	{
		return "Account is Opened with acc numner::"+new Random().nextLong(50000000000L);
	}

		
	
	public String closeAccount()
	{
		return "Account is closed";
	}
	public String withdraw(long acno,double amount)
	{
		return amount+" is withdrawn from the account number::"+acno;
	}
	
	public String deposite(long acno,double amount)
	{
		return amount+" is deposited into thr account number::"+acno;

	}
	
	public String transferMoney(long srcAcno,long destAcno,double amount)
	{
		return "transfering"+amount+"from"+srcAcno+"to"+destAcno;

	}

}
