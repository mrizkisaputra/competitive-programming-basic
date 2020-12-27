package competitiveprogramming;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DeleteCharacter {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        /**
         * Diberikan string S sebagai input. Hapus karakter pada indeks ganjil dari string tersebut.
         *
         * Masukan:
         * Baris pertama masukan berisi satu bilangan bulat T yang menunjukkan jumlah kasus uji. Setiap baris kasus uji mengikuti string baru S.
         *
         * Output:
         * Sesuai dengan setiap kasus uji, cetak string yang diperlukan.
         *
         * Batasan:
         * 1 <= T <= 100
         * 1 <= panjang (S) <= 1000
         *
         *
         * Contoh:
         * Masukan:
         * 2
         * Geeks
         * GeeksforGeeks
         *
         * Keluaran :
         * Ges
         * GesoGes
         */

        /**
         * Code mrizkisaputra 2020-11-20
         */

        System.out.print("input kasus uji t : ");
        int T = scan.nextInt();

        for (;T <= 100 && T != 0; T--) {
            String str = scan.next(); // geeks
            if (str.length() <= 1000) {
                StringBuilder strb = new StringBuilder();
                for (var i = 0; i < str.length(); i++) {
                    if (i % 2 == 0) {
                        strb.append(str.charAt(i));
                    }
                }
                System.out.println(strb);
            }
        }


    }
}
