/*  3
100 1000//input  REPAIR
10000 5000       NEW PHONE
3000 3000        ANY  */
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
		    if(b<c){
		        System.out.println("repair");
		    }else if(b==c){
		        System.out.println("any");
		    }else{
		        System.out.println("new phone");
		    }
		}
	}
}