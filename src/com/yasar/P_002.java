package com.yasar;

public class P_002 {
    public static void main(String[] args) {
        int s1 = 0, s2 = 1, fiboSum = 1, total = 0;
        while (fiboSum < 4000000) {
            s1 = s2;
            s2 = fiboSum;
            fiboSum = s1 + s2;
            if (fiboSum % 2 == 0) {
                total += fiboSum;
            }
        }
        System.out.println("Total... : " + total);
    }
}
