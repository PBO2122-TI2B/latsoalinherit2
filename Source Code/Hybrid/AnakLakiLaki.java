package Hybrid;

class AnakLakiLaki extends Ayah {
    private String nameAL;
    private int ageAL;

    public AnakLakiLaki (String nameK, int ageK, String nameA, int ageA, String nameAL, int ageAL) {
        super(nameK, ageK, nameA, ageA);
        this.nameAL = nameAL;
        this.ageAL = ageAL;
    }
    public void show() {
        System.out.println("----------------------");
        showKakek();
        System.out.println("----------------------");
        showAyah();
        System.out.println("----------------------");
        System.out.println("I am son.");  
        System.out.println("Nama Saya : " +nameAL);
        System.out.println("Umur Saya : " +ageAL);
    }  
}