/*  10 6/input   NEWBIE/output   */
import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		if(M<=N){
		  if(M>=((N+1)/2))
		   {
		    System.out.println("NEWBIE");
		}else{
		    System.out.println("PRO");
		}
	}
}
}