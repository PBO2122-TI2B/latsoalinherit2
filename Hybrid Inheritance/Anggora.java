public class Anggora extends Kucing {
    String jenis;

    Anggora(String nm, String ket, String kegunaan, String jns) {
        super(nm, ket, kegunaan);
        this.jenis = jns;
    }

    public void Cetak(){
        System.out.println("Nama Mamalia    : " + super.nama);
        System.out.println("Keterangan      : " + super.keterangan);
        System.out.println("Kegunaan        : " + super.kegunaan);
        System.out.println("Jenis           : " + this.jenis);
    }
}

//Adika Ahmad Hanif Nazhir