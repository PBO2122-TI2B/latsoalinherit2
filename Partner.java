public class Partner {
    String nama, kode, alamat;
    
    protected void setPartner(String n, String k, String a){
        this.nama = n;
        this.kode = k;
        this.alamat = a;    
    }
    
    public String getNama(){
        return nama;
    }
    
    protected String getKode(){
        return kode;
    }
    
    public String getAlamat(){
        return alamat;
    }
}
