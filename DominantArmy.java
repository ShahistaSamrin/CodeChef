/* 4
15 5 6/input      YES/output  
12 13 16          NO
1 1 100           YES
10 10 20          NO  */
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
            int NA=s.nextInt();
            int NB=s.nextInt();
            int NC=s.nextInt();
            if(NA>NB+NC||NB>NA+NC||NC>NA+NB)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}