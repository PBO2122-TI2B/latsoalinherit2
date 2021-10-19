package Hierarchical;

public class Main {
    public static void main(String[] args) {
        Photography pht = new Photography("Alam dan Isinya", 945000, "Raka Mahardika", "Sony A7S Mark II", "1/8", "F2/8");
        Lukisan luk = new Lukisan("Pantai Yang Tenang", 850000, "Diandra Risa", "Water Painting", "Rizky Sendiana");
        Patung pat = new Patung("Orang Awam", 1250000, "Jirem Ahmadi", "Pahatan Kayu");
        // Print
        System.out.println("------ SELAMAT DATANG DI OOCENGG GALLERY ------");
        System.out.println("Disini terdapat beberapa jenis Karya Seni yang \n akan dipamerkan kepada penikmat seni!");
        System.out.println("-----------------------------------------------");
        System.out.println("Berikut beberapa karya seni yang ada di Gallery!\n             Semoga Menikmati!");
        pht.gambarDetails();
        luk.lukisanDetails();
        pat.patungDetails();
    }
}
