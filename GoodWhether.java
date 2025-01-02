/* 4
1 0 1 0 1 1 1//input        Yes//output
0 1 0 0 0 0 1               No
1 1 1 1 1 1 1               Yes
0 0 0 1 0 0 0               No  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int j=0;j<T;j++){
		    int A[]=new int[7];
		    int Sunnydays=0;
		    int rainydays=0;
		    for(int i=0;i<7;i++){
		    A[i]=s.nextInt();
		    }for(int i=0;i<7;i++){
		        if(A[i]==0){
		            Sunnydays++;
		        }else
		        rainydays++;
		    }if(Sunnydays>=rainydays) System.out.println("No");
		    else System.out.println("Yes");
		}

	}
}