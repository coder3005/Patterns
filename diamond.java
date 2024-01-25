package Patterns;

import java.util.*;

public class diamond {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of rows :  ");
        int n=r.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=n;j>i;j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--) {
            for(int j=n;j>i;j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        r.close();
    }
}
