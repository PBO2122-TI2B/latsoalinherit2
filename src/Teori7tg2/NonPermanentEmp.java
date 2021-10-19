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
public class NonPermanentEmp extends Staff{
    public int workHour;
    public NonPermanentEmp(){
    }
    public NonPermanentEmp(String name, String address, int salary, int overtime,int deduction, String tittle,
            String major,int workHour){
        super(name, address, salary, overtime, deduction, tittle, major);
        this.workHour = workHour;
    }
    public void ShowNonPermanentEmp(){
        System.out.println("***************Non-Permanent Employee Data***************");
        super.TampilDataStaff();
        System.out.println("Total Work Hour : "+workHour);
        System.out.println("Net Salary      : "+(salary*workHour+overtime-deduction));
    }
}

