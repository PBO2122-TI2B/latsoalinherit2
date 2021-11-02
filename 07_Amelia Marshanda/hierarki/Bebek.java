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
public class Bebek extends Unggas{
    private String jenisKaki;
    private String warnaBulu;
    private String jenisBulu;
    
    public Bebek(String jenisKaki, String warnaBulu, String jenisBulu){
        this.jenisKaki = jenisKaki;
        this.warnaBulu = warnaBulu;
        this.jenisBulu = jenisBulu;
    }
    
    public void berenang(){
        System.out.println("Bebek dapat berenang di air");
    }
    
    public void info(){
        System.out.println("\n===BEBEK===");
        super.info();
        berenang();
        System.out.println("Jenis Kaki : " +this.jenisKaki);
        System.out.println("Warna Bulu : " +this.warnaBulu);
        System.out.println("Jenis Bulu : " +this.jenisBulu);
    }
}
