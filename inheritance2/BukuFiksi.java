package inheritance2;

public class BukuFiksi extends Buku2{
    private String judul, penulis, penerbit;
    private int tahunTerbit;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
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

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getJumlahHalaman() {
        return super.getJumlahHalaman();
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
}
