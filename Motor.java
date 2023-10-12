/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.Motor;
import java.text.DecimalFormat;



public final class Motor {
    private final  String nama;
    private final String merk;
    private double harga;

    public Motor(String nama, String merk, double harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getMerk() {
        return merk;
    }

    public double getHarga() {
        return harga;
    }

    
     public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedHarga = decimalFormat.format(harga);

        return "Nama: " + nama + ", Merk: " + merk + ", Harga: Rp " + formattedHarga;
    }

       public final void setHarga(double harga) {
        this.harga = harga;
    }
       
       
       
       

//    final void setMerk(String merkBaru) {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
//
//    final void setNama(String namaBaru) {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
    
   
}

