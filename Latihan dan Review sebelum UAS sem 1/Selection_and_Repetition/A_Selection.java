package Selection_and_Repetition;

public class A_Selection {
    public static void main(String[] args) {
        /*Selection dan Repetition adalah dua dari tiga struktur kontrol
pemrograman dasar yang digunakan untuk membuat logika aplikasi.

1. Selection memungkinkan program untuk membuat pilihan berdasarka
kondisi tertentu. Selection pada umumnya menggunakan perintah seperti:

   a. If-else
      adalah struktur kontrol pemilihan dalam pemrograman yang memungkinkan pengambilan keputusan 
      berdasarkan kondisi yang diberikan. Jika kondisi yang diberikan bernilai benar (true), maka 
      blok kode yang terkait dengan bagian if akan dieksekusi, jika tidak, maka blok kode yang 
      terkait dengan bagian else akan dieksekusi. 
      
        Kelebihan:
            1. Fleksibilitas: if-else memungkinkan kita untuk menentukan
               kondisi yang lebih kompleks dan memiliki lebih dari dua pilihan.

            2. Mudah dipahami: Struktur if-else mudah dipahami dan diterapkan



        Kekurangan:
            1. Penulisan kode yang panjang: Jika kondisi yang diterapkan sangat
               kompleks, maka penulisan kode dapat menjadi sangat panjang dan sulit dibaca.

   b. Switch-case
      adalah struktur kontrol pemilihan dalam pemrograman yang memungkinkan pengambilan keputusan 
      berdasarkan banyak pilihan yang diberikan.
        Kelebihan:
            1. Lebih efisien: Dalam beberapa kasus, switch-case dapat menjalankan
                kode lebih cepat dibandingkan if-else.

            2. Lebih mudah dibaca: Struktur switch-case memiliki tata letak yang
                lebih rapi dan mudah dibaca dibandingkan if-else untuk kondisi yang
                lebih sederhana.



        Kekurangan:
            1. Keterbatasan pada kondisi: Hanya menerima kondisi yang merupakan
                nilai konstan (constant value) seperti integer, character, atau string.

            2. Kode yang lebih kompleks sulit diterapkan: Struktur switch-case
               tidak cocok untuk kondisi yang sangat kompleks dan membutuhkan pemilihan yang
               lebih banyak dibandingkan dua pilihan.*/
        System.out.println("Contoh If-else");
        System.out.println("==============");
        int score = 75;
        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }

        System.out.println("\nContoh Switch-case");
        System.out.println("====================");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
