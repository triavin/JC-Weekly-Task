package com.juaracoding.weekone;


// import java.util.Calendar;

public class No3 {
    public static void main(String[] args) {
        // deklarasi variabel hari dan harga

        int [] harga = {30000,45000};
        String [] hari = {"senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

         // mencari nilai variabel day menggunakan calendar
//        Calendar calendar = Calendar.getInstance();
//        int day = calendar.get(Calendar.DAY_OF_WEEK);

         // menentukan nilai harga
//        if (day >= 1){
//            if (day == 1 || day == 7){
//                System.out.println("Harga: " + harga[1]);
//                continue;
//            }
//            System.out.println("Harga: " + harga[1]);
//        }

        System.out.println(hari.length);
        for (int i = hari.length; i > 0; i--) {
            // Mencetak Hari
            System.out.println("Hari: " + hari[i-1]);

            // mencetak nilai harga
            if(i <= 5){
                System.out.println("Harga Tiket: " + harga[0]);
                continue;
            }

            // mencetak nilai harga
            System.out.println("Harga Tiket: " + harga[1]);
        }

        for (String i : hari) {
            // Mencetak Hari
            System.out.println("Hari: " + i);

            // mencetak nilai harga
            if(i.equals("Sabtu") || i.equals("Minggu")){
                System.out.println("Harga Tiket: " + harga[1]);
                continue;
            }

            // mencetak nilai harga
            System.out.println("Harga Tiket: " + harga[0]);
        }
    }
}
