/* 4//no.of input
   5 2//input   3//output 
   3 3          0 
   5 4          1
   7 5          2 */
import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            int X=s.nextInt();
            System.out.println(N-X);
        }
    }
}