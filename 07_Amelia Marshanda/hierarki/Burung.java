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
public class Burung extends Unggas{
    private String jenisKaki;
    private String warnaBulu;
    
    public Burung(String jenisKaki, String warnaBulu){
        this.jenisKaki = jenisKaki;
        this.warnaBulu = warnaBulu;
    }
    
    public void terbang(){
        System.out.println("Burung dapat terbang menggunakan sayap");
    }
    public void berkicau(){
        System.out.println("Burung memiliki suara kicau yang merdu");
    }
    
    public void info(){
        System.out.println("\n===BURUNG===");
        super.info();
        terbang();
        berkicau();
        System.out.println("Jenis kaki : " +this.jenisKaki);
        System.out.println("Warna bulu : " +this.warnaBulu);
    }
}
