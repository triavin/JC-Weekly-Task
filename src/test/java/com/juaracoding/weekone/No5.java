package com.juaracoding.weekone;

public class No5 {
    public static void main(String[] args) {
        // Deklarasi Variable buah dan angka
        String [] buah = {"nanas", "apel", "jeruk", "pisang", "semangka"};

        /*
         ==================================================
         | deklarasi array angka bertujuan untuk menyimpan |
         | nilai index buah dan untuk nilai angka terbesar |
         ==================================================|
         |      Index ke..   |         Isi variabel        |
         |-------------------------------------------------|
         |         0         |     index Variabel buah     |
         |         1         |     Jumlah Kata terbanyak   |
         ===================================================
         */

        int[] angka = new int[2];

        // Looping untuk mencari kata terpanjang
        for (int i = buah.length; i > 0; i--) {

            // membandingkan nilai pada variabel angka[1] dengan panjang kata dari variabel buah
            if(angka[1] < buah[i-1].length()){
                angka[0] = i-1;
                angka[1] = buah[i-1].length();
            }
        }

        // Mencetak nama buah dan nilai pada kata tersebut
        System.out.println("Buah dengan kata terpanjang adalah: " + buah[angka[0]]);
        System.out.println("Jumlah kata: " + angka[1]);
    }
}
