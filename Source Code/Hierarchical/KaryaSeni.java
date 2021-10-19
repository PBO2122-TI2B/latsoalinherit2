package Hierarchical;

public class KaryaSeni {
    private String judul;
    private float harga;

    public KaryaSeni(String judul, float harga) {
        this.judul = judul;
        this.harga = harga;
    }

    public void printDetails() {
        System.out.println("Judul Karya Seni : " + judul);
        System.out.println("Harga            : " + harga);
    }

    public void updatePrice(float harga) {
        this.harga = harga;
    }
}
