/* 3
1 3/input     2/output
2 4           2
3 10          7   */
import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int G=s.nextInt();
            int B=s.nextInt();
            System.out.println(B-G);
        }
    }
}