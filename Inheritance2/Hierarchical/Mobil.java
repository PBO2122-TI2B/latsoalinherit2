package Inheritance2.Hierarchical;

public class Mobil {
    String merk;
    int kecepatanSekarang;
    int speed;

    public void info(){
        System.out.println(merk + " Memiliki Kecepatan " + speed + " Km/hr");
    }

    public int tambahKecepatan(){
        int kecepatan = kecepatanSekarang + speed;
        System.out.println("Ditambah laju kecepatan saat ini adalah " + kecepatan);
        return kecepatan;
    }

}
