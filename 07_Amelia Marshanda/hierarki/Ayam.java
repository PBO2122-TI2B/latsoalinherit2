/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarki;

/**
 *
 * @author Amelia
 */
public class Ayam extends Unggas{
    private String jenisKaki;
    private String warnaBulu;
    private String jengger;
    
    public Ayam(String jenisKaki, String warnaBulu, String jengger){
        this.jenisKaki = jenisKaki;
        this.warnaBulu = warnaBulu;
        this.jengger = jengger;
    }
    
    public void mengais(){
        System.out.println("Ayam mencari makanan dengan mengais ");
    }
    
    public void berkokok(){
        System.out.println("Ayam dapat berkokok dan berbunyi 'kukuruyuk'! ");
    }
    
    @Override
    public void info(){
        System.out.println("\n===AYAM===");
        super.info();
        mengais();
        berkokok();
        System.out.println("Jenis kaki      : " +this.jenisKaki);
        System.out.println("Warna Bulu      : " +this.warnaBulu);
        System.out.println("Memiliki jengger? " +this.jengger);
    }
}
