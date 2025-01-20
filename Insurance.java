/* 4
5 3/input      3/output
5 8            5
4 4            4
15 12          12  */
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
                System.out.println(Y);
            }else{
                System.out.println(X);
            }
        }
	}
}