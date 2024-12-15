/*  255 230//input  New//output   */
import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int Y=s.nextInt();
		if(X<Y){
		    System.out.println("Old");
		}
		else if(X==Y){
		    System.out.println("Same");
		}else{
		    System.out.println("New");
		}
	}
}