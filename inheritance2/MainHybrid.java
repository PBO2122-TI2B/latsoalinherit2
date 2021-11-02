package inheritance2;

public class MainHybrid {
    public static void main(String[] args){
        Novel2 n = new Novel2();
        Majalah2 m = new Majalah2();

        n.setJudul("Matahari");
        n.setSeri("Bumi");
        n.setPenulis("Tere Liye");
        n.setPenerbit("Gramedia Pustaka Utama");
        n.setTahunTerbit(2016);
        n.setJumlahHalaman(390);
        System.out.println("===================BUKU FIKSI=====================");
        System.out.println("-------------NOVEL-------------");
        System.out.println("Judul Buku \t\t: "+n.getJudul());
        System.out.println("Seri \t\t\t: "+n.getSeri());
        System.out.println("Penulis \t\t: "+n.getPenulis());
        System.out.println("Penerbit \t\t: "+n.getPenerbit());
        System.out.println("Tahun Terbit \t: "+n.getTahunTerbit());
        System.out.println("Jumlah Halaman \t: "+n.getJumlahHalaman() + " halaman");
        System.out.println("===================================================");
        System.out.println("");

        m.setNamaMajalah("Majalah Bobo");
        m.setFrekuensi("Terbit mingguan");
        m.setPenerbit("Kelompok Kompas Gramedia");
        m.setTahunTerbit(1973);
        m.setJumlahHalaman(20);
        System.out.println("----------MAJALAH-----------");
        System.out.println("Nama Majalah \t: "+m.getNamaMajalah());
        System.out.println("Frekuensi \t\t: "+m.getFrekuensi());
        System.out.println("Penerbit \t\t: "+m.getPenerbit());
        System.out.println("Tahun Terbit \t: "+m.getTahunTerbit());
        System.out.println("Jumlah Halaman \t: "+m.getJumlahHalaman()+ " halaman");
        System.out.println("");
    }
}
