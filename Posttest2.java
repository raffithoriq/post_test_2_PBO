package project.posttest2;
import project.Motor.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;



public  final class Posttest2 {
    

    public final static void main(String[] args) {
        ArrayList<Motor> daftarMotor = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

    
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Lihat Daftar Motor");
            System.out.println("3. Cari Motor");
            System.out.println("4. Update Motor");
            System.out.println("5. Hapus Motor");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");

            String pilihan = scanner.nextLine();


            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan Nama Motor: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Merk Motor: ");
                    String merk = scanner.nextLine();
                    System.out.print("Masukkan Harga Motor: ");
                    double harga = Double.parseDouble(scanner.nextLine());

                    Motor motor = new Motor(nama, merk, harga);
                    daftarMotor.add(motor);
                    System.out.println("HP berhasil ditambahkan!");
                    break;

                case "2":
                    if (daftarMotor.isEmpty()) {
                        System.out.println("Daftar Motor Tidak Ada");
                    } else {
                        System.out.println("Daftar Motor:");
                        for (Motor p : daftarMotor) {
                            System.out.println(p);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Masukkan Nama Motor yang dicari: ");
                    String namaCari = scanner.nextLine();
                    boolean ditemukan = false;

                    for (Motor p : daftarMotor) {
                        if (p.getNama().equalsIgnoreCase(namaCari)) {
                            System.out.println("Motor ditemukan:");
                            System.out.println(p);
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Motor tidak ditemukan.");
                    }
                    break;

                    
                case "4":
                    System.out.print("Masukkan Nama Motor yang akan diupdate: ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;

                    for (int i = 0; i < daftarMotor.size(); i++) {
                        Motor s = daftarMotor.get(i);
                        if (s.getNama().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaru = scanner.nextLine();

                            System.out.print("Masukkan Merk Baru: ");
                            String merkBaru = scanner.nextLine();

                            System.out.print("Masukkan Harga Baru: ");
                            double hargaBaru = Double.parseDouble(scanner.nextLine());

                            
                            Motor motorBaru = new Motor(namaBaru, merkBaru, hargaBaru);

                            
                            daftarMotor.set(i, motorBaru);

                            System.out.println("motor berhasil diupdate!");
                            ditemukanUpdate = true;
                            break;
                        }
                    }

                    if (!ditemukanUpdate) {
                        System.out.println("Motor tidak ditemukan.");
                    }
                    break;


                    
                case "5":
                    System.out.print("Masukan nama Motor yg ingin dihapus:");
                    String namamtrHapus = scanner.nextLine();

                    
                    Iterator<Motor> iterator = daftarMotor.iterator();
                    while (iterator.hasNext()) {
                        Motor objekmtr = iterator.next();
                        if (objekmtr.getNama().equalsIgnoreCase(namamtrHapus)) {
                            iterator.remove(); 
                        }
                    }
                    break;

//                

                    
                case "6":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}


