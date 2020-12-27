package competitiveprogramming;

import java.util.Scanner;

public class LowercaseToUppercase {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /**
         * Diberikan string yang hanya berisi huruf kecil, buat string dengan huruf yang sama, tetapi dalam huruf besar.
         *
         * Masukan:
         * Baris masukan pertama berisi satu bilangan bulat T yang menunjukkan jumlah kasus uji.
         * Kemudian  kasus uji T mengikuti. Setiap kasus uji terdiri dari satu baris. Baris pertama dari setiap kasus uji terdiri dari sebuah string.
         *
         * Output:
         * Sesuai dengan setiap test case, di baris baru, cetak string dalam huruf besar.
         *
         * Batasan:
         * 1 ≤ T ≤ 100
         * 1 ≤ panjang string ≤ 50
         *
         * Contoh:
         * Masukkan
         * 2
         * geeks
         * geeksforgeeks
         *
         * Keluaran
         * GEEKS
         * GEEKSFORGEEKS
         */


        System.out.print("input kasus uji : ");
        int T = scan.nextInt();

        while (T <= 100 && T != 0) {
            System.out.print("input string : "); //geeks
            String str = scan.next();
            System.out.println((str.length() <= 50) ? str.toUpperCase() : "max string 50");
        T--;
        }

    }
}
