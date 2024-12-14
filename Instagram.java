/*  4
    1 10//input   NO//output
    10 1          NO
    11 1          YES
    97 7          YES   */
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int i=0;i<T;i++)
	    {
	        int X=s.nextInt();
	        int Y=s.nextInt();
	        if(X>=1 && Y<=100){
	        if(X>Y*10)
	        {
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }
	    }
	}
}