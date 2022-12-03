package com.college.pattern;

public class Pattern13 {
    public static void main(String[] sr) {
        int row=5;
        for(int i=1 ; i<=row ; ++i) {
            for(int j=1 ; j<=row-i ; ++j) {
                System.out.print("  ");
            }
            for(int j=i ; j>=2 ; --j) {
                System.out.print(j + " ");
            }
            for(int j=1 ; j<=i ; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
