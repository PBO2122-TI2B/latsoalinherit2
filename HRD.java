public class HRD extends Karyawan{
    public double kenaikan = 0.25;
    public void gajiHRD()
    {
        System.out.println("Gaji HRD adalah " + (gaji + (gaji * kenaikan)));
    }
}
