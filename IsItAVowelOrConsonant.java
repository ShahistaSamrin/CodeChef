/* z/input  Consonant/output  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		char C=s.next().charAt(0);
		if(C=='A'||C=='E'||C=='I'||C=='O'||C=='U'){
		    System.out.println("vowel");
		}else System.out.println("Consonant");

	}
}