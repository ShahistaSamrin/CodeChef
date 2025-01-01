/*  4
1 0//input      1//output
4 1             2
100 0           4
20 5            3  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    if((a+b)<3) System.out.println("1");
		    else if((a+b)>=3 && (a+b)<=10)
		    System.out.println("2");
		    else if((a+b)>=11 && (a+b)<=60)
		    System.out.println("3");
		    else
		    System.out.println("4");
		}

	}
}