/* 4
1 2 3 4/input    Yes/output 
4 3 2 1          No
2 18 9 4         Yes
1 100 2 49       No     */
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
            int X=s.nextInt();
            int Y=s.nextInt();
            A=A*B;
            X=X*Y;
            if(A<=X){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
	}
}