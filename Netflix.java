/*  4
1 1 1 3//input     no//output
2 3 1 5            yes
4 2 3 4            yes
2 1 4 7            no        */
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
		    if(e<=b+c || e<=c+d || e<=d+b){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}