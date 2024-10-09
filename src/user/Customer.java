package user;

import sistem.sistemReservasi;
import sistem.Reservasi;
import java.util.Scanner;

public class Customer extends User implements Reservasi {
    public Customer() {
        super("", "", "");
    }

    public void reservasiKamar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Reservasi Kamar ===");
        System.out.print("Masukkan nama Anda: ");
        this.nama = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin Anda: ");
        this.jenis = scanner.nextLine();
        System.out.print("Masukkan nomor HP Anda: ");
        this.nomorHP = scanner.nextLine();
        System.out.print("Pilih tipe kamar (1 = Standar, 2 = Deluxe, 3 = Family): ");
        int tipe = scanner.nextInt();
        System.out.print("Berapa lama Anda ingin menginap :");
        int lamaMenginap = scanner.nextInt();
        sistemReservasi system = new sistemReservasi();
        system.data(this.nama, this.jenis, this.nomorHP, tipe, lamaMenginap);
    }

    public void cekKetersediaan(int tipe) {
        sistemReservasi system = new sistemReservasi();
        system.Ketersediaan(tipe);
    }
}
