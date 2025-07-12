package uas2310010488.pbo1;

import java.util.Scanner;

public class TransaksiKopi {
    public static void main(String[] args) {
        // Komponen: Object
        try ( // Komponen: IO Sederhana
                Scanner input = new Scanner(System.in)) {
            // Komponen: Object
            MenuCafe kopi1 = new MenuCafe("Americano", 18000, false);
            MenuCafe kopi2 = new MenuCafe("Latte", 22000, true);
            MenuCafe kopi3 = new MenuCafe("Cappuccino", 20000, false);
            MenuCafe kopi4 = new MenuCafe("Mocha", 25000, true);
            // Komponen: Array
            MenuCafe[] menu = {kopi1, kopi2, kopi3, kopi4};
            System.out.println("===== WELCOME TO BAYU COFFEE SHOP =====");
            System.out.println("Menu Kopi Hari Ini:");
            // Komponen: Perulangan
            for (int i = 0; i < menu.length; i++) {
                System.out.print((i + 1) + ". ");
                menu[i].displayInfo();
            }   int pilih = 0;
            // Komponen: Error Handling
            while (true) {
                try {
                    System.out.print("Pilih menu (1-" + menu.length + "): ");
                    pilih = Integer.parseInt(input.nextLine());
                    
                    // Komponen: Seleksi
                    if (pilih < 1 || pilih > menu.length) {
                        System.out.println("Pilih menu yang tersedia. Coba lihat lagi.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(" Input harus angka menu yang tersedia! Coba input lagi.");
                }
            }   MenuCafe selected = menu[pilih - 1];
            int quantity = 0;
            //  Komponen: Error Handling
            while (true) {
                try {
                    System.out.print("Berapa cup " + selected.getNama() + " yang ingin Anda beli? ");
                    quantity = Integer.parseInt(input.nextLine());
                    
                    // Komponen: Seleksi
                    if (quantity <= 0) {
                        System.out.println("Jumlah harus lebih dari nol, antara 1 sampai 4. Coba pesan lagi!");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input kurang tepat. Mungkin harus berupa angka. Coba pesan lagi!");
                }
            }   double total = selected.getHarga() * quantity;
            System.out.println("Total Bayar: Rp" + total);
            System.out.println("Terima kasih telah memesan di Bayu Coffee Guys");
            // Menutup scanner
        }
    }
}
