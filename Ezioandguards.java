/* 3
5 7//input  NO
6 6         YES
9 1         YES */
import java.util.*;
import java.lang.*;
import java.io.*;

class Ezioandguards
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++)
		{
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    if(X>=Y){
		        System.out.println("Yes");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}