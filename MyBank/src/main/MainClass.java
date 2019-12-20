package main;
import  clss.Current;
import clss.Saving;
import excp.ExceptionClass;
import clss.Recurring;
import  abstr.Account;
import  intf.Banking;

import java.util.Date;
import java.util.Scanner;

import Enums.AccType;


public class MainClass {
	public static void main(String[] args) throws ExceptionClass 
	{
		char type;
		char choice;
		Scanner scn = new Scanner(System.in);
		
		Saving s1 = new Saving();
		Current c1 = new Current();
		Recurring r1 = new Recurring();
		
		/*do{
			System.out.println("which type of account u need ?");
			System.out.println("1. Saving");
			System.out.println("2. Current");
			System.out.println("3.Recurring");
			
			choice=scn.next().charAt(0);*/
		System.out.println("which type of account u need ? ");
		String str=scn.next();
		
			AccType at=AccType.valueOf(str);
			switch(at)
			{
			
			case Saving : 
do	{	
				System.out.println(" Savings Account ");
				System.out.println("1.Create Account " );
				System.out.println("2.Close Account  " );
				System.out.println("3.Deposit Amount " );
				System.out.println("4.Withdraw Amount " );
				System.out.println("*********************** " );
		
				type=scn.next().charAt(0);
				switch(type)
				{
				case '1' :
						s1.createacc();
						break;
				case '2' :
						s1.closeacc();
						break;
				case '3':
						s1.deposit();
						break;
				case '4':
						s1.withdrawal();
						break;
				default :System.out.println();
						break;
				}
			}while(type != '5');
			
		break;
	case Current : 
		//do{
	{
		int ty;
	int z;
    z=1;
      while(z==1)
      {
		System.out.println(" Current Account");
		System.out.println("1.Create Account " );
		System.out.println("2.Close Account  " );
		System.out.println("3.Deposit Amount " );
		System.out.println("4.Withdraw Amount " );
		System.out.println("*********************** " );

		ty=scn.nextInt();
		switch(ty)
		{
		case 1 :
			c1.createacc();
	
	
			break;
		case 2 :
	
			c1.closeacc();
			break;
		case 3:
	
			c1.deposit();
			break;
		case 4:
			c1.withdrawal();
			break;
		default :System.out.println();
		break;
		}
		System.out.println("press 1 :continue"+"press 2 :exit");
		Scanner aa=new Scanner(System.in);
		z=aa.nextInt();
		if(z==1)
		{
			z=1;
		}
		else
		{
			z=0;
		}
      }
      break;
	}
 // }while(type != '5');

	case Recurring:
		do	{
		

		System.out.println(" Recurring Account ");
		System.out.println("1.Create Account " );
		System.out.println("2.Close Account  " );
		System.out.println("3.Deposit Amount " );
		System.out.println("4.Withdraw Amount " );
		System.out.println("*********************** " );

	type=scn.next().charAt(0);
switch(type)
{
	case '1' :
	
	r1.createacc();
//	r1.displayRecur();
	break;
	case '2' :
	r1.closeacc();
	break;
	case '3':
		r1.deposit();
	break;
	case 4:
	r1.withdrawal();
	break;
	default :System.out.println();
	break;
}
}while(type != '5');
				
default :System.out.println();
		break;
			}
		}
	//while(choice != '4');
		
		}		
		

