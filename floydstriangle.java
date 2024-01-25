package Patterns;

import java.util.*;

public class floydstriangle {
    public static void main(String[] args) {
        Scanner r=new  Scanner(System.in);
        System.out.print("enter no. of rows : ");
        int n=r.nextInt();
        int l=1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
        r.close();
    }
}
