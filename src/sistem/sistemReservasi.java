package sistem;

public class sistemReservasi {
    public void data(String nama, String jenis, String nomorHP, int tipe, int lamaMenginap) {
        double harga;
        if (tipe == 1) {
            harga = 300000; 
        } else if (tipe == 2) {
            harga = 500000;  
        } else if (tipe == 3) {
            harga = 1000000; 
        } else {
            System.out.println("Tipe kamar tidak valid.");
            return;
        }

        double totalHarga = harga * lamaMenginap;

        System.out.println("\nKamar Anda sudah dipesan, ini rinciannya");
        System.out.println("Nama: " + nama);
        System.out.println("Nomor HP: " + nomorHP);
        System.out.println("Jenis Kelamin: " + jenis);
        System.out.println("Tipe Kamar: " + (tipe == 1 ? "Standar" : tipe == 2 ? "Deluxe" : "Family"));
        System.out.println("Lama Menginap: " + lamaMenginap + " hari");
        System.out.println("Total Harga: Rp" + totalHarga);
    }

    public void Ketersediaan(int tipe) {
        System.out.println("Kamar tipe " + (tipe == 1 ? "Standar" : tipe == 2 ? "Deluxe" : "Family") + " tersedia untuk dipesan.");
    }
}
