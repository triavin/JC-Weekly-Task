package com.juaracoding.weekone;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        // Deklarasi Variabel Qty dan Harga
        int qty, harga;

        // Memberikan nilai pada variabel
        qty = 2;
        harga = 10000;

        // Cetak Nilai Qty, Harga dan Jumlah
        System.out.println("Qty: " + qty);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + qty * harga);

        // Input nilai dengan menggunakan scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nilai Qty: ");
        qty = scanner.nextInt();
        System.out.print("Masukan Nilai Harga: ");
        harga = scanner.nextInt();

        // Cetak Nilai Qty, Harga dan Jumlah
        System.out.println("Qty: " + qty);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + qty * harga);
    }
}
