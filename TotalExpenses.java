/* 
100 120/input         12000.000000/output
10 20                 200.000000
1200 20               21600.000000   */
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
		    int quantity=s.nextInt();
		    int price=s.nextInt();
		    double totalexpenses;
		    double discount;
		    if(quantity>1000){
		        discount=price*0.1;
		        totalexpenses=(double)((price-discount)*quantity);
		    }else{
		        totalexpenses=(double)(price*quantity);
		    }
		    System.out.printf("%.6f\n",totalexpenses);
		}

	}
}