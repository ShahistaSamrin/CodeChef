/*  5
9 100 100     fail//output
30 40 50      pass
30 20 40      fail
0 98 8        fail
90 80 80      pass   */
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
		    if(b>=10 && c>=10 && d>=10){
		        if(b+c+d>=100){
		            System.out.println("pass");
		        }else{
		            System.out.println("fail");
		        }
		    }else{
		        System.out.println("fail");
		    }
		}
	}
}