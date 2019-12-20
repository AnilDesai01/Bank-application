package abstr;

import java.util.Date;

import excp.ExceptionClass;

public abstract class Account 
{
	public int customerid;
	public String name;
	public String dob;
	public char status;
	
	public abstract void deposit() throws ExceptionClass;
	public abstract void withdrawal() throws ExceptionClass;
}