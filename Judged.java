/*  3
1 0 0 0 1//input       NO//output
1 1 0 0 1              NO
0 1 1 1 1              YES  */
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
	       int c=0;
	       int a[]=new int[5];
	       for(int j=0;j<5;j++)
	       {
	           a[j]=s.nextInt();
	       }
	       for(int j=0;j<5;j++)
	       {   
	           if(a[j]==1)
	           {
	            c++;
	           }
	       }
	       if(c>=4)
	       {
	           System.out.println("YES");
	       }else{
	           System.out.println("NO");
	       }
	}
}
}