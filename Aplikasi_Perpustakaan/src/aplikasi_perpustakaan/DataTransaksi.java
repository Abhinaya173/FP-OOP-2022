/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_perpustakaan;

/**
 *
 * @author ABHINAYA
 */
public class DataTransaksi {
    String nama;
    String judul;
    String judul2;
    String tanggalawal;
    String tanggalkembali;
    
    DataTransaksi(String nama, String judul, String tanggalawal, String tanggalkembali){
        this.nama = nama;
        this.judul = judul;
        this.tanggalawal = tanggalawal;
        this.tanggalkembali = tanggalkembali;
    } 
    
    DataTransaksi(String nama, String judul,String judul2,String tanggalawal, String tanggalkembali){
        this.nama = nama;
        this.judul = judul;
        this.judul2 = judul2;
        this.tanggalawal = tanggalawal;
        this.tanggalkembali = tanggalkembali;
    } 
}
