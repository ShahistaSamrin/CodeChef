/*  4
500 500//input       Online//output
500 400              Dining
25 22                Dining
100 90               Either  */
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
	        int N=s.nextInt();
	        int M=s.nextInt();
	        double D;
	        D=(double)(N-(N*0.1));
	        if(D<M){
	            System.out.println("Online");
	        }else if(D==M){
	            System.out.println("Either");
	    }else{
	        System.out.println("Dining");
	    }

	}
}
}