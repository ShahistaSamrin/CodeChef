/*  3 
53 0.6 5602//input            10//output
45 0 4500                     6
0 0 0                         6 */
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
		    double H=s.nextDouble();
		    double C=s.nextDouble();
		    double TS=s.nextDouble();
		    if(H>50 && C<0.7 && TS>5600){
		        System.out.println("10");
		    }else if(H>50 && C<0.7){
		        System.out.println("9");
		    }else if(C<0.7 && TS>5600){
		        System.out.println("8");
		    }else if(H>50 && TS>5600){
		        System.out.println("7");
		    }else if(H>50 || C<0.7 || TS>5600){
		        System.out.println("6");
		    }else System.out.println("5");
		}
	}
}