/* 4
49 100//input    Z//output
49 49            Z
50 49            F
50 50            A     */
import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++){
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    if(X<50){
		        System.out.println("Z");
		    }else if(Y<50 && X>=50){
		        System.out.println("F");
		    }else{
		        System.out.println("A");
		    }
		}

	}
}