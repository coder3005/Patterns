package Patterns;

import java.util.*;

public class palindromic {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of rows : ");
        int n=r.nextInt();
        for(int i=0;i<n;i++) {
            for(int k=n-1;k>i;k--) {
                System.out.print("  ");
            }
            for(int j=i+1;j>=1;j--) {
                System.out.print(j+" ");
            }
            if(i>0) {
            for(int l=2;l<=i+1;l++) {
                if(l==n+1) {
                    continue;
                }
                System.out.print(l+" ");
            }
        }
            System.out.println();
        }
        r.close();
    }
}
