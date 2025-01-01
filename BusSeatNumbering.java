/*  5 
6  //input         Lower Double//output
28                 Upper Single
16                 Upper Double
13                 Lower Single
10                 Lower Double  */
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
		    if(N>=1 && N<=10){
		        System.out.println("Lower Double");
		    }else if(N>10 && N<=15){
		        System.out.println("Lower Single");
		    }else if(N>15 && N<=25){
		    System.out.println("Upper Double");
		}else{
		    if(N>25 && N<=30){
		        System.out.println("Upper Single");
		    }
		}

	}
}
}