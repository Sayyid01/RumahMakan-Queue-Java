package com.sayyidproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        FungsiQueue fungsi = new FungsiQueue();

        boolean jalan = true;
        while (jalan) {

            System.out.println("==============================");
            System.out.println("         RM . BERSAMA      ");
            System.out.println("==============================");
            System.out.println(" 1.Proses Antrian \n " +
                    "2.Proses Daftar \n " +
                    "3.Daftar Antrian \n " +
                    "4.Antrian Pertama \n " +
                    "0.Exit");
            System.out.print("Pilih : ");
            int pilih = in.nextInt();
            System.out.println(" ");

            switch (pilih) {
                case 1:
                    //enQue
                    System.out.print("Nama : ");
                    String nama = in.next();
                    System.out.print("Pesanan : ");
                    String pesanan = in.next();
                    System.out.print("Jumlah : ");
                    int jumlah = in.nextInt();
                    System.out.println(" ");
                    ADT adt = new ADT(nama, pesanan, jumlah);
                    fungsi.enQueue(adt);
                    break;
                case 2:
                    //deQue
                    System.out.println("=========== Daftar Antrian ===========");
                    fungsi.first();

                    fungsi.deQueue();

                    System.out.println(" ");
                    break;
                case 3:
                    fungsi.printAll();
                    System.out.println(" ");
                    break;
                case 4:
                    //front
                    System.out.println("=========== Daftar Antrian ===========");
                    try {
                        fungsi.first();
                    } catch (Exception e) {
                        System.out.println("Antrian Kosong");
                    }
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("Program Ended");
                    jalan = false;
                    break;
                default:
                    System.out.println("Masukan tidak tersedia");
            }
        }
    }
}
