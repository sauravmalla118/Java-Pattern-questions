package com.college.pattern;

public class Pattern11 {
    public static void main(String[] srv) {
        int row=5;
        for(int i=1 ; i<=row ; ++i) {
            for(int j=1 ; j<=row-i ; ++j) {
                System.out.print("  ");
            }
            for(int j=1 ; j<=row ; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
