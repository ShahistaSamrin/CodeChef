/* 4
40 60//input 60
67 55        67
50 50        50
1 100        100    */
import java.util.*;
class Bestoftwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    if(X>=Y){
		        System.out.println(X);
		    }
		    else{
		        System.out.println(Y);
		    }
		}

	}
}