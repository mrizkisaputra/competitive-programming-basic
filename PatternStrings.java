package competitiveprogramming;

import java.util.Scanner;

public class PatternStrings {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        /**
         * Diberikan string dengan panjang N ,
         * cetak pola string dengan baris pertama dengan panjang string yang diberikan
         * dan tetap mencetak di baris baru string dalam urutan panjang yang menurun sampai Anda mencetak karakter pertama tunggal dari string yang diberikan.
         *
         * Input:
         * Baris pertama input berisi bilangan bulat T yang menunjukkan jumlah kasus uji.
         * Kemudian kasus uji T mengikuti. Setiap kasus uji hanya terdiri dari satu baris yang berisi string dengan panjang N.
         *
         * Output:
         * Sesuai dengan setiap kasus uji, pola dicetak di baris baru.
         *
         * Batasan:
         * 1 <= T <= 30
         * N = 5
         *
         * Contoh:
         * Input:
         * 2
         * Geeks
         * th% ik
         *
         * Output:
         * Geeks
         * Geek
         * Gee
         * Ge
         * G
         * th% ik
         * th% i
         * th%
         * th
         * t
         */


        /**
         * Code mrizkisaputra 2020-11-17
         */

        System.out.print("input T : ");
        int T = scan.nextInt();

        for (;T >= 1 && T <= 30; T--) {
            System.out.print("input string : "); //kikiy
            String N = scan.next();
            if (N.length() <= 5) {
                int size = N.length()+1;
                while (size-- != 0) {
                    System.out.println(N.substring(0,size));
                }
            } else {
                System.out.print("max N 5");
            }
        }

    }
}
