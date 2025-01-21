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

}
