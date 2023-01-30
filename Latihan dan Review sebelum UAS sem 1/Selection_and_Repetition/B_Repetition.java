package Selection_and_Repetition;

public class B_Repetition {
    public static void main(String[] args) {
        /*Selection dan Repetition adalah dua dari tiga struktur kontrol
pemrograman dasar yang digunakan untuk membuat logika aplikasi.

2. Repetition adalah suatu konsep pemrograman dimana suatu blok kode
   diulang berulang kali sampai kondisi tertentu terpenuhi. Selection pada umumnya
   menggunakan perintah seperti:

   a. For Loop
        Kelebihan:
            1. Dapat digunakan untuk mengulangi blok kode sesuai jumlah yang
               ditentukan, mudah digunakan jika jumlah pengulangan sudah diketahui

        Kekurangan:
            1. Tetap melakukan pengulangan bahkan jika kondisi tidak memenuhi
               syarat, sehingga dapat menyebabkan error program.


   b. While Loop
        Kelebihan:
            1. Hanya melakukan pengulangan jika kondisi memenuhi syarat, sehingga
               menghemat waktu dan sumber daya.

        Kekurangan:
            1. Dapat menyebabkan infinite loop jika kondisi tidak pernah memenuhi syarat.


   c. Do While Loop
        Kelebihan:
            1. Dapat memastikan bahwa blok kode akan dieksekusi setidaknya satu kali,
               meskipun kondisi tidak memenuhi syarat.

        Kekurangan:
            1. Dapat menyebabkan infinite loop jika kondisi tidak pernah memenuhi syarat.


   d. For Each Loop
        Kelebihan:
            1. Mudah digunakan untuk mengiterasi setiap elemen dalam koleksi data (seperti
               array atau list), tanpa perlu mengetahui jumlah elemen.

        Kekurangan:
            1. Hanya dapat digunakan untuk mengiterasi koleksi data, tidak dapat digunakan
               untuk menentukan jumlah pengulangan yang spesifik.


   d. Recursive Loop
        Kelebihan:
            1. Dapat menyelesaikan masalah yang kompleks secara efisien dengan
               memecahkannya menjadi sub-masalah yang lebih sederhana.

        Kekurangan:
            1. Dapat mengakibatkan overflow memori jika pengulangan terlalu dalam atau
               tidak diterminasi dengan benar, dan lebih sulit untuk dipahami dan
               diimplementasikan dibandingkan dengan looping lain.*/
        System.out.println("Contoh for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Contoh while loop");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        System.out.println("Contoh do-while loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        System.out.println("Contoh for-each loop");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
        printNumbers(5);
    }
    // CONTOH RECURSIVE LOOP
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

}
