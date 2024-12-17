/*  499 999//input  PLASTIC//output  */
import java.util.*;
class Glassprices
{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		if((X*2)<Y)
		{
		    System.out.println("PLASTIC");
		}
		else
		{
		    System.out.println("METAL");
		}

	}
}