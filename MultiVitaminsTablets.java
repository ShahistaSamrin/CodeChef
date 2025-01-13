/* 4
1 10/input  YES/output
12 0        NO
10 29       NO
10 30       YES  */
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
            if(3*X<=Y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}