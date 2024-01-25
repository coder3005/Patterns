package Patterns;

import java.util.*;

public class numberpyramid {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter  no. of rows : ");
        int n=r.nextInt();
        for(int i=1;i<=n;i++) {
            for(int k=n;k>i;k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        r.close();
    }
}
