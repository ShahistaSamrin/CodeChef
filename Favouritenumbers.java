/*  8
7//input   Charlie//output
14         Alice
21         Charlie 
18         Charlie
27         Bob
63         Bob
126        Alice
8          Charlie  */
import java.util.Scanner;
class codechef{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            if(a%2==0 && a%7==0){
                System.out.println("Alice");
            }else if(a%2==1 && a%9==0){
                System.out.println("Bob");
            }else{
                System.out.println("Charlie");
            }
        }
    }
}