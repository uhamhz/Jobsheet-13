package SCRIPT;

import java.util.Scanner;

public class Ucapan_17 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println("Thank you " + namaOrang + "\nMay the force be with you");
        return namaOrang;
    }

    public static void main(String[] args) {
        PenerimaUcapan();
    }
}
