/*3 
1 2//input     1//output
100 200        100
40 15          10      */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    int c=sc.nextInt();
		    int b=sc.nextInt();
		    System.out.println(c%b);
		}
	}
}