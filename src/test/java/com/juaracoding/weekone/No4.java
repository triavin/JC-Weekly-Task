package com.juaracoding.weekone;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        // deklarasi variabel hari dan harga
        int angka;

        // Membuat scanner intuk input nilai
        Scanner scanner = new Scanner(System.in);

        // looping untuk terus meminta input nilai variabel angka hingga bertemu nilai 0
        while (true){

            // memasukan nilai variabel angka dengan scanner
            System.out.print("Masukan Angka: ");
            angka = scanner.nextInt();

            // memeriksa kondisi apakah nilai pada variabel angka bernilai 0
            if (angka == 0){
                // keluar dari looping
                break;
            }

            // mencetak nilai pada variable angka
            System.out.println("Angka adalah: " + angka);
        }
    }
}
