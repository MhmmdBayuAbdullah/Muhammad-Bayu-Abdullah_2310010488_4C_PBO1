# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menampilkan daftar menu kopi dari sebuah kafe fiktif bernama Bayu Coffee Shop. Pengguna dapat memilih jenis kopi, menentukan jumlah pesanan, dan sistem akan menghitung total harga secara otomatis.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `BayuCafe`, `MenuCafe`, dan `TransaksiKopi` adalah contoh dari class.

```bash
public class BayuCafe {
    ...
}

public class MenuCafe extends BayuCafe {
    ...
}

public class TransaksiKopi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `MenuCafe kopi1 = new MenuCafe("Americano", 18000, false);` adalah contoh pembuatan object.

```bash
MenuCafe kopi1 = new MenuCafe("Americano", 18000, false);
MenuCafe kopi2 = new MenuCafe("Latte", 22000, true);
MenuCafe kopi3 = new MenuCafe("Cappuccino", 20000, false);
MenuCafe kopi4 = new MenuCafe("Mocha", 25000, true);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `harga` adalah contoh atribut.

```bash
String nama;
double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `BayuCafe` dan `MenuCafe`.

```bash
public BayuCafe(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
}

public MenuCafe(String nama, double harga, boolean kopi) {
        super(nama, harga);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setHarga(double harga) {
        this.harga = harga;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`dan `getHarga` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

public double getHarga() {
        return harga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MenuCafe` mewarisi `BayuCafe` dengan sintaks `extends`.

```bash
public class MenuCafe extends BayuCafe {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada program ini, method displayInfo() yang ada di class MenuCafe merupakan override dari method displayInfo() di class BayuCafe.
Tujuannya adalah untuk menambahkan informasi apakah kopi tersebut dingin atau panas, sesuai dengan atribut boolean kopi, Sementara method asli di class BayuCafe hanya menampilkan nama dan harga kopi.

```bash
@Override
public void displayInfo() {
    String jenis = kopi ? "Dingin" : "Panas";
    System.out.println(jenis + " " + getNama() + " - Rp" + getHarga());
}

public void displayInfo() {
    System.out.println("Nama Kopi: " + nama + ", Harga: Rp" + harga);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `MenuCafe`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < menu.length; i++) {
                System.out.print((i + 1) + ". ");
                menu[i].displayInfo();
            }   int pilih = 0;
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
try ( // Komponen: IO Sederhana
                Scanner input = new Scanner(System.in)) {
...
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
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MenuCafe[] menu = {...};` adalah contoh penggunaan array.

```bash
MenuCafe[] menu = {kopi1, kopi2, kopi3, kopi4};
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
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
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Bayu Abdullah
NPM: 2310010488
