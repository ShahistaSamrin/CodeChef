/*  4 /input    
200 100 400           Charlie/output
155 1000 566          Bob
736 234 470           Alice
124 67 2              Alice   */
import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int A=s.nextInt();
            int B=s.nextInt();
            int C=s.nextInt();
            if(A>B && A>C){
                System.out.println("Alice");
            }else if(B>A && B>C){
                System.out.println("Bob");
            }else{
                System.out.println("Charlie");
            }
        }
    }
}
