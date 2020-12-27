package competitiveprogramming;

import java.util.Scanner;

public class MultipleArrays {
    public static void main(String[] args) {

        /**
         * Hitung produk dari semua elemen dalam larik.
         *
         * Masukan:
         * Baris pertama masukan berisi bilangan bulat T yang menunjukkan jumlah kasus uji.
         * Kemudian kasus uji T mengikuti. Setiap kasus uji terdiri dari dua baris. Baris pertama dari setiap kasus uji berisi bilangan bulat N.
         * Baris kedua dari setiap kasus uji berisi bilangan bulat terpisah spasi N yang menunjukkan elemen dari larik A [] .
         *
         * Output:
         * Untuk setiap kasus uji di baris baru mencetak produk dari semua elemen.
         *
         * Batasan:
         * 1 ≤ T ≤ 50
         * 1 ≤ N ≤ 10
         * 1 ≤ A [i] ≤ 5
         *
         * Contoh:
         * Input:
         * 2
         * 5
         * 1 2 3 4 5
         * 10
         * 5 5 5 5 5 5 5 5 5 5
         *
         * Keluaran:
         * 120
         * 9765625
         */

        /**
         * Code mrizkisaputra 2020-11-20
         */



        Scanner scan = new Scanner(System.in);

        System.out.print("input kasus uji T : ");
        int T = scan.nextInt();
        while (T <= 50 && T != 0) {
            System.out.print("input N :");
            int N = scan.nextInt();
            if (N <= 10) {
                int[] A = new int[N];
                int product = 1;
                if (A.length <= 5) {
                    for (int i = 0; i < A.length; i++) {
                        A[i] = scan.nextInt();
                        product *= A[i];
                    }
                    System.out.println(product);
                } else {
                    for (int i = 0; i < A.length; i++) {
                        A[i] = scan.nextInt();
                        product *= A[i];
                    }
                    System.out.println(product);
                }
            }
            T--;
        }

    }
}
