package clss;
import  abstr.Account;
import  intf.Banking;

import java.util.Date;
import java.util.Scanner;

public class Recurring extends Account implements Banking
{
	int accountNo;
	String acctype;
	int period;
	double maturityamt;
	String trndate;
	double curbal;
	
	public void createacc()
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the customer Id = ");
		customerid=scn.nextInt();
	
		System.out.println("Enter the customer Name = ");
		name=scn.next();
		
		System.out.println("Enter the customer date of birth = ");
		dob = scn.next();
		
	
		System.out.println("customer details :");
		System.out.println("Enter the customer Id = "+customerid);
		System.out.println("Enter the customer Name = "+name);
		System.out.println("Enter the customer date of birth = "+dob);
		
		/*
		System.out.println("Enter the customer status = ");
		
		status = scn.next().charAt(0);
		
		System.out.println("Enter the Account Number = ");
		accountNo = scn.nextInt();
		
		System.out.println("Enter the Account Type = ");
		acctype = scn.next();
		
		System.out.println("Enter the period = ");
		period = scn.nextInt();
		
		System.out.println("maturity Amount = ");
		maturityamt = scn.nextDouble();

		System.out.println("Enter the Transaction Date = ");
		trndate = scn.next();
		
		System.out.println("current balance = ");
		curbal = scn.nextDouble();
	*/
	
	}
	public void closeacc()
	{
		
	}
	public  void deposit()
	{
		
	}
	public  void withdrawal()
	{
		
	}

	/*
	public void displayRecur()
	{
		

		System.out.println("customer details :");
		System.out.println("Enter the customer Id = "+customerid);
		System.out.println("Enter the customer Name = "+name);
		System.out.println("Enter the customer date of birth = "+dob);
		System.out.println("Enter the customer status = "+status);
		System.out.println("Enter the Account Number = "+accountNo );
		System.out.println("Enter the Account Type = "+acctype);
		System.out.println("Enter the period = "+period );
		System.out.println("maturity Amount = "+maturityamt); 
		System.out.println("Enter the Transaction Date = "+trndate );
		System.out.println("current balance = "+curbal);
		System.out.println("**************************************************************");
	}
	
	*/
}
