package competitiveprogramming;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        /**
         * Tukar diberi dua angka dan cetak. (Coba lakukan tanpa variabel sementara.)
         *
         * Input:
         * Baris pertama berisi integer, jumlah kasus uji 'T'.
         * Setiap kasus uji harus mengandung dua bilangan positif a dan b.
         *
         *
         * Output:
         * Cetak 2 angka setelah bertukar.
         *
         *
         * Batasan:
         * 1 <= T <= 100
         * 1 <= a <= 10 6
         * 1 <= b <= 10 6
         *
         *
         * Contoh:
         * Input:
         * 2
         * 20 30
         * 12 32
         *
         * Keluaran:
         * 30 20
         * 32 12
         */

        /**
         * Code mrizkisaputra 2020-11-21
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("input uji kasus T : ");
        int T = scan.nextInt();

        //solution 1
        while (T <= 100 && T != 0) {
            int a = scan.nextInt(); //20
            int b = scan.nextInt(); //30
            if (a <= 1_000_000 && b <= 1_000_000) {
                a = a + b; // a=50 b=30
                b = a - b; // b=20 a=50
                a = a - b; // a=30 b=20
                System.out.format("%d,%d\n",a,b); // a=30 b=20
            }
            T--;
        }

        //solution 2
        while (T <= 100 && T != 0) {
            int a = scan.nextInt(); //20
            int b = scan.nextInt(); //30
            System.out.println((a <= 1_000_000 && b <= 1_000_000) ? b+" "+a : "max value 1.000.000");
            T--;
        }

    }
}
