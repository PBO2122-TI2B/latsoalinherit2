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
public class Mamalia extends Hewan{
    private String kelenjarSusu = "memiliki";
    
    public void melahirkan(){
        System.out.println("Mamalia berkembang biak dengan cara melahirkan");
    }
    
    public void info(){
        super.info();
        System.out.println("Mamalia " +this.kelenjarSusu+ " kelenjar susu");
        melahirkan();
    }
}
