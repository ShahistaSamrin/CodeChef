/*  10 5 4//input    NO//output   */
import java.util.*;
import java.lang.*;
import java.io.*;

class Approximateanswer
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        int K=s.nextInt();
        if(Math.abs(X-Y)==K){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
}