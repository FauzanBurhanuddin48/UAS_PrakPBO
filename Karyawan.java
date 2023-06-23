/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan;

/**
 *
 * @author user
 */

// Class Karyawan
public class Karyawan {
//    Mendeklarasikan variabel nama, umur, jabatan dan gaji
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;
    
//    menginisialisasi nilai nama, umur, jabatan, dan gaji
    public Karyawan(String nama, int umur, String jabatan, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    // digunakan untuk mengubah nilai karyawan
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
//     mengubah jabatan karyawan menjadi jabatan yang lebih tinggi
    public void naikJabatan() {
        if (jabatan.equals("Staf")) {
            jabatan = "Supervisor";
        } else if (jabatan.equals("Supervisor")) {
            jabatan = "Manajer";
        } else {
            System.out.println("Tidak bisa naik jabatan lebih tinggi!");
        }
    }
    
//    untuk menampilkan informasi lengkap tentang karyawan
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
}



