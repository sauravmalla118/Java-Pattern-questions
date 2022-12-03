package com.college.pattern;

public class Pattern2 {
    public static void main(String[] srv) {
        int row = 4 , column = 5;
        for(int i=1 ; i<=row ; ++i) {
            for(int j=1 ; j<=column ; ++j) {
                if(i==1 || i==row || j==1 || j==column) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
