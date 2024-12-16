/*  3
10 50//input  YES//input
15 200        NO
3 20          YES  */
15 200
3 20
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
		    if(X*15>=2*Y) System.out.println("YES");
		    else System.out.println("NO");
		    
		}

	}
}