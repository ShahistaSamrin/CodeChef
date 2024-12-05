import java.util.*;
import java.lang.*;
import java.io.*;

class Writingspeed
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int X=s.nextInt();
        int Y = 5 * X;
        if (Y<= 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	    
	}
}