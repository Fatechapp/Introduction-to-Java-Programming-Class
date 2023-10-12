package models;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private int tahunLahir;

    public Mahasiswa(String NIM, String nama, int tahunLahir) {
        this.NIM = NIM;
        this.nama = nama;
        this.tahunLahir = tahunLahir;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    @Override
    public String toString() {
        return "NIM: " + NIM + ", Nama: " + nama + ", Usia: " + tahunLahir;
    }
}
