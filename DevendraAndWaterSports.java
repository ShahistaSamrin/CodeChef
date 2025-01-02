/* 3
25000 22000 1000 1500 700//input           No//output
10000 7000 100 300 500                     Yes
15000 5000 2000 5000 3000                  Yes     */
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
		    int z=s.nextInt();
		    int Y=s.nextInt();
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    if((z-Y)>=(A+B+C)){
		        System.out.println("Yes");
		    }else System.out.println("No");
		}

	}
}