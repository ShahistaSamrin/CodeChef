/*  
B//input           BattleShip//output
c                  Cruiser
D                  Destroyer     */
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
		    char A=s.next().charAt(0);
		    if(A=='B'|| A=='b'){
		        System.out.println("BattleShip");
		    }else if(A=='C'|| A=='c'){
		        System.out.println("Cruiser");
		    }
		    else if(A=='D'|| A=='d'){
		        System.out.println("Destroyer");
		}else{
		    if(A=='F'|| A=='f')
		        System.out.println("Frigate");
		}

	}
}
}