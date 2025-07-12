package uas2310010488.pbo1;


//Komponen: Class
public class BayuCafe {
    // Komponen: Atribut dan Encapsulation
    private String nama;
    private double harga;

    // Komponen: Constructor
    public BayuCafe(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Komponen: Accessor
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Komponen: Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Nama Kopi: " + nama + ", Harga: Rp" + harga);
    }
}

