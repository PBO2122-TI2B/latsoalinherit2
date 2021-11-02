package inheritance2;

public class MainHierarchical {
    public static void main(String[] args){
        Novel n = new Novel();
        Majalah m = new Majalah();

        n.setJudul("Harry Potter");
        n.setPenulis("J.K. Rowling");
        n.setPenerbit("Bloomsbury Publishing");
        n.setTahunTerbit(1997);
        n.setJumlahHalaman(3407);
        System.out.println("-----------NOVEL----------");
        System.out.println("Judul Buku \t\t: "+n.getJudul());
        System.out.println("Penulis \t\t: "+n.getPenulis());
        System.out.println("Penerbit \t\t: "+n.getPenerbit());
        System.out.println("Tahun Terbit \t: "+n.getTahunTerbit());
        System.out.println("Jumlah Halaman \t: "+n.getJumlahHalaman() + " halaman");
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
