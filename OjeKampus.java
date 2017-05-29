/**
 * @author Mifta Adiwira
 * @version 26 mei 2017
 * Class OjeKampus adalah class yang mempunyai Main Method
 */

public class OjeKampus
{
    public static SistemPengawas sistem;
    /**
     * Main method untuk kelas OjeKampus
     */
    public static void main(String[] args)
    {
         //membuat lokasi objek
        Lokasi lokasi1 = new Lokasi("tebet", 1, 2, "Lokasi ojek 1");
        Lokasi lokasi2 = new Lokasi("cawang", 3, 4, "Lokasi ojek 2");
        Lokasi lokasi3 = new Lokasi("kalibata", 5, 6, "Lokasi ojek 3");
        Lokasi lokasi4 = new Lokasi("pasar minggu", 7, 8, "Lokasi awal pelanggan 1");
        Lokasi lokasi5 = new Lokasi("depok", 9, 10, "Lokasi awal pelanggan 2");
        Lokasi lokasi6 = new Lokasi("pocin", 11, 12, "Lokasi awal pelanggan 3");
        Lokasi lokasi7 = new Lokasi("bogor", 13, 14, "Lokasi akhir pelanggan 1");
        Lokasi lokasi8 = new Lokasi("bekasi", 15, 16, "Lokasi akhir pelanggan 2");
        Lokasi lokasi9 = new Lokasi("kutek", 17, 18, "Lokasi akhir pelanggan 2");
        
        //membuat ojek objek, pelanggan dan pesanan dan menginput ke database
        
        Ojek ojek1 = new Ojek(1, "Alfis", lokasi1);
        Ojek ojek2 = new Ojek(2, "Adam", lokasi2);
        Ojek ojek3 = new Ojek(3, "Rifqi", lokasi3);
        
        DatabaseUser.addOjek(ojek1);
        DatabaseUser.addOjek(ojek2);
        DatabaseUser.addOjek(ojek3);
        Pelanggan pelanggan1 = new Pelanggan(4, "Deva", "081286079765");
        Pelanggan pelanggan2 = new Pelanggan(5, "Miko", "081234523453");
        Pelanggan pelanggan3 = new Pelanggan(6, "Baron", "08576642885");
        DatabaseUser.addPelanggan(pelanggan1);
        DatabaseUser.addPelanggan(pelanggan2);
        DatabaseUser.addPelanggan(pelanggan3);
        Pesanan pesan1 = new Pesanan(pelanggan1, TipeLayanan.BeliBarang, lokasi4, lokasi5, "Dito");
        Pesanan pesan2 = new Pesanan(pelanggan2, TipeLayanan.AntarBarang, lokasi6, lokasi7, "Zeta");
        Pesanan pesan3 = new Pesanan(pelanggan3, TipeLayanan.AntarOrang, lokasi8, lokasi9, "Ami");
        
        try
        {
            DatabasePesanan.addPesanan(pesan1);
        }
        catch(PesananSudahAdaException a)
        {
            a.getMessage();
        }
        
        try
        {
            DatabasePesanan.addPesanan(pesan2);
        }
        catch(PesananSudahAdaException a)
        {
            a.getMessage();
        }
        
        try
        {
            DatabasePesanan.addPesanan(pesan3);
        }
        catch(PesananSudahAdaException a)
        {
            System.out.println(a.getMessage());
        }
        
        //mencetak database yang pesanannya masih kosong
        System.out.println("\nSebelum pesanan diterima");
        Administrasi.printAllDatabase();
        
        startSistemPengawas(100);
        
        //menugaskan ojek untuk menerima pesanan
        for(int i=0; i<DatabasePesanan.getDatabase().size(); i++) 
        { 
            menungguSistem(100);
            //Administrasi.jalankanSistemPenugas();
        }
        
        //pelanggan1 membatalkan pesanan karena menunggu terlalu lama
        Administrasi.pesananDibatalkan(pelanggan1);
        System.out.println("\nSetelah pelanggan 1 membatalkan pesanannya");
        Administrasi.printAllDatabase();
        
        //ojek2 membatalkan pesanan karena barang yang diantar terlalu jelek
        Administrasi.pesananDibatalkan(ojek2);
        System.out.println("\nSetelah ojek 2 membatalkan pesanannya");
        Administrasi.printAllDatabase();
        
        //ojek yang mengantar pelanggan3 mengganti statusnya menjadi mengantar
        ojek3.setStatus(StatusOjek.Antar);
        System.out.println("\nSetelah ojek 3 mengganti statusnya");
        Administrasi.printAllDatabase();
        
        //pelanggan3 menyelesaikan pesanan dan menghapusnya dari database
        Administrasi.pesananSelesai(pesan3);
        try
        {
            DatabasePesanan.hapusPesanan(pesan3);
        }
        catch(PesananTidakDitemukanException a)
        {
            a.printStackTrace();
        }
        
        System.out.println("\nSetelah pesanan 3 selesai");
        Administrasi.printAllDatabase();
        
    }
    
    public static void antarBarang()
    {
    }
    
    public static void antarOrang()
    {
    }
    
    public static void ojekMembatalkan()
    {
    }
    
    public static void ojekMengubahStatus()
    {
    }
    
    public static void pembelianBarang()
    {
    }
    
    public static void penggunaMembatalkan()
    {
    }
    
    public static void penggunaMenghapusPesanan()
    {
    }
    
    public static void penggunaMenyelesaikanPesanan()
    {
    }
    
    public static void registrasiOjek()
    {
    }
    
    public static void registrasiPengguna()
    {
    }
    /**
     * 
     */
    public static void startSistemPengawas(int waktu_cek)
    {
        sistem = new SistemPengawas("Pengawas", waktu_cek);
        sistem.start();
    }
    
    /**
     * 
     */
    public static void menungguSistem(int a)
    {
        try
        {
            Thread.sleep(a);
        }
        catch(InterruptedException e)
        {
            System.out.println("Menunggu sistem gagal");
        }
    }
}
