/*  4
1 2 3 4 //input  overFlow
10 70 10 6       filled
2 100 4 3        unfilled
3 3 2 1          overflow   */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int e=sc.nextInt();
		    if(c-b>d*e){
		        System.out.println("unfilled");
		    }else if (c-b==d*e){
		        System.out.println("filled");
		    }else{
		        System.out.println("overflow");
		    }
		}
	}
}