/* 5
0 0 0//input          Water filling time//output
1 1 1                 Not now
1 1 0                 Not now
0 1 0                 Water filling time
0 1 1                 Not now     */
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
		    if((b==0 && c==0)||(d==0 && c==0)||(b==0 && d==0)){
		        System.out.println("Water filling time");
		    }else{
		        System.out.println("Not now");
		    }
		}
	}
}