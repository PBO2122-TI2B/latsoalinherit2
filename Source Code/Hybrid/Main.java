package Hybrid;

public class Main {
    public static void main(String[] args) {
        AnakLakiLaki al = new AnakLakiLaki("Mushawir", 55, "Luki", 36, "Andi", 10);
        AnakPerempuan ap = new AnakPerempuan("Mushawir", 55, "Luki", 36, "Dinda", 19);
        System.out.println("Data Anak Laki Laki :");
        al.show();
        System.out.println("----------------------------");
        System.out.println("\nData Anak Perempuan :");
        ap.show();
        System.out.println("----------------------------");
    }
}
