/* 3
4 /input              NO/output
3 5 6 9
3                     YES
8 7 8
4                     NO  */
10 9 10 4
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
		int a[]=new int[N];
		int count=0;
		for(int j=0;j<N;j++){
		    a[j]=s.nextInt();
		}for(int j=0;j<N;j++){
		    if(a[j]>4){
		        count++;
		    }
		}if(count==N) System.out.println("YES");
		else System.out.println("NO");
		}
	}
}