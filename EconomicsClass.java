/* 2
4//input        2//output
1 2 3 4
2 1 3 4
4               1
1 1 2 2
1 2 1 1                  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int j=0;j<T;j++){
	        int N=s.nextInt();
	        int c=0;
	        int S[]=new int[N];
	        int D[]=new int[N];
	        for(int i=0;i<N;i++){
	            S[i]=s.nextInt();
	        }for(int i=0;i<N;i++){
	            D[i]=s.nextInt();
	        }
	        for(int i=0;i<N;i++){
	            if(S[i]==D[i]){
	                c++;
	            }
	        }System.out.println(c);
	    }
	}
}