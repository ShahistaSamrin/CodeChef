/* 3
10 1 10/input     NO/output
25 2 10           YES 
15 2 10           NO   */
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
		    int M=s.nextInt();
		    int N=s.nextInt();
		    int K=s.nextInt();
		    if(N*K<M){
		        System.out.println("YES");
		    }else System.out.println("NO");
		}
	}
}