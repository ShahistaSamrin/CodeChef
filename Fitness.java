/* 4
   1//input   10
   3          30
   7          70
   10         100  */

import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T= scanner.nextInt();
        for(int i=0;i<T;i++){
            int X=scanner.nextInt();
            System.out.println(X*10);
        }
    }
}