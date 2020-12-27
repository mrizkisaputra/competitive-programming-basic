package competitiveprogramming;

import java.util.Scanner;

public class DIsplayLongestName {
    public static void main(String[] args) {

        /**
         * Diberikan daftar nama, tampilkan nama terpanjang.
         *
         * Input:
         * Baris pertama input berisi integer T , jumlah kasus uji. Untuk setiap kasus uji, akan ada dua baris.
         * Baris pertama berisi integer N yaitu jumlah total nama, dan baris kedua berisi N nama yang dipisahkan spasi dengan panjang berbeda.
         *
         * Output:
         * Nama terpanjang dalam daftar nama.
         *
         * Batasan:
         * 1 <= T <= 10
         * 1 <= N <= 10
         * 1 <= | panjang nama | <= 1000
         *
         * Contoh:
         * Input:
         * 1
         * 5
         * Geek
         * Geeks
         * Geeksfor
         * GeeksforGeek
         * GeeksforGeeks
         *
         * Keluaran:
         * GeeksforGeeks
         */

        Scanner scan = new Scanner(System.in);

        // Solution 1
        System.out.print("input kasus uji : ");
        int T = scan.nextInt();

        while (T <= 10 && T != 0) {
            System.out.print("input total nama : ");
            int N = scan.nextInt();
            if (N <= 10) {
                String[] nama = new String[N]; // ["geeks","geeks","forgeeks","geeksgeeks","geeks]
                int index = 0;
                for (var i = 0; i < N; i++) {
                    String inputNama = scan.next();
                    if (inputNama.length() <= 1000) {
                        nama[i] = inputNama;
                        if (nama[i].length() > nama[index].length()) {
                            index = i;
                        }
                    } else {
                        System.out.println("max name = 1000");
                    }
                }
                System.out.println(nama[index]);
            }
            T--;
        }


        // Solution 2
        System.out.print("input kasus uji : ");
//        int T = scan.nextInt();

        while (T <= 10 && T != 0) {
            System.out.print("input total nama : ");
            int N = scan.nextInt();
            if (N <= 10) {
                String longest = "";
                for (var i = 1; i <= N; i++) {
                    String inputNama = scan.next();
                    if (inputNama.length() <= 1000) {
                        if (inputNama.length() > longest.length()) {
                            longest = inputNama;
                        }
                    } else {
                        System.out.println("max name = 1000");
                    }
                }
                System.out.println(longest);
            }
            T--;
        }
    }
}
