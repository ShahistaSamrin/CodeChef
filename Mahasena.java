/*  1
1//input      NOT READY//output  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int A[]=new int[N];
		int count=0;
		int count1=0;
		for(int i=0;i<N;i++){
		    A[i]=s.nextInt();
		    if(A[i]%2==0){
		        count++;
		    }else{
		        count1++;
		    }
		}
		if(count>count1){
		    System.out.println("READY FOR BATTLE");
		}else System.out.println("NOT READY");


	}
}