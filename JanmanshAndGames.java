/* 2
2 2//input        Janmansh//output
4 3               Jay */
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
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    for(int j=0;j<Y;j++){
		        ++X;
		   }if(X%2==0) System.out.println("Janmansh");
		   else System.out.println("Jay");
		}

	}
}