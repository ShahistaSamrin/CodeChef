import java.util.*;
import java.lang.*;
import java.io.*;
class GoodTurn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int X = s.nextInt();
            int Y = s.nextInt();
            if (X + Y > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    
    }
}
