/*  3
1 1 2//input           100//output
4 2 6                  11
10 2 4                 7         */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int e=2*(b*c+(c*d)+(d*b));
		    System.out.println(1000/e);
		}
	}
}