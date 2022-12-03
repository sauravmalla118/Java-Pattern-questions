package com.college.pattern;

public class Pattern7 {
    public static void main(String[] srv) {
        int row = 5;
        for(int i=1 ; i<=row ; ++i) {
            for(int j=1 ; j<=row+1-i ; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
