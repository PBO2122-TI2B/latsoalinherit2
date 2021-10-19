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
public class PermanentEmp extends Staff{
    public String group;
    public int insurance;
    
    public PermanentEmp(){
    }
    public PermanentEmp(String name, String address, int salary, int overtime,int deduction, String tittle,
            String major, String group, int insurance){
        super(name, address, salary, deduction, overtime, tittle, major);
        this.group = group;
        this.insurance = insurance;
    }
    public void ShowPermanentEmp(){
        System.out.println("***************Permanent Employee Data***************");
        super.TampilDataStaff();
        System.out.println("Group           : "+group);
        System.out.println("Insurance       : "+insurance);
        System.out.println("New Salary      : "+(salary+overtime-deduction-insurance));
    }
}

