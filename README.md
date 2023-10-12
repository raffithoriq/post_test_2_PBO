LAPORAN PRAKTIKUM

PEMROGRAMAN BERORIENTASI OBJEK

“DEALER MOBIL”

Disusun Oleh:

Achmad Roffi Thoriq

2209116052

 1.	Screenshot codingan dan pejelasan
    
    A.	File
   	
   	![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/f79ee341-58d8-4f05-92bc-a7538c9f391f)
   	
   	B.	Kelas posttest2
   	
   	![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/c5d22f92-a8d0-47bb-8629-7ae07a2c4185)
   	
    Pada Posttest2 ini dimulai dengan import yang digunakan untuk mengimpor perpustakaan dan kelas yang diperlukan dari luar.

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/c4224888-65a8-44b7-86a2-f7d0340df2f6)
   	
   	Pada program ini Code tersebut mendefinisikan kelas bernama "Posttest2" dengan deklarasi public final class, Kelas ini berisi metode main yang merupakan titik awal program. Metode ini menggunakan array string (args) sebagai parameter, ArrayList diatas mendeklarassikan kelas "Motorcycle" sebagai "motorcycleList." objek "scanner" diatas untuk membaca inputan pada program. Perulangan while digunakan untuk menjalakan ulang program apabila user telah selesai menggunakan salah satu menu CRUD, pada menu 1 berfungsi untuk menambahkan nama, merek, dan harga sebuah motor. Pada menu 2 berfungsi untuk menampilkan daftar motor yang disimpan. Pada menu 3 berfungsi untuk mencari daftar motor yang ingin dicari. Pada menu 4 berfungsi sebagai memperbarui nama, merek, dan harga motor yang sudah ada dan di ganti dengan nama, merek, dan harga yang baru di masukkan. Pada menu 5 berfugsi untuk menghapus data motor dalam ArrayList. Pada menu 6 berfugsi sebagai menu untuk keluar dari program.

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/763b5a84-0ff5-489b-bea5-fcfbfa5dcbfb)
   	
   	Pada program ini menggunakan switch untuk menentukan Tindakan yang akan dilakukan berdasarkan pilihan user. Pada program case 1 Menggunakan objek scanner untuk membaca input pengguna dan menyimpannya dalam variabel name, brand, dan price. System.out.print("Enter Motorcycle Name: ");, System.out.print("Enter Motorcycle Brand: ");, System.out.print("Enter Motorcycle Price: ");, program Ini adalah teks yang dicetak ke output untuk meminta pengguna memasukkan nama, merek, dan harga motor. String name = scanner.nextLine();, String brand = scanner.nextLine();, double price = double price = Double.parseDouble(scanner.nextLine()); Program menggunakan scanner untuk membaca inputan yang dimasukkan oleh pengguna dan menyimpannya dalam variabel name, brand, price yang akan berisi nama, merek, dan harga motor. Double.parseDouble(scanner.nextLine()); mengunakan scanner untuk membaca inputan dan di ubah menjadi tipe data double dan harga motor diubah disimpan dalam variable price. Motorcycle motorcycle = new Motorcycle(name, brand, price);: Dalam langkah ini, program membuat objek Motorcycle baru dengan menggunakan informasi yang telah dimasukkan oleh pengguna (nama, merek, dan harga). Objek ini akan digunakan untuk merepresentasikan sepeda motor yang akan dimasukkan ke dalam daftar. motorcycleList.add(motorcycle);: Objek sepeda motor yang baru dibuat ditambahkan ke dalam motorcycleList. motorcycleList adalah daftar yang digunakan untuk menyimpan sepeda motor yang telah dimasukkan oleh pengguna. System.out.println("Motorcycle added successfully!"); teks ini dicetak ke output untuk memberi tahu pengguna bahwa sepeda motor telah berhasil ditambahkan ke dalam daftar. Program break; Ini berfungsi untuk mengakhiri case "1" dan menghentikan eksekusi di dalamnya. Ini mungkin terdapat dalam suatu blok switch, dan break digunakan untuk keluar dari switch setelah operasi selesai. Pada program case 2  ini if (motorcycleList.isEmpty())  Ini adalah kondisi pertama yang diperiksa. Program memeriksa apakah daftar sepeda motor, yang disimpan dalam motorcycleList, kosong atau tidak. Jika daftar tersebut kosong, maka kondisi ini akan dianggap sebagai benar. System.out.println("Motorcycle List is Empty"); Jika daftar sepeda motor kosong, program akan mengeluarkan output Motorcycle List is Empty, memberi tahu user bahwa daftar sepeda motor tidak ada. else  Jika kondisi pertama tidak terpenuhi atau daftar sepeda motor tidak kosong, program akan melanjutkan ke blok System.out.println("Motorcycle List:"); yang berguna untuk mencetak pesan ini untuk memberi tahu user bahwa daftar sepeda motor akan ditampilkan. for (Motorcycle m : motorcycleList)  Ini adalah loop for-each yang digunakan untuk mengulangi setiap objek Motorcycle dalam daftar motorcycleList. System.out.println(m); program akan mencetak setiap objek sepeda motor ke layar. Ini mungkin akan mencetak informasi seperti nama, merek, dan harga sepeda motor, tergantung pada implementasi toString() dalam kelas Motorcycle.

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/837ea760-d13a-44a6-baae-e20495aaa0ae)
   	
   	Pada program case 3 ini System.out.print("Enter the Motorcycle Name to search for: ") ini berfungsi untuk mencetak perintah kepada pengguna untuk memasukkan nama sepeda motor yang akan dicari. String nameToSearch = scanner.nextLine();: berfungsi untuk menggunakan scanner untuk membaca input user dan menyimpannya dalam variabel nameToSearch, yang berisi nama sepeda motor yang akan dicari. boolean found = false; Program mendeklarasikan variabel boolean found yang digunakan untuk melacak apakah sepeda motor yang dicari telah ditemukan atau tidak. if (m.getName().equalsIgnoreCase(nameToSearch)) di program ini berfungsi memeriksa apakah nama sepeda motor dalam daftar cocok dengan apa yang dicari oleh user. System.out.println(m); Program ini kemudian akan mencetak informasi lengkap tentang sepeda motor yang ditemukan. found = true; Variabel found diubah menjadi true untuk menunjukkan bahwa sepeda motor telah ditemukan. 

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/d61fb249-fa01-4ff8-96d1-4dcfff33fa95)
   	
    Pada program case 4 ini String nameToUpdate = scanner.nextLine();: Program menggunakan objek scanner untuk membaca input user dan menyimpannya dalam variabel nameToUpdate, yang berisi nama sepeda motor yang akan diperbarui.if(existingMotorcycle.getName().equalsIgnoreCase(nameToUpdate) : Program memeriksa apakah nama sepeda motor saat ini cocok dengan nama yang dimasukkan oleh user. Jika ada kecocokan maka program akan menjalankan perintah di dalam blok ini. Motorcycle updatedMotorcycle = new Motorcycle(newName, newBrand, newPrice); Program membuat objek Motorcycle baru berdasarkan informasi baru yang inputkan oleh user. motorcycleList.set(i, updatedMotorcycle); program ini berfungsi untuk mengantikan sepeda motor yang ada dalam daftar sepeda motor yang baru dengan menggunakan metod set().

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/74248943-7ad3-4a3c-806c-c5d7be899900)
   	
   	Pada program case 4 ini System.out.print("Enter the name of the Motorcycle to delete: "); program ini mencetak perintah kepada user untuk memasukkan nama sepeda motor yang akan dihapus dari ArrayList. String motorcycleToDelete = scanner.nextLine(); berfungsi untuk menggunakan objek scanner untuk membaca input user dan menyimpannya dalam variabel motorcycleToDelete, yang berisi nama sepeda motor yang akan dihapus. String motorcycleToDelete = scanner.nextLine(); Program ini menggunakan objek scanner untuk membaca input pengguna dan menyimpannya dalam variabel motorcycleToDelete, yang berisi nama sepeda motor yang akan dihapus. Iterator pada program ini untuk mengakses elemen dalam motorcycleList. Iterator adalah suatu mekanisme untuk melakukan perulangan melalui elemen dalam ArrayList. Pada  iterator.remove();  sepeda motor yang sesuai dengan nama yang diinputkan oleh user ditemukan, program akan menggunakan metode remove() dari iterator untuk menghapus sepeda motor tersebut dari motorcycleList.  Pada case 6 ini System.exit(0); berfungsi sebagai menu untuk keluar dari program.

    C.	Kelas Motor
   	
   	![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/6e054b2a-52f2-4c1d-8cfb-8359eacbeeba)
   	
   	Pada Posttest2 ini dimulai dengan import yang digunakan untuk mengimpor perpustakaan dan kelas yang diperlukan dari luar.

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/c7a64cf7-3c36-4eac-8d5f-36de0008b5e0)
   	
   	Pada program ini public final class Motorcycle adalah deklarasi kelas public yang berarti kelas ini dapat diakses dari mana saja dalam program ini. final menunjukkan bahwa kelas ini bersifat final, yang berarti kelas ini tidak dapat digantikan oleh kelas lain. hal Ini membuat kelas "Motorcycle" menjadi kelas akhir yang tidak bisa memiliki subkelas. private final String name; dan private final String brand; adalah deklarasi variabel yang bersifat private dan final. Variabel anggota name dan brand adalah string yang digunakan untuk menyimpan nama sepeda motor. Kata kunci private mengindikasikan bahwa hanya metod dalam kelas "Motorcycle" saja yang dapat mengakses langsung variabel ini, dan kata kunci final mengindikasikan bahwa nilai variabel ini tidak dapat diubah setelah diberikan nilai awal. private double price; adalah deklarasi variabel anggota price yang bersifat private. Variabel anggota ini digunakan untuk menyimpan harga sepeda motor.

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/9068460a-a007-4d03-858a-68e89d47a12c)
   	
   	Pada program ini public Motorcycle (String name, String brand, double price) adalah acuan konstruktor. Konstruktor ini menerima tiga parameter yaitu name, brand, dan price. Saat membuat objek "Motorcycle" dengan konstruktor ini harus memberikan nilai untuk ketiga parameter ini. this.name = name;, this.brand = brand;, this.price = price; Ini adalah pernyataan yang menginisialisasi variabel name, brand, price anggota dari objek "Motorcycle" dengan nilai yang diterima dari parameter name, brand, price.

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/c7b49fc8-5149-40c7-8cbd-badd7787792a)
   	
   	Pada program ini bisa kita ambil contoh dari public String getName() Metode ini bersifat publik, Metode ini mengembalikan  nilai bertipe String, yang merupakan tipe data yang digunakan untuk menyimpan teks begitupun public String getbrand(). sedangkang public double getprice() bertipe double, yaitu tipe data yang digunakan untuk menyimpan angka desimal.

    ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/9f97b58c-5c2f-4e75-b81e-632b5846bdb6)
   	
   	Pada program ini public String toString(): yang berfungsi mendeklarasi metode toString(). Ini adalah metode dimiliki semua objek Java. Metode ini menggantikan metode bawaan  kelas objek untuk memberikan representasi teks objek yang lebih tepat. DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");: metode membuat  objek DecimalFormat untuk menentukan format harga atau variabel harga dalam format tampilan yang lebih mudah dibaca. String formattedprice = decimalFormat.format(price); Metod format() dari objek DecimalFormat digunakan untuk mengonversi harga ke format yang diinginkan dan menyimpannya dalam variabel formattedprice. return "Nama: "name", brand: "merek", price: Rp " formattedprice;: Metode mengembalikan  string yang menjelaskan objek "Motorcycle". Ini mencakup name, brand, dan price yang  diformat dengan  pemisah ribuan dan simbol mata uang "Rp". public final void setPrice(double price): Ini adalah deklarasi metode setPrice(). Cara ini digunakan mengatur atau mengubah harga sepeda motor berdasarkan nilai yang diberikan oleh parameter harga.

3.	Output beserta penjelasan
   
   ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/dd396fd9-8b88-45f8-ba24-5b5114e0a18d)
   
  	Pada tampian awal output pada gambar diatas menampilkan 6 daftar menu CRUD yaitu  Add Motorcycle, View Motorcycle List, Search for Motorcycle, Update Motorcycle, Delete Motorcycle, Exit. Dan terdapat kolom utung menginputkan pilihan user.
  	
  	![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/147605f1-6404-49bb-98b5-9c3230a8a8ba)

  	Apabila menginputkan angka 1 atau Add Motorcycle maka akan muncul menu untuk memasukan nama motor, brand motor, dan harga motor, kemudian apabila sudah selesai dan berhasil menginputkan data dari motor baru tersebut maka akan muncul tampilan Motorcycle added successfully!. Dan apabila telah berhasil maka program akan memunculkan Kembali daftar menu.

   ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/c4b32fe5-f8d8-4f06-8500-7684a4401477)
   
   Apabila menginputkan angka 2 atau View Motorcycle List maka akan muncul pricelist yang telah ditambahkan sebelumnya pada menu angka 1. Dan apabila telah berhasil maka program akan memunculkan Kembali daftar menu. 

   ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/71600b4f-5e89-4fdd-9b02-919eca99d684)
   
   Apabila menginputkan angka 3 atau Search for Motorcycle maka akan muncul kolom untuk memasukan nama motor yang ingin dicari oleh user, setelah  itu apabila nama yang diinputkan user sesuai atau ada dengan nama motor yang berada dalam daftar maka program akan memunculkan data price list dari  motor tersebut. Dan apabila telah berhasil maka program akan memunculkan Kembali daftar menu.

   ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/7e516b1d-f3df-4ca5-a13d-088c550c5ffc)
   
   Apabila menginputkan angka 4 atau Update Motorcycle maka akan muncul kolom untuk memasukan nama motor yang telah ada sebelumnya di dalam daftar motor, apabila user telah memasukan nama motor yang ingin di update maka user akan ditampilkan kolom untuk memasukan nama motor baru, kemudian apabila user telah memasukan nama motor maka user akan ditampilkan kolom brand, kemudian apabila user telah memasukan nama brand dari  motor maka user akan ditampilkan Kembali menu price, apabila user telah memasukan harga dari motor tersebut maka user akan mendapat tampilan Motorcycle updated successfully!. Dan apabila telah berhasil maka program akan memunculkan Kembali daftar menu.

   ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/8b28b82f-3199-4949-a2c6-048357f83f8f)
   
   Apabila menginputkan angka 5 atau Delete Motorcycle maka program akan memunculkan kolom untuk memasukan nama motor yang ingin dihapus, apabila nama motor yang dimasukan sudah sesuai atau sama dengan nama motor yang berada di daftar motor maka motor yang berada di daftar tersebut akan terhapus, Dan apabila telah berhasil maka program akan memunculkan Kembali daftar menu.

   ![image](https://github.com/raffithoriq/post_test_2_PBO/assets/126893861/3c5e1f80-c4c7-46dc-9b4d-39974abe84cb)
   
   Apabila menginputkan angka 6 atau Exit maka program akan langsung berhenti.

















 


