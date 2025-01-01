/* 3
5 3 4//input         YES//output
5 3 1                NO
5 5 0                YES    */
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
		    double X=s.nextDouble();
		    double Y=s.nextDouble();
		    double D=s.nextDouble();
		    double C;
		    if(X>Y){
		        C=X-Y;
		    }else{
		        C=Y-X;
		    }
		    if(C<=D){
		        System.out.println("YES");
		    }
		    else System.out.println("NO");
		}
	}
}