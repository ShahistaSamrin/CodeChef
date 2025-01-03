/*  
1//input               Thanks for helping Chef!//output
12                     -1
-5                     Thanks for helping Chef!  */
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
	        int N=s.nextInt();
	        if(N<10) System.out.println("Thanks for helping Chef!");
	        else System.out.println("-1");
	    }

	}
}