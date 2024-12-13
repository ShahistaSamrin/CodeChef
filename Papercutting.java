/*  3//input  
    5 1            25//output
    2 2            1
    5 2            4  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String args[]) throws java.lang.Exception
    {
        // your code goes here
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(a/b)*(a/b);
        System.out.println(c);
    }
    }
} 