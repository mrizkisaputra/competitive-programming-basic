package competitiveprogramming;

import java.util.Scanner;

public class CountCamelCaseCharacter {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /**
         * Teman Anda baru mengenal pemrograman.
         * Dia diberi tugas di sekolah untuk menemukan jumlah total huruf dalam kasus unta di string S . Bantu teman Anda melakukannya.
         *
         * Input:
         * Baris pertama masukan berisi bilangan bulat T , yang menunjukkan jumlah kasus uji.
         * Untuk setiap testcase akan ada satu baris yang berisi string S sebagai input.
         *
         * Output:
         * Untuk setiap testcase di baris baru, cetak jumlah karakter case unta dalam string.
         *
         * Batasan:
         * 1 <= T <= 15
         * 1 <= | S | <= 100
         *
         * Contoh:
         * Input:
         * 3
         * ckjkUUYII
         * HKJT
         * njnnk
         *
         * Keluaran:
         * 5
         * 4
         * 0
         */


        /**
         * Code mrizkisaputra 2020-11-14
         */
        CountCamelCase();

    }

    private static void CountCamelCase() {
        System.out.print("size : ");
        int size = scan.nextInt();

        if (size <= 15) {
            while (size-- >= 1) {
                System.out.print("input : ");
                String str = scan.next();
                int value = 0;

                for (var i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                        value++;
                    }
                }
            System.out.println(value);
            }
        } else {
            System.out.println("error");
        }

    }
}