package competitiveprogramming;

import java.util.Scanner;

public class LargestElementArrays {
    public static void main(String[] args) {

        /**
         * Mengingat array a [] ukuran N . Tugas anda adalah menemukan elemen terbesar di dalamnya.
         *
         * Masukan:
         * Baris pertama masukan berisi bilangan bulat T, yang menunjukkan jumlah kasus uji.
         * Kemudian kasus uji T mengikuti. Setiap kasus uji berisi bilangan bulat N, jumlah elemen dalam larik.
         * Kemudian baris berikutnya berisi N bilangan bulat dari array yang dipisahkan oleh spasi.
         *
         * Output:
         * Cetak elemen maksimum dalam array.
         *
         * Batasan:
         * 1 <= T <= 100
         * 1 <= N <= 100
         * 1 <= a [i] <= 10 3
         *
         * Contoh:
         * Input:
         * 2
         * 5
         * 10324 45 90 9808
         * 7
         * 1 2 0 3 2 4 5
         *
         * Keluaran:
         * 9808
         * 5
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("input kasus uji t : ");
        int T = scan.nextInt();

        for (;T <= 100 && T != 0; T--) {
            System.out.print("input jumlah array N : ");
            int N = scan.nextInt();
            if (N <= 100) {
                int[] arr = new int[N]; // [124, 1032, 34503, 100, 450]
                int largest = 0;
                for (var i = 0; i < arr.length; i++) {
                    arr[i] = scan.nextInt();
                    if (arr[i] > largest) {
                        largest = arr[i];
                    }
                }
                System.out.println(largest);
            }
        }

        

    }
}
