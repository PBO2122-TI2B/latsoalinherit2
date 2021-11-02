import java.util.Scanner;

public class MainHierarkikal {
    public static void main(String args[]){
        String jenis, nama, kode, alamat;
        int hutang, piutang;
        
        Customers cust = new Customers();
        Supplier sup = new Supplier();
        Scanner input = new Scanner(System.in);
        
        //user memasukkan pilihan ketika c dia adalah customers ketika s dia adalah supplier
        System.out.println("===============Selamat Datang di Jasa Simpan Pinjam================");
        System.out.print("ketik huruf 'c' untuk Customer dan ketik huruf 's'untuk Supplier: ");
        jenis = input.next();
        
        //if else if mengecek kondisi menggunakan contains() untuk mengecek ada/tidak huruf inputan
        if(jenis.contains("c")){
            jenis = "Customers";
        }else if(jenis.contains("s")){
            jenis = "Supplier";
        }else {
            System.out.println("Pilihan yang anda masukkan salah");
            //secara otomatis system akan keluar
            System.exit(1);
        }
        //user memasukkan data pribadi
        System.out.println("");
        System.out.println("-----Silahkan Isi Data Dibawah Ini-----");
        System.out.print("Masukkan Nama Anda     :");
        nama = input.next();
        System.out.print("Masukkan Kode Anda     :");
        kode = input.next();
        System.out.print("Masukkan Alamat Anda   :");
        alamat = input.next();
        
        if(jenis.contains("Supplier")){
           System.out.print("Masukkan Total Hutang  :");
           hutang = input.nextInt();
           sup.setPartner(nama, kode, alamat);
           sup.setSupplier(hutang);
           System.out.println("");
           System.out.println(sup.getSupplier());
           System.out.println("===================================================================");
        }else{
           System.out.print("Masukkan Total Piutang :");
           piutang = input.nextInt();
           cust.setPartner(nama, kode, alamat);
           cust.setCustomers(piutang);
           System.out.println("");
           System.out.println(cust.getCustomers());
           System.out.println("===================================================================");
        }
    }
}