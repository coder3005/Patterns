package Patterns;

import java.util.*;

public class hollowstar {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of rows : ");
        int n=r.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n+1;j++) {
                if(i==0 || i==n-1 || j==0 || j==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        r.close();
    }
}
