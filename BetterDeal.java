/*  4
5 20//input    FIRST//output
10 60          SECOND 
7 7            FIRST
10 55          BOTH   */
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
        int s1,s2;
        s1=(100/100)*A;
        s2=(200/100)*B;
        if((100-s1)<(200-s2)){
            System.out.println("FIRST");
        }else if((100-s1)==(200-s2)){
            System.out.println("BOTH");
            }else{
            System.out.println("SECOND");
        }

	}
}
}