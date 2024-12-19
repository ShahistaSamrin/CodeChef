/*4
35//input   60//output
54          50
80          20
12          90   */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++)
        {
            int n=sc.nextInt();
            int x=100;
            int r=n%10;  
            if((r>=0)&&(r<=4))
            {
                n=n-r;
               
            }
            else if(r>=5) 
            {   
                int y=10-r;
                n=n+y;
             
            }
            n=x-n;
            System.out.println(n);
        }

	}
}