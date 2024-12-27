/*  4
1 3 10//input  9//output
5 6 7          2
3 8 9          6
2 5 6          4        */
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
		    int z=sc.nextInt();
		    int[] d={c,b,z};
		    Arrays.sort(d);
		    System.out.println(d[2]-d[0]);
		}
	}
}