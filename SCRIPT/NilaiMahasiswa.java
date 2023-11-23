package SCRIPT;

import java.util.Arrays;
import java.util.Scanner;

public class NilaiMahasiswa {
    static void InputNilai() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int banyakMahasiswa = input.nextInt();
        System.out.print("Masukan Jumlah Minggu : ");
        int banyakHari = input.nextInt();

        int[][] nilai = new int[banyakMahasiswa][banyakHari];
        String[] nama = new String[banyakMahasiswa];

        input.nextLine();

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan Nama Siswa : ");
            nama[i] = input.nextLine();
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukan Nilai Mahasiswa ke-" + (i + 1) + " Minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        LihatNilai(nama, nilai);
    }

    static void LihatNilai(String[] nama, int[][] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nama[i] + " " + Arrays.toString(nilai[i]));
        }
        NilaiTertinggiMinggu(nama, nilai);
    }

    static void NilaiTertinggiMinggu(String[] nama, int[][] nilai) {
        int kunci = 0, minggu = 0, tertinggi = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (tertinggi < nilai[i][j]) {
                    tertinggi = nilai[i][j];
                    kunci = i;
                    minggu = j;
                }
            }
        }
        System.out.println("Nilai tertinggi berada pada minggu ke-" + (minggu + 1));
        NilaiTertinggiMahasiswa(nama, kunci);
    }

    static void NilaiTertinggiMahasiswa(String[] nama, int kunci) {
        System.out.println("Mahasiswa Dengan Nilai Tertinggi Adalah : " + nama[kunci]);
    }

    public static void main(String[] args) {
        InputNilai();
    }
}
