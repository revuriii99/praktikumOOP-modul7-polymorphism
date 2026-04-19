public class KuePesanan extends Kue {
    double berat;

    @Override
    public double hitungHarga(){
        return harga * berat;
    }

    @Override
    public String toString(){
        return "Jenis: Kue Pesanan, " + super.toString() + ", Total: " + hitungHarga();
    }
}
