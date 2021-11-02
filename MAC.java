public class MAC extends Laptop {
    String security;

    public MAC() {
    }

    public MAC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

public void tampilMac(){
super.tampilLaptop();
System.out.println("Security : "+security);
}
}