/*  4
2 5 11//input    3//output
4 10 20          2
1 1 1            0
6 40 90          8  */
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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    int maxWeight=z-y;
		    int maxMangoes=Math.max(0,maxWeight/x);
		    System.out.println(maxMangoes);
		}
	}
}