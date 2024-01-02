package com.yasar;

public class P_003 {
    public static void main(String[] args) {
        long s1 = 600851475143L;
        int primeFactor = 0;
        for (int i = 2; i <= s1; i++) {
            if (s1 % i == 0) {
                s1 /= i;
                primeFactor = i;
            }
        }
        System.out.println("The largest prime factor is ... : " + primeFactor);
    }
}
