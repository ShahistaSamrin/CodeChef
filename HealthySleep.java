/*  2
    less  */
import java.util.*;
class HealthySleep{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int H=s.nextInt();
        if(H>=1 & H<=24)
        {
            if(H<8){
                System.out.println("less");
            }else if(H==8){
                System.out.println("perfect");
            }else{
                System.out.println("more");
            }
        }
    }
}