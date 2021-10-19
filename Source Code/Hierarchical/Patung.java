package Hierarchical;

public class Patung extends KaryaSeni{
    private String pematung;
    private String teknik;

    public Patung(String judul, float harga, String pematung, String teknik) {
        super(judul, harga);
        this.pematung = pematung;
        this.teknik = teknik;
    }

    public void patungDetails() {
        System.out.println("\n------------ Patung -------------");
        printDetails();
        System.out.println("--------- Detail Patung ---------");
        System.out.println("Pematung       : " + pematung);
        System.out.println("Teknik Lukisan : " + teknik);
    }
}
