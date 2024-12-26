/*  3
100 11 1 10          200//output
999 25 36 9          900
2500 100 125 101     -25   */
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
		    int e=sc.nextInt();
		    System.out.println(b+(c-d)*e);
		}
	}
}