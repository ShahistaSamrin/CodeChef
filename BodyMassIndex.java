/* 3
72 2//input       1//output
80 2              2
120 2             4   */
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
		    int M=s.nextInt();
		    int H=s.nextInt();
		    int BMI=M/(H*H);
		    if(BMI<=18){
		        System.out.println("1");
		    }else if(BMI>18 && BMI<=24){
		        System.out.println("2");
		    }else if(BMI>24 && BMI<=29){
		        System.out.println("3");
		    }else{
		        System.out.println("4");
		    }
		}

	}
}