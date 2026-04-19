public class KueJadi extends Kue {
    int jumlah;

    @Override
    public double hitungHarga(){
        return harga * jumlah * 2;
    }

    @Override
    public String toString(){
        return super.toString() + ", Jumlah: " + jumlah;
    }
}
