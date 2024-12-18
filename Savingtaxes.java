/* 4
4 2//input    2
8 7           1
5 1           4
2 1           1     */
import java.util.*;
class Taxsaving
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  for(int i=0;i<t;i++)
	  {
	      int X=sc.nextInt();
	      int Y=sc.nextInt();
	      int c=X-Y;
	      System.out.println(c);
	  }

	}
}