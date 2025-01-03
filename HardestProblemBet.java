/*  3
1 4 2//input          Draw//output
16 8 10               Bob
14 15 9               Alice  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int i=0;i<T;i++){
	        int A=s.nextInt();
	        int B=s.nextInt();
	        int C=s.nextInt();
	        if(C<A && C<B){
	            System.out.println("Alice");
	        }else if(B<A && B<C){
	            System.out.println("Bob");
	        }else  System.out.println("Draw");
	    }

	}
}