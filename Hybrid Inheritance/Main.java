public class Main{
    public static void main(String[] args) {
        Mamalia mml = new Mamalia("Mamalia","Hewan Menyusui");

        Sapi sapi = new Sapi("Sapi", mml.keterangan, "Ternak");

        Kucing kucing = new Kucing("Kucing", mml.keterangan, "Peliharaan Rumah");

        Anggora anggora = new Anggora(kucing.nama, mml.keterangan, kucing.kegunaan, "Anggora");

        mml.Cetak();
        System.out.println();
        sapi.Cetak();
        System.out.println("------------------------");
        kucing.Cetak();
        System.out.println("------------------------");
        anggora.Cetak();
        System.out.println("------------------------");
    }
}

//Adika Ahmad Hanif Nazhir