package clss;
import  abstr.Account;
import Enums.AccType;
import excp.ExceptionClass;
import  intf.Banking;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import Enums.AccType;

public class Saving extends Account implements Banking
{
	static	int accountNo=100;
	AccType acctype;
	int transactionid;
	String trndate;
	double trnamt;
	static	double curbal;
	//Date d = new Date();
	
	public void createacc()
	{
		
		accountNo++;
		acctype = AccType.Saving;
		
		try{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the customer details ");
		
		System.out.println("Enter the customer Id = ");
		customerid=scn.nextInt();
	
		System.out.println("Enter the customer Name = ");
		name=scn.next();
		
		System.out.println("Enter the customer date of birth = ");
		dob = scn.next();

		System.out.println("************************************");
		System.out.println("SUCCSSFULLY CREATED SAVINGS ACCOUNT");
		System.out.println("*************************************");
		
		System.out.println("CUSTOMER DETAILS :");
		System.out.println("Enter the customer Id = "+customerid);
		System.out.println("Enter the customer Name = "+name);
		System.out.println("Enter the customer date of birth = "+dob);
		System.out.println("**************************************");
		
		System.out.println("Enter the Account Number = "+accountNo);
		
		
		}
		catch(InputMismatchException e){
			System.out.println("enter the proper input");
		}
		
	}
	public void closeacc()
	{
		System.out.print(" enter the account number to close = "+accountNo);
		System.out.println();
		System.out.println("ACCOUNT IS CLOSED ");
		System.out.println("***********************************************");

	}
	public  void deposit() throws ExceptionClass
	{
		Scanner scn = new Scanner(System.in);
		try{
		System.out.println("Enter the Account Number = ");
		accountNo = scn.nextInt();
	
		System.out.println("Enter the deposit Amount = ");
		trnamt = scn.nextDouble();
		
		if(trnamt > 0)
		{
		System.out.println("Enter the Account Number = "+accountNo);
		curbal=curbal+trnamt;
		System.out.println("current balanace is ="+curbal);
		System.out.println("****************************************");
		}
		else
		{
			throw new ExceptionClass();
		}

		}
		catch(ExceptionClass e){
			System.out.println("***********************");
			System.out.println("enter the profer amount");
			System.out.println("***********************");
		}
		
	

	}
	public  void withdrawal() throws ExceptionClass
	
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the amount withdraw ");
		trnamt=scn.nextInt();
		try{
		curbal=curbal-trnamt;
		
		if(curbal>0)
		{
			System.out.println("the balance is ="+curbal);	
		}
		else
		{
			throw new ExceptionClass();
		}
		}
		catch(ExceptionClass e)
		{
			System.out.println("the withdraw amount is greater than bal");
		}
	}
	
	
	public String toString(){
		return("Account No.:"+accountNo);
	}

}
	