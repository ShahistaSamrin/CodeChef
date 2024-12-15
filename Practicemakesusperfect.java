/*  12 15 8 10//input   3//output  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int p[]=new int[4+1];
		int count=0;
		for(int i=1;i<=4;i++){
		 p[i]=s.nextInt();
		}
		 for(int i=1;i<=4;i++){
		     if(p[i]>=10){
		         count++;
		     }
		 }System.out.println(count);

	}
}