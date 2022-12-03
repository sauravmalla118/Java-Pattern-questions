package com.college.pattern;

public class Pattern1 {
    public static void main(String[] srv) {
        int row = 4 , column = 5;
        for(int i=1; i<=row ; ++i) {
            for(int j=1 ; j<=column ; ++j) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
