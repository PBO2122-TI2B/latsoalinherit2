public class Laptop extends Komputer {
    String jnsBaterai;

    public Laptop() {
    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptop() {
        super.tampilDataKomputer();
        System.out.println("Jenis Baterai : " + jnsBaterai);
    }
}