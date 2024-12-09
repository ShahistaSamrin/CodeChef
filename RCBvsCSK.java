/*  218 191  
    RCB  */
import java.util.*;
import java.lang.*;
import java.io.*;
class RCBvsCSK
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int X=s.nextInt();
	    int Y=s.nextInt();
	    int runs=X-Y;
	    if(runs>=18)
	    {
	        System.out.println("RCB");
	    }else
	    System.out.println("CSK");
	    
	}
}