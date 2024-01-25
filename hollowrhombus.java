package Patterns; 

import java.util.*;

public class hollowrhombus {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of rows : ");
        int n=r.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=n;j>i;j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++) {
                if(i==1 || i==n || k==1 || k==n) {
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
