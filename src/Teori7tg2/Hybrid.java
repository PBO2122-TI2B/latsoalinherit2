/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori7tg2;

/**
 *
 * @author SMK TELKOM
 */
public class Hybrid {
    public static void main(String[] args){
        Interns i = new Interns("Diajeng", "Jl.Kapi Pramuja Raya 1",5000000,"Polinema","12345");
        System.out.println("************************************************************");
        i.ShowInterns();
        System.out.println("");
        
        NonPermanentEmp nEmp = new NonPermanentEmp("Nidzom", "Jl.Kapi Minda 20", 6000000, 500000, 150000,
                "Commputer Information System","Operating System", 300);
        System.out.println("************************************************************");
        nEmp.ShowNonPermanentEmp();
        System.out.println("");
        
        PermanentEmp pEmp = new PermanentEmp("Yoesharnilillah", "Jl.Kapi Sraba 13",7000000,200000,7000000,
                "Commputer Information System","Databases","2B",50000);
        System.out.println("************************************************************");
        pEmp.ShowPermanentEmp();
        System.out.println("");
    }
}
