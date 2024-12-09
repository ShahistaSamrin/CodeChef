/*  4      
    97     YES
    42     NO
    80     YES
    10     NO  */

import java.util.*;
class BatteryHeaith
{
	public static void main (String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int i=0;i<T;i++){
	        int X=s.nextInt();
	        if(X>=80 && X<=100)
	        {
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }

	}
}