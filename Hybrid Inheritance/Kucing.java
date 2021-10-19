public class Kucing extends Mamalia{
    String kegunaan;
    
    Kucing(String nm, String ket, String kegunaan) {
        super(nm, ket);
        this.kegunaan = kegunaan;
    }

    public void Cetak(){
        System.out.println("Nama Mamalia    : " + super.nama);
        System.out.println("Keterangan      : " + super.keterangan);
        System.out.println("Kegunaan        : " + this.kegunaan);
    }
}

//Adika Ahmad Hanif Nazhir