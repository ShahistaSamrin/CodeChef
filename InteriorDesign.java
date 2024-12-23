/*  4
10 20 9 25//input  30//output
10 20 9 20         29
10 20 20 10        30
100 43 85 61       143        */
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
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int e=sc.nextInt();
		    if(b+c<d+e){
		        System.out.println(b+c);
		    }else{
		        System.out.println(d+e);
		    }
		}
	}
}