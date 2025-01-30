/* 4
30 35 25/input     Yes/output 
30 35 40           No
30 35 35           Yes
30 25 35           No */
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
            if((B>=A) && (B>=C)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
	}
}