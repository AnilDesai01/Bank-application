package excp;

public class ExceptionClass extends Exception
{

	public ExceptionClass()
	{
		System.out.println("*************************");
		System.out.println(" Enter the profer amount ");
		System.out.println("***************************");
	}
	@Override
	public String toString()
	{
	return "this is exception";
	}
}
