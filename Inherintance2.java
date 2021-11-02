public class Inherintance2 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Laki- Laki", 20, 200000, 15000, 20000, "2A", 10000);
        ST.tampilStaffTetap();
        StaffHarian SH = new StaffHarian("indah", "Malang", "Perempuan", 27, 1000, 10000, 30000, 100);
        SH.tampilStaffHarian();
    }
}