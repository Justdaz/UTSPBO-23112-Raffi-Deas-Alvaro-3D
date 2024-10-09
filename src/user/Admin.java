package user;

import sistem.sistemReservasi;
import sistem.Reservasi;
import java.util.Scanner;

public class Admin extends User implements Reservasi {
    private final String Password = "12345678";

    public Admin() {
        super("Admin", "", "");
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password Admin: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(Password)) {
            menuAdmin();
        } else {
            System.out.println("Password salah. Akses ditolak.");
        }
    }

    private void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        sistemReservasi system = new sistemReservasi();

        while (true) {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Cek ketersediaan kamar");
            System.out.println("2. Pesan kamar untuk customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Cek ketersediaan kamar? (1 = Standar, 2 = Deluxe, 3 = Family): ");
                    int tipe = scanner.nextInt();
                    system.Ketersediaan(tipe);
                    break;
                case 2:
                    reservasiCustomer(scanner, system);
                    break;
                case 3:
                    System.out.println("Keluar dari menu Admin.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void reservasiCustomer(Scanner scanner, sistemReservasi system) {
        System.out.println("\n=== Reservasi untuk Customer ===");
        scanner.nextLine();
        System.out.print("Masukkan nama customer: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin customer: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan nomor HP customer: ");
        String nomorHP = scanner.nextLine();
        System.out.print("Pilih tipe kamar (1 = Standar, 2 = Deluxe, 3 = Family): ");
        int tipe = scanner.nextInt();
        System.out.print("Berapa lama customer menginap :");
        int lamaMenginap = scanner.nextInt();
        system.data(nama, jenis, nomorHP, tipe, lamaMenginap);
    }

    public void reservasiKamar() {
        System.out.println("Admin tidak dapat memesan kamar.");
    }

    public void cekKetersediaan(int tipe) {
        sistemReservasi system = new sistemReservasi();
        system.Ketersediaan(tipe);
    }
}
