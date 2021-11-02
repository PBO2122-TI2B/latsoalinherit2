public class Supplier extends Partner{
    public int hutang;
    
    protected void setSupplier(int h){
        this.hutang = h;
    }
    
    public String getSupplier(){
        return("Nama Supplier\t: "+nama+"\nKode Supplier\t: "+kode+"\nAlamat Supllier\t: "+alamat+"\nHutang\t\t: "+hutang);
    }
}
