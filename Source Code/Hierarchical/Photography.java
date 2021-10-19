package Hierarchical;

public class Photography extends KaryaSeni {
    private String fotografer;
    private String kamera;
    private String shutterSpeed;
    private String aperture;

    public Photography(String judul, float harga,String fotografer, String kamera, String shutterSpeed, String aperture) {
        super(judul, harga);
        this.fotografer = fotografer;
        this.kamera = kamera;
        this.shutterSpeed = shutterSpeed;
        this.aperture = aperture;
    }

    public void gambarDetails() {
        System.out.println("\n---------- Photography ----------");
        printDetails();
        System.out.println("------- Detail Photography ------");
        System.out.println("Fotografer    : " + fotografer);
        System.out.println("Kamera        : " + kamera);
        System.out.println("Shutter Speed : " + shutterSpeed);
        System.out.println("Aperture      : " + aperture);
    }
}