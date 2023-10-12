import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.*;

public class Main {

    static Scanner scan = new Scanner(System.in);
    private static List<Mahasiswa> daftarMahasiswa;


    public static void main(String[] args) {
        daftarMahasiswa = new ArrayList<>();

        while (true) {
            String NIM;
            String Nama;
            int tahunLahir;


            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Perbarui Informasi Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print(">> ");

            int chooseMenu = Integer.parseInt(scan.nextLine());

            switch (chooseMenu) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    NIM = scan.nextLine();
                    System.out.print("Masukkan Nama: ");
                    Nama = scan.nextLine();
                    System.out.print("Masukkan Tahun Lahir: ");
                    tahunLahir = Integer.parseInt(scan.nextLine());

                    Mahasiswa mahasiswa = new Mahasiswa(NIM, Nama, tahunLahir);
                    addMahasiswa(mahasiswa);
                    break;

                case 2:
                    List<Mahasiswa> daftar = viewMahasiswa();

                    System.out.println("Daftar Mahasiswa");
                    System.out.println("================");
                    for (Mahasiswa m : daftar) {
                        System.out.println(m);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    String nimHapus = scan.nextLine();

                    deleteMahasiswa(nimHapus);
                    break;

                case 4:
                    System.out.print("Masukkan NIM: ");
                    NIM = scan.nextLine();
                    System.out.print("Masukkan Nama: ");
                    Nama = scan.nextLine();
                    System.out.print("Masukkan Tahun Lahir: ");
                    tahunLahir = Integer.parseInt(scan.nextLine());

                    Mahasiswa mahasiswaBaru = new Mahasiswa(NIM, Nama, tahunLahir);
                    updateMahasiswa(NIM, mahasiswaBaru);
                    break;

                case 5:
                    System.out.println("Keluar dari program");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak sesuai");
            }
        }
    }

    public static void addMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }
    public static List<Mahasiswa> viewMahasiswa() {
        return daftarMahasiswa;
    }
    public static void deleteMahasiswa(String nim) {
        daftarMahasiswa.removeIf(m -> m.getNIM().equals(nim));
    }
    public static void updateMahasiswa(String nim, Mahasiswa mahasiswaBaru) {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            if (m.getNIM().equals(nim)) {
                daftarMahasiswa.set(i, mahasiswaBaru);
                break;
            }
        }
    }

}