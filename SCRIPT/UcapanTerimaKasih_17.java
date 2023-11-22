package SCRIPT;

import java.util.*;

/**
 * UcapanTerimaKasih_17
 */
public class UcapanTerimaKasih_17 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static String UcapanTambahan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucapan Tambahan : ");
        String tambah = input.nextLine();
        input.close();
        return tambah;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you " + nama + "for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything. " + tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
    }

}