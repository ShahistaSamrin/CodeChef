/* 4
20 50 2100 1900 6 6/input      no/output
50 20 1900 1900 5 5            no
20 20 1900 1900 1 6            no
27 27 1920 1920 3 3            yes     */
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
		    int x1=s.nextInt();
		    int x2=s.nextInt();
		    int y1=s.nextInt();
		    int y2=s.nextInt();
		    int z1=s.nextInt();
		    int z2=s.nextInt();
		    if(x2>=x1 && y2>=y1 && z2<=z1){
		    System.out.println("Yes");
		    }
		    else System.out.println("No");
		}

	}
}