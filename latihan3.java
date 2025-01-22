package com.belajar;

public class latihan3 {
   // menggunakan operator logika
   public static void main(String[] args) {
    int A = 70;
    int B = 80;
    int C = 90;
    boolean a = A > B && B < C || C < B;
    boolean b = A < B || B < C && C < B;
    System.err.println(a);
    System.out.println(b);
   }
}
