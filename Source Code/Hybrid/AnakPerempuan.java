package Hybrid;

public class AnakPerempuan extends Ayah{
    private String nameP;
    private int ageP;

    public AnakPerempuan (String nameK, int ageK, String nameA, int ageA, String nameP, int ageP) {
        super(nameK, ageK, nameA, ageA);
        this.nameP = nameP;
        this.ageP = ageP;
    }
    public void show() {  
        System.out.println("----------------------");
        showKakek();
        System.out.println("----------------------");
        showAyah();
        System.out.println("----------------------");
        System.out.println("I am daughter.");  
        System.out.println("Nama Saya : " +nameP);
        System.out.println("Umur Saya : " +ageP);
    }  
 
}
