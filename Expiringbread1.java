/*  3
100 100 1//input  yes//output
9 2 5             yes 
19 6 3            no     */
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
		    if(d*c>=b){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}