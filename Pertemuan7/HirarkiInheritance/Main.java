/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HirarkiInheritance;

/**
 *
 * @author Aku
 */
public class Main {
    public static void main(String[] args) {
        //Push-Up
        PushUp push = new PushUp();
        push.lakukan();
        push.push();
        
        //Lari
        Lari run = new Lari();
        run.lakukan();
        run.berlari();
        
        //Renang
        Renang swim = new Renang();
        swim.lakukan();
        swim.berenang();
    }
}
