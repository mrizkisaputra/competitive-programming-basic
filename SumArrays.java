package competitiveprogramming;

import java.util.Scanner;

public class SumArrays {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /**
         * Diketahui array bilangan bulat A berukuran N , temukan jumlah elemen di dalamnya.
         *
         * Input:
         * Baris pertama berisi bilangan bulat yang menunjukkan kasus uji 'T'.
         * Kasus uji T mengikuti. Setiap testcase berisi dua baris input.
         * Baris pertama berisi N ukuran array A . Baris kedua berisi elemen dari array.
         *
         * Output:
         * Untuk setiap testcase, cetak jumlah semua elemen array di baris terpisah.
         *
         * Batasan:
         * 1 <= T <= 100
         * 1 <= N <= 100
         * 1 <= Ai <= 100
         *
         * Contoh:
         * Input:
         * 2
         * 3
         * 3 2 1
         * 4
         * 1 2 3 4
         * Output:
         * 6
         * 10
         */


        /**
         * Code mrizkisaputra 2020-11-16
         */
        System.out.print("input banyaknya array : ");
        int T = scan.nextInt();

        if (T <= 100) {
            while (T-- > 0) {
                System.out.print("input panjang elemen array : ");
                int N = scan.nextInt();
                int[] A = new int[N];
                if (N <= 100) {
                    int countElemenA = 0;
                    for (var i = 0; i < A.length; i++) {
                        System.out.print("elemen "+i+" : ");
                        A[i] = scan.nextInt();
                        countElemenA += A[i];
                    }
                    System.out.println(countElemenA);
                } else {
                    System.err.print("max N 100");
                }
            }
        } else {
            System.err.print("max T 100");
        }

    }
}
