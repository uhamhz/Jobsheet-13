package SCRIPT;

import java.util.Scanner;

public class Percobaan617 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukan Panjang : ");
        p = input.nextInt();
        System.out.print("Masukan Lebar : ");
        l = input.nextInt();
        System.out.print("Masukan Tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang Adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok Adalah : " + vol);
    }
}
