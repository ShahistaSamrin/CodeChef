/*  5
1300 1500//input     yes//output
1201 1402            no
300 4000             no
723 805              yes
1330 512             no          */
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
		    if(c<=b+200 && c>=b){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}