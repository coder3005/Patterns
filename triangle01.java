package Patterns;

import java.util.*;

public class triangle01 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of rows : ");
        int n=r.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                if((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        r.close();
    }
}
