/*  3
10 5/input   Solution/output
0 3          liquid
3 0          Solid   */
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
		    if(A>0 && B>0){
		        System.out.println("Solution");
		    }else if(A>0 && B==0){
		        System.out.println("Solid");
		    }else{
		        if(A==0 && B>0){
		        System.out.println("liquid");
		    }
		    }
		}

	}
}