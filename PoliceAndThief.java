/* 3
1 3/input     2/output 
2 1           1
1 1           0 */
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
            if(X>=Y){
                System.out.println(X-Y);
            }else{
                System.out.println(Y-X);
            }
        }
	}
}
