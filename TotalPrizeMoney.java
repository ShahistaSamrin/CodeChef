/* 4  
1000 100//input   19000//output
1000 1000         100000
80 1              890
400 30            6700  */
import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            int Y=s.nextInt();
            System.out.println(10*X+90*Y);
        }
    }
}