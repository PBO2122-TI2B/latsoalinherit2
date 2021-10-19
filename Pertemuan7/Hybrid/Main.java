/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hybrid;

/**
 *
 * @author Aku
 */
public class Main {
    public static void main(String[] args) {
        //Reptile
        Reptile rep = new Reptile();
        rep.tidur();
        rep.makan();
        
        //Semut Florida
        SemutFlorida sf = new SemutFlorida();
        sf.jalan();
        sf.sengat();
        sf.makan();
        sf.melayaniRatu();
    }
}
