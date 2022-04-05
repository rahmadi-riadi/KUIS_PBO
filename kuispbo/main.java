/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuispbo;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int pilih;
        boolean y = false;

        System.out.println(" ----------------------------------------------------- ");
        System.out.println(" Lomba Apresiasi Pahlawan Wanita Indonesia oleh UPNVYK ");
        System.out.println(" ----------------------------------------------------- ");
        System.out.println(" =Terdapat 2  kategori perlombaan=");
        System.out.println("1. Animasi ");
        System.out.println("2. Menulis Surat ");
        System.out.print("Pilih Kategori Perlombaan : ");

        pilih = input.nextInt();
        if (pilih == 1) {
            String nama;
            String asal;
            int nilai1;
            int nilai2;
            int nilai3;
            int nilai4;
            System.out.println(" ");
            Scanner data = new Scanner(System.in);
            System.out.println("== Formulir Pendaftaran ==\n");
            System.out.print("Input Nama : ");
            nama = data.nextLine();
            System.out.print("Input Asal Sekolah : ");
            asal = data.nextLine();

            System.out.println("-- Penilaian --\n");
            System.out.println("Keterangan : Nilai yang Valid berada pada 1 - 100");
            System.out.print("Nilai Alur Cerita : ");
            nilai1 = data.nextInt();
            System.out.print("Nilai Konten : ");
            nilai2 = data.nextInt();
            System.out.print("Nilai Kreativitas : ");
            nilai3 = data.nextInt();
            System.out.print("Nilai Sinematografi : ");
            nilai4 = data.nextInt();

            Animasi Animasi = new Animasi(nama, asal, nilai1, nilai2, nilai3, nilai4);
            do {
                System.out.println("\nMENU");
                System.out.println("1. Tampil");
                System.out.println("2. Ubah");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilih = input.nextInt();
                if (pilih == 1) {
                    System.out.println("Nilai akhir : " + Animasi.nilai());
                    System.out.println("KETERANGAN : " + Animasi.keterangan());
                } else if (pilih == 2) {
                    System.out.print("Nilai Alur Cerita : ");
                    Animasi.setNilai1(input.nextInt());
                    System.out.print("Nilai Konten : ");
                    Animasi.setNilai2(input.nextInt());
                    System.out.print("Nilai Kreativitas : ");
                    Animasi.setNilai3(input.nextInt());
                    System.out.print("Nilai Sinematografi : ");
                    Animasi.setNilai4(input.nextInt());
                } else if (pilih == 3) {
                    System.out.print("Terima Kasih ");
                    break;
                                   }
            }
            while (true);

        } else if (pilih == 2) {
            String nama;
            String asal;
            int nilai1;
            int nilai2;
            int nilai3;
            int nilai4;

            System.out.println(" ");
            Scanner data = new Scanner(System.in);
            System.out.println("== Formulir Pendaftaran ==\n");
            System.out.print("Input Nama : ");
            nama = data.nextLine();
            System.out.print("Input Asal Sekolah : ");
            asal = data.nextLine();

            System.out.println("-- Penilaian --\n");
            System.out.print("Nilai Struktur Surat  : ");
            nilai1 = data.nextInt();
            System.out.print("Nilai isi Surat : ");
            nilai2 = data.nextInt();
            System.out.print("Nilai Kreativitas  : ");
            nilai3 = data.nextInt();
            System.out.print("Nilai Kaidah Bahasa  : ");
            nilai4 = data.nextInt();

            MenulisSurat menulisSurat = new MenulisSurat(nama, asal, nilai1, nilai2, nilai3, nilai4);
            do {
                System.out.println("\nMENU");
                System.out.println("1. Tampil");
                System.out.println("2. Ubah");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilih = input.nextInt();
                if (pilih == 1) {
                    System.out.println("Nilai akhir : " + menulisSurat.nilai());
                    System.out.println("KETERANGAN : " + menulisSurat.keterangan());
                } else if (pilih == 2) {
                    System.out.print("Nilai Struktur Surat : ");
                    menulisSurat.setNilai1(input.nextInt());
                    System.out.print("Nilai Isi Surat : ");
                    menulisSurat.setNilai2(input.nextInt());
                    System.out.print("Nilai Kreativitas : ");
                    menulisSurat.setNilai3(input.nextInt());
                    System.out.print("Nilai Kaidah Bahasa : ");
                    menulisSurat.setNilai4(input.nextInt());
                }  else if (pilih == 3) {
                    System.out.print("Terima Kasih ");
                    break;
                }
            }
            while (true);
        }
    }
}

