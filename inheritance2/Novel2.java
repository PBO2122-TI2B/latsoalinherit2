package inheritance2;

public class Novel2 extends BukuFiksi{
    private String seri;

    public void setSeri(String seri) {
        this.seri = seri;
    }
    public void setJudul(String judul) {
        super.setJudul(judul);
    }
    public void setPenulis(String penulis) {
        super.setPenulis(penulis);
    }
    public void setPenerbit(String penerbit) {
        super.setPenerbit(penerbit);
    }
    public void setTahunTerbit(int tahunTerbit) {
        super.setTahunTerbit(tahunTerbit);
    }
    public void setJumlahHalaman(int newValue) {
        super.setJumlahHalaman(newValue);
    }
    public String getJudul() {
        return super.getJudul();
    }
    public String getSeri() {
        return seri;
    }
    public String getPenulis() {
        return super.getPenulis();
    }
    public String getPenerbit() {
        return super.getPenerbit();
    }
    public int getTahunTerbit() {
        return super.getTahunTerbit();
    }
    public int getJumlahHalaman() {
        return super.getJumlahHalaman();
    }
}
