package Patterns;

import java.util.*;

public class invertedrotatedhalfpyramid {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of  rows : ");
        int n=r.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=n-1;j>i;j--) {
                System.out.print("  ");
            }
            for(int k=i;k>=0;k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        r.close();
    }
}
