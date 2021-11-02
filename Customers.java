public class Customers extends Partner {
    private int piutang;
    
    protected void setCustomers(int p){
        this.piutang = p;
    }
    
    public String getCustomers(){
        return("Nama Customers\t: "+nama+"\nKode Customers\t: "+kode+"\nAlamat Customers: "+alamat+"\nPiutang\t\t: "+piutang);
    }
}
