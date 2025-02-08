/* 3
10 12 11/input   Train/output
3 5 15           PlaneBus
9 4 13           Equal   */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    int Z=s.nextInt();
		    if((X+Y)<Z) System.out.println("PlaneBus");
		    else if((X+Y)==Z) System.out.println("Equal");
		    else System.out.println("Train");
		}
	}
}