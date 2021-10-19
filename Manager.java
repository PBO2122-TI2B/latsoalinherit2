public class Manager extends Karyawan {
    public double kenaikan = 0.45;
    public void gajiManager()
    {
        System.out.println("Gaji Manager adalah " + (gaji + (gaji * kenaikan)));
    }

}
