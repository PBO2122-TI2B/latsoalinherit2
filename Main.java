public class Main{
    public static void main(String[] args) {
    System.out.println("==============================");
    System.out.println("Windows");
    Windows wnds = new Windows();
    wnds.merk = "TUF Gamming A15";
    wnds.jnsProsesor = "AMD RYZEN 9 4900";
    wnds.kecProsesor = 10;
    wnds.sizeMemory = 8000;
    wnds.jnsBaterai = "ASUS Batery";
    wnds.fitur = "Gaming";
    wnds.tampilWindows();
    System.out.println("==============================");
    System.out.println("MAC");
    MAC mac = new MAC();
    mac.merk = "Apple Macbook Pro 13 2021";
    mac.jnsProsesor = "M1 8-core";
    mac.kecProsesor = 8;
    mac.sizeMemory = 8000;
    mac.jnsBaterai = "Apple Batery";
    mac.security = "MAC OS";
    mac.tampilMac();
    System.out.println("==============================");
    System.out.println("PC");
    PC pC = new PC();
    pC.merk = "PC Rakitan";
    pC.jnsProsesor = "Intel Core-I9-9900K";
    pC.kecProsesor = 10;
    pC.sizeMemory = 8000;
    pC.ukuranMonitor = 29;
    pC.tampilPc();
}
}