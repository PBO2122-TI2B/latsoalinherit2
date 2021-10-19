package Hybrid;

public class Ayah extends Kakek {
    private String nameA;
    private int ageA;

    public Ayah (String nameK, int ageK, String nameA, int ageA) {
        super(nameK, ageK);
        this.nameA = nameA;
        this.ageA = ageA;
    }

    public void showAyah() {
        System.out.println("I am father.");
        System.out.println("Nama Saya : " +nameA);
        System.out.println("Umur Saya : " +ageA);
    }
}
