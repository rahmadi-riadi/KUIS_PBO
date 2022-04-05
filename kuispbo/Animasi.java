/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kuispbo;

/**
 *
 * @author LENOVO
 */
public class Animasi extends kuispbo.pendaftar implements kuispbo.perhitungan {
public Animasi(String nama, String asal, int nilai1, int nilai2, int nilai3, int nilai4) {
super(nama, asal, nilai1, nilai2, nilai3, nilai4);
    }

    public void setNilai1(int nilai1) {this.nilai1 = nilai1; }

    public void setNilai2(int nilai2) {
    this.nilai2 = nilai2;
    }

    public void setNilai3(int nilai3) {
    this.nilai3 = nilai3;
    }

    public void setNilai4(int nilai4) {
        this.nilai4 = nilai4;
    }

    @Override
    public double nilai() {
    return (super.nilai1 * 0.15) + (super.nilai2 * 0.35) + (super.nilai3 * 0.35)+ (super.nilai4 * 0.15);}

    @Override
    public String keterangan() {
    if(this.nilai() >= 85) return "LULUS\nSelamat kepada " + this.nama + " dari " + this.asal +" lolos seleksi lomba Animasi";
    else return "GAGAL\nMohon maaf ," + this.nama + " dari " + this.asal +" tidak lolos seleksi lomba Animasi";
    }
}