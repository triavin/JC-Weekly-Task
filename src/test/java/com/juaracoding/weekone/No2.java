package com.juaracoding.weekone;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        // Deklarasi Variabel kalimat
        String kalimat;

        // input nilai pada variabel kalimat
        kalimat = "Java Juara";

        // Cetak Jumlah karakter pada variable kalimat
        System.out.println(kalimat.length());
        // Cetak karakter pada variable kalimat menjadi huruf kapital
        System.out.println(kalimat.toUpperCase());
        // Cetak karakter pada variable kalimat menjadi huruf kecil
        System.out.println(kalimat.toLowerCase());
        // Cetak tiga karakter terakhir pada variable kalimat
        System.out.println(kalimat.substring((kalimat.length() - 3)));


        // input nilai pada variabel kalimat dengan scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Kalimat: ");
        kalimat = scanner.nextLine();

        // Cetak Jumlah karakter pada variable kalimat
        System.out.println(kalimat.length());
        // Cetak karakter pada variable kalimat menjadi huruf kapital
        System.out.println(kalimat.toUpperCase());
        // Cetak karakter pada variable kalimat menjadi huruf kecil
        System.out.println(kalimat.toLowerCase());
        // Cetak tiga karakter terakhir pada variable kalimat
        System.out.println(kalimat.substring((kalimat.length() - 3)));

    }
}
