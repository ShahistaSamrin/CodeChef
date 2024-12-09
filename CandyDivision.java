/*  4  //input
3    
YES
4 
NO
2
NO
6
YES  */
import java.util.*;
class CandyDivision
{
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int i=0;i<T;i++){
	        int N=s.nextInt();
	        if(N%3==0)
	        {
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }

	}
}