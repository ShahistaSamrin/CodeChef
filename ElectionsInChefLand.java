/*  4
4 3//input          2//output
5 3 1 2
3 2                 2
1 3 4     
4 2                 3
2 1 2 4 
5 6                 0
1 2 3 4 5       */
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
		    int a[]=new int[N];
		    for(int j=0;j<N;j++){
		        a[j]=s.nextInt();
		    }
		    int count=0;
		    for(int j=0;j<N;j++){
		        if(a[j]>=X){
		            count++;
		        }
		    }System.out.println(count);
		}
	}
}