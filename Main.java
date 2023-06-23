/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author user
 */
// Class Utama
public class Main {
    public static void main(String[] args) {
//        membuat dua objek Karyawan dengan menginisialisasi nama, umur, jabatan, dan gaji karyawan.
        Karyawan karyawan1 = new Karyawan("Fauzan", 30, "Staf", 5000.0);
        Karyawan karyawan2 = new Karyawan("Burhan", 35, "Supervisor", 8000.0);
        
//        Menampilkan informasi karyawan
        System.out.println("Informasi Karyawan 1:");
        karyawan1.displayInfo();
        
        System.out.println("\nInformasi Karyawan 2:");
        karyawan2.displayInfo();
        
//        Naikkan jabatan karyawan 1 dan set ulang gaji
        karyawan1.naikJabatan();
        karyawan1.setGaji(6000.0);
        
        System.out.println("\nInformasi Karyawan 1 setelah naik jabatan:");
        karyawan1.displayInfo();
    }
}
