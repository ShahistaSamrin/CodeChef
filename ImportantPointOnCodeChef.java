/*  
0 1//input       https://www.codechef.com/practice//output    */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		if(A==0){
		    System.out.println("https://www.codechef.com/practice");
		}else if(A==1 && B==0){
		    System.out.println("https://www.codechef.com/contests");
		}else{
		    System.out.println("https://discuss.codechef.com");
		}

	}
}