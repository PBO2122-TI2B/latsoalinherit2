public class PC extends Komputer {
    int ukuranMonitor;

    public PC() {
    }

    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

public void tampilPc(){
super.tampilDataKomputer();
System.out.println("Ukuran Monitor :"+ukuranMonitor);
}
}