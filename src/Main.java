public class Main{
    public static void main(String[] args){
        Kue[] daftarKue = new Kue[20];

        for(int i = 0; i < 20; i++){
            if (i % 2 == 0){
                KuePesanan kp = new KuePesanan();
                kp.nama = "Kue Pesanan " + i;
                kp.harga = 1000 * (i + 1);
                kp.berat = i + 0.5;
                daftarKue[i] = kp;
            } else{
                KueJadi kj = new KueJadi();
                kj.nama = "Kue Jadi " + i;
                kj.harga = 500 * (i + 1);
                kj.jumlah = i + 2;
                daftarKue[i] = kj;
            }
        }

        double totalHarga = 0;
        double totalBeratPesanan = 0;
        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        Kue kueTermahal = daftarKue[0];

        for (Kue k : daftarKue){
            if(k != null){
                System.out.println(k);

                double hargaKueIni = k.hitungHarga();
                totalHarga += hargaKueIni;

                if(k instanceof KuePesanan){
                    KuePesanan kp = (KuePesanan) k;
                    totalBeratPesanan += kp.berat;
                    totalHargaPesanan += kp.hitungHarga();
                } else if (k instanceof KueJadi){
                    KueJadi kj = (KueJadi) k;
                    totalJumlahJadi += kj.jumlah;
                    totalHargaJadi += kj.hitungHarga();
                }

                if (hargaKueIni > kueTermahal.hitungHarga()) {
                    kueTermahal = k;
                }
            }
        }

        System.out.println("\n--- HASIL ANALISIS ---");
        System.out.println("Total Harga Semua Kue: " + totalHarga);
        System.out.println("Kue Pesanan -> Total Harga: " + totalHargaPesanan + ", Total Berat: " + totalBeratPesanan);
        System.out.println("Kue Jadi -> Total Harga: " + totalHargaJadi + ", Total Jumlah: " + totalJumlahJadi);
        System.out.println("Kue Termahal adalah: " + kueTermahal);
    }
}