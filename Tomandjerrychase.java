import java.util.*;
class Tomandjerrychase
{
	public static void main (String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int i=0;i<T;i++){
	        int X=s.nextInt();
	        int Y=s.nextInt();
	        if(X>=1 && Y<=10){
	            if(Y>X){
	            System.out.println("YES");
	        }else{
	        System.out.println("No");
	        }
	    }
	}
}
}