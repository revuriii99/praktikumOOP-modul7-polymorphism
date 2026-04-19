public abstract class Kue {
    String nama;
    double harga;

    public abstract double hitungHarga();

    public String toString(){
        return "Nama: " + nama + "\nHarga: " + harga;
    }
}
