/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hybrid;

/**
 *
 * @author Amelia
 */
public class Anjing extends Mamalia{
    private String tinggal;
    private String jenis;
    private String warna;
    
    public Anjing(String tinggal, String jenis, String warna){
        this.tinggal = tinggal;
        this.jenis = jenis;
        this.warna = warna;
    }
    
    public void menggonggong(){
        System.out.println("Anjing dapat menggonggong");
    }
    
    public void info(){
        System.out.println("\n===ANJING===");
        super.info();
        menggonggong();
        System.out.println("Tempat tinggal : " +this.tinggal);
        System.out.println("Jenis          : " +this.jenis);
        System.out.println("Warna          : " +this.warna);
    }
}
