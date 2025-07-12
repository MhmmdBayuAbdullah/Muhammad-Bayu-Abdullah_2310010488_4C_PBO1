package uas2310010488.pbo1;

// Komponen: Inheritance

public class MenuCafe extends BayuCafe {

    final boolean kopi;

    public MenuCafe(String nama, double harga, boolean kopi) {
        super(nama, harga);
        this.kopi = kopi;
    }
    
    @Override
    public void displayInfo() { // Komponen : polymorphism
        String jenis = kopi ? "Dingin" : "Panas";
        System.out.println(jenis + " " + getNama() + " - Rp" + getHarga());
    }
}

