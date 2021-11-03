public class Main {
    public static void main(String[] args) {
        Kursi kursi = new Kursi();
        Meja meja = new Meja();
        Lemari lemari = new Lemari();
        
        kursi.cetak();
        kursi.cetakKursi();
        System.out.println("------------");
        meja.cetak();
        meja.cetakMeja();
        System.out.println("------------");
        lemari.cetak();
        lemari.cetakLemari();
        System.out.println("------------");
    }
}

//Adika Ahmad Hanif Nazhir