package com.college.pattern;

public class Pattern5 {
    public static void main(String[] srv) {
        int row = 4;
        for(int i=1 ; i<=row ; ++i) {
            for(int j=1 ; j<=row-i ; ++j) {
                System.out.print("  ");
            }
            for(int j=1 ; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
