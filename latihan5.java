package com.belajar;
import java.util.Scanner;
public class latihan5 {

    public static void main(String[] args) {
        //Mengolah Input Data Sederhana
        //Menggunakan Class Scanner
        int id, nama;
        String alamat, keluhan;
        Scanner Input = new Scanner(System.in);
        System.out.println("data pasien");
        System.out.println("------------");
        System.out.println("id");
        id = Input.nextInt();
        System.out.println("nama : ");
        nama = Input.nextInt();
        System.out.println("alamat : ");
        alamat = Input.next();
        System.out.println("keluhan : ");
        keluhan = Input.next();
        //Menampilkan Data Siswa
        System.out.println("data pasiem");
        System.out.println("------------");
        System.out.println("id : + id");
        System.out.println("nama : " + nama);
        System.out.println("alamat : " + alamat );
        System.out.println("keluhan : " + keluhan);
    }
}
    