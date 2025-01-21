/* 3
10 10/input     1/output
20 4            0
70 7            4        */
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
            int X=s.nextInt();
            int Y=s.nextInt();
            X=X*Y;
            if(X>=100){
                System.out.println(X/100);
            }else{
                System.out.println(0);
            }
        }
	}
}