package sistem;

public class Kamar {
    public int tipe; 
    public boolean tersedia;
    public double harga;

    public Kamar(int tipe) {
        this.tipe = tipe;
        this.tersedia = true; 

        if (tipe == 1) {
            this.harga = 300000;
        } else if (tipe == 2) {
            this.harga = 500000; 
        } else if (tipe == 3) {
            this.harga = 1000000;
        }
    }
}
