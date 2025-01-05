/* 4
1 2//input        NO/output
15 16             YES
15 17             NO
100 107           YES  */
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
		    if(Y<=1.07*X) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}