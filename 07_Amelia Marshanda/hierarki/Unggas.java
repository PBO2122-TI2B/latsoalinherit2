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
public class Unggas {
    private String paruh;
    private String sayap;
    private String jumlahKaki = "2";
    
    public void bertelur(){
        System.out.println("Unggas berkembang biak dengan bertelur");
    }
    
    public void info(){
        bertelur();
        System.out.println("Hewan ini memiliki paruh");
        System.out.println("Hewan ini memiliki sayap");
        System.out.println("Hewan ini memiliki jumlah kaki " +this.jumlahKaki);
    }
}
