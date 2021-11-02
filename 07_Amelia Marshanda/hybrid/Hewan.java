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
public class Hewan {
    private String kelas = "Mamalia";
    
    public void makan(){
        System.out.println("Hewan makan untuk bertahan hidup ");
    }
    public void bergerak(){
        System.out.println("Hewan bergerak untuk berpindah tempat ");
    }
    
    public void info(){
        System.out.println("Kelas: " +this.kelas);
        makan();
        bergerak();
    }
}
