/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori7;

/**
 *
 * @author SMK TELKOM
 */
public class ClassC extends ClassB{
    public void methodC(){
        System.out.println("Sub class Method C");
    }
    public static void main(String args[]){
        ClassA obj1 = new ClassA();
        ClassB obj2 = new ClassB();
        ClassC obj3 = new ClassC();
        obj1.methodA(); //calling super class method
        obj2.methodA(); //calling A method from subclass object
        obj3.methodA(); //calling A method from subclass object
    }
}
