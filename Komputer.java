public class Komputer {
    String merk, jnsProsesor;
    int kecProsesor, sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

public void tampilDataKomputer(){
System.out.println("Merk :"+merk);
System.out.println("Jenis Prosesor :"+jnsProsesor);
System.out.println("Kecepatan Prosessor:"+kecProsesor);
System.out.println("Size Memory :"+sizeMemory);
}
}