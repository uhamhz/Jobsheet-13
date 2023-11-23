package SCRIPT;

import java.util.Scanner;

public class Kubus17 {
    static int hitungVolume(int a) {
        int Volume = a * a * a;
        return Volume;
    }

    static int hitungLuas(int a) {
        int Luas = 6 * a * a;
        return Luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, v, L;
        System.out.print("Masukan Sisi Kubus : ");
        s = input.nextInt();

        v = hitungVolume(s);
        System.out.println("Volume Kubus Adalah : " + v);
        L = hitungLuas(s);
        System.out.println("Luas Permukaan Adalah : " + L);
    }
}
