/* 2
21//input  hot//output 
16         cold          */

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
		    if(b>20)
		    {
		        System.out.println("hot");
		    }else{
		        System.out.println("cold");
		    }
		}
	}
}