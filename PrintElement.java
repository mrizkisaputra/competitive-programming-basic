package competitiveprogramming;

import java.util.Scanner;

public class PrintElement {
    public static void main(String[] args) {

        /**
         * Mengingat array A [] dari N bilangan bulat dan indeks saya.
         * Tugas Anda adalah mencetak elemen yang ada di indeks I dalam array.
         *
         * Masukan:
         * Baris pertama masukan berisi bilangan bulat T, yang menunjukkan jumlah kasus uji.
         * Untuk setiap testcase, akan ada dua baris. Baris pertama berisi dua bilangan bulat yang dipisahkan spasi N dan I,
         * di mana N menunjukkan jumlah elemen dalam larik dan I menunjukkan indeks yang elemennya harus dicetak,
         * dan baris kedua berisi bilangan bulat yang dipisahkan spasi N yang menunjukkan elemen larik.
         *
         * Output:
         * Untuk setiap testcase di baris baru, cetak elemen yang ada di indeks I.
         *
         * Batasan:
         * 1 <= T <= 10
         * 1 <= N <= 100
         * 0 <= I <= N - 1
         * 1 <= A [i] <= 100
         *
         * Contoh:
         * Input:
         * 2
         * 5 2
         * 10 20 30 40 50
         * 7 4
         * 10 20 30 40 50 60 70
         *
         * Hasil:
         * 30
         * 50
         */

        /**
         * Code mrizkisaputra 2020-11-20
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("input tescae T : ");
        int T = scan.nextInt();
        while (T <= 10 && T != 0) {
            System.out.print("input N : ");
            int N = scan.nextInt();
            System.out.print("input I : ");
            int I = scan.nextInt();
            int[] A = new int[N];
            if (N <= 100) {
                for (int i = 0; i < N; i++) {
                    A[i] = scan.nextInt();
                }
                if (I <= N-1) {
                    System.out.println(A[I]);
                }
            }
        T--;
        }
    }
}
