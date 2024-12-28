/*   3
4//input      YES//output
7             NO
10            NO   */
import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int X=s.nextInt();
            if(X<7){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}