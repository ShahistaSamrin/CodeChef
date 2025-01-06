/*  3
5 2 3/input    PASS/output
5 2 4          FAIL
4 0 0          FAIL  */
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
		int X=s.nextInt();
		int P=s.nextInt();
		int A;
		A=N-X;
		if((X*3)-(A*1)>=P){
		    System.out.println("PASS");
		}else System.out.println("FAIL");
		}

	}
}