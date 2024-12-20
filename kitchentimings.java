/* 4
1 2//input  1//output
3 7         4
9 11        2
2 10        8 */
Explanatio
import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t!=0)
	  {
	      int x=sc.nextInt();
	      int y=sc.nextInt();
	      int count=0;
	      if(x>=1 && x<=12 && y>=1 && y<=12)
	      {
	      for(int i=x;i<y;i++)
	      {
	       count++;  
	       }
	      }
	      System.out.println(count);
	      t--;
    }
  }
}