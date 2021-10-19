package Hierarchical;

public class Lukisan extends KaryaSeni {
    private String pelukis;
    private String metode;
    private String pemilik;

    public Lukisan(String judul, float harga, String pelukis, String metode, String pemilik) {
        super(judul, harga);
        this.pelukis = pelukis;
        this.metode = metode;
        this.pemilik = pemilik;
    }

    public void lukisanDetails() {
        System.out.println("\n------------ Lukisan ------------");
        printDetails();
        System.out.println("--------- Detail Lukisan --------");
        System.out.println("Pelukis        : " + pelukis);
        System.out.println("Metode Lukisan : " + metode);
        System.out.println("Pemilik        : " + pemilik);
    }
}
