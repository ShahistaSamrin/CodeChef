/* 4
4 1 1/input    0/output
2 10 7         6
8 5 4          8
9 7 0          83  */
import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            int Q=s.nextInt();
            int P=s.nextInt();
            System.out.println((Q-P)*X);
        }
    }
}