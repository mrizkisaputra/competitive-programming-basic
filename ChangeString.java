package competitiveprogramming;

import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args) {

        /**
         * Diberikan string S, tugasnya adalah mengubah string sesuai kondisi,
         * Jika huruf pertama dalam sebuah string adalah huruf kapital maka ubah string penuh menjadi huruf kapital,
         * jika tidak ubah string penuh menjadi huruf kecil.
         *
         * Masukan:
         * Baris pertama masukan berisi bilangan bulat T yang menunjukkan jumlah kasus uji.
         * Kemudian kasus uji T mengikuti. Setiap kasus uji berisi string S.
         *
         * Hasil:
         * Untuk setiap kasus uji, cetak string yang diubah di baris baru.
         *
         * Batasan:
         * 1 <= T <= 200
         * 1 <= | panjang tali | <= 10 4
         *
         * Contoh:
         * Input:
         * 2
         * Geeks
         * foR
         * Output:
         * GEEKS
         * for
         */

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        while (T <= 200 && T != 0) {
            String str = scan.next(); // Geeks
            System.out.println((str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') ? str.toUpperCase() : str.toLowerCase());
            T--;
        }
    }
}
