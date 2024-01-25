package Patterns;

import java.util.*;

public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter no. of rows : ");
        int n=r.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        r.close();
    }
}
