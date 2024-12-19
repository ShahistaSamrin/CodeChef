/*  4
2 5//input  YES//output 
4 3         NO
6 6         YES
10 9        NO       */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++)
		{
		int n=sc.nextInt();
		int x=sc.nextInt();
		if(n<=x)
		System.out.println("YES");
		else
		System.out.println("NO");
		}

	}
}