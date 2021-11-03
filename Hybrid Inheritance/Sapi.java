public class Sapi extends Mamalia{
    String kegunaan;

    Sapi(String nm, String ket, String kegunaan) {
        super(nm, ket);
        this.kegunaan = kegunaan;
    }

    public void Cetak() {
        System.out.println("Nama Mamalia    : " + super.nama);
        System.out.println("Keterangan      : " + super.keterangan);
        System.out.println("Kegunaan        : " + this.kegunaan);
       } 
}

//Adika Ahmad Hanif Nazhir