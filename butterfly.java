package Patterns;

import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of rows : ");
        int n=r.nextInt();
        int l=n*2-2;
        int k;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            for(k=l;k>i;k--) {
                System.out.print("  ");
            }
            l--;
            for(int j=i;j>=0;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            for(int j=n;j>=i;j--) {
                System.out.print("* ");
            }
            for(k=1;k<2*i-1;k++) {
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        r.close();
    }
}
