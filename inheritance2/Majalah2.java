package inheritance2;

public class Majalah2 extends Buku2{
    private String namaMajalah, frekuensi, penerbit;
    private int tahunTerbit;

    public void setNamaMajalah(String namaMajalah) {
        this.namaMajalah = namaMajalah;
    }

    public void setFrekuensi(String frekuensi) {
        this.frekuensi = frekuensi;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public void setJumlahHalaman(int newValue) {
        super.setJumlahHalaman(newValue);
    }

    public String getNamaMajalah() {
        return namaMajalah;
    }

    public String getFrekuensi() {
        return frekuensi;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public int getJumlahHalaman() {
        return super.getJumlahHalaman();
    }
}
