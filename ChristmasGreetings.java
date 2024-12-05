import java.util.*;
import java.lang.*;
import java.io.*;

class ChristmasGreetings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
        int X=s.nextInt();
            if(X==25)
            {
                System.out.println("Christmas");
            }
            else
            {
                System.out.println("Ordinary");
            }
        s.close();
    }
}

