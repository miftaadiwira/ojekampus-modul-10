
import java.lang.Math;
import java.util.ArrayList;
/**
 * Ini adalah kelas data administrasi yang dilakukan
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
    }

    private static Pesanan cariPesananIdle()
    {
        for (Pesanan daftar : DatabasePesanan.getDatabase()) {
            if (daftar.getStatusDiproses()==false && daftar.getStatusSelesai()==false)
            {
                return daftar;
            }
        }        
        return null;
        //Method ini digunakan untuk menemukan pesanan yang belum diproses dan belum selesai yang terdapat pada DatabasePesanan
    }
    
    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        pesan.setStatusSelesai(false);//set status selesai menjadi false pada objek Pesanan 
        pesan.setStatusDiproses(true);//set status diproses menjadi true pada objek Pesanan
        pesan.setPelayan(pelayan);//buat objek Pesanan tersebut memiliki objek Ojek
        
        ojekAmbilPesanan(pesan, pelayan); 
        //untuk memproses tukang ojek yang akan ditugaskan untuk mengambil pesanan
    }
    
    public static void ojekAmbilPesanan (Pesanan pesan, Ojek pelayan)
    {
        pelayan.setStatus (StatusOjek.Jemput);//set status objek Ojek tersebut menjadi menjemput
        pelayan.setPesanan (pesan);//buat objek Ojek tersebut memiliki objek Pesanan
        //Method ini untuk menyatakan bahwa status si tukang ojek sudah berubah menjadi “menjemput” dan “ter-link” dengan objek Pesanan yang diberikan.
    }
    
    public static void ojekLepasPesanan (Ojek pelayan)
    {
        pelayan.setStatus (StatusOjek.Idle); //set status objek Ojek menjadi idle
        pelayan.setPesanan(null); //buat objek Ojek memiliki objek Pesanan yang bernilai null
        //Method ini untuk menyatakan kalau status si tukang ojek menjadi “Idle” dan “ter-unlink” dengan objek Pesanan apapun
    }
    
    public static void pesananDibatalkan (Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(true); //set status selesai menjadi false pada objek Pesanan yang ada diobjek Ojek yang diberikan
        pelayan.getPesanan().setStatusDiproses(false); //-set status diproses menjadi false pada objek Pesanan yang ada di objek Ojek yang diberikan
        pelayan.setPesanan(null); //buat objek Pesanan, yang terdapat di objek Ojek yang diberikan, memiliki objek Ojek bernilai nul
        ojekLepasPesanan(pelayan); //method ojekLepasPesanan dengan isi parameter objek Ojek yang diberikan
        //Method ini untuk mengubah status pesanan dan status tukang ojek yang telah membatalkan pesanan serta me-unlink masing-masing objek
    }
    
    public static void pesananSelesai (Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(true); //set status selesai menjadi true pada objek Pesanan yang ada di objek Ojek yang diberikan
        pelayan.getPesanan().setStatusDiproses(false); //set status diproses menjadi false pada objek Pesanan yang ada di objek Ojek yang diberikan
        pelayan.setPesanan(null); //mbuat objek Pesanan, yang terdapat di objek Ojek yang diberikan memiliki objek Ojek bernilai null
        ojekLepasPesanan(pelayan); //method ojekLepasPesanan dengan isi parameter objek Ojek yang diberikan
        //Method ini untuk mengubah status pesanan dan status tukang ojek yang telah menyelesaikan pesanan serta me-unlink masing-masing objek
    }
    
    public static void pesananDibatalkan (Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan()); //method ojekLepasPesanan dengan isi parameter objek Ojek yang dimiliki objek Pesanan yang diberikan
        pesan.setStatusSelesai(true); //set status selesai menjadi false pada objek Pesanan
        pesan.setStatusDiproses(false); //set status diproses menjadi false pada objek Pesanan
        pesan.getPelayan().setPesanan(null); //buat objek Pesanan memiliki objek Ojek yang bernilai null
        //Method ini untuk mengubah status pesanan dan status tukang ojek yang telah membatalkan pesanan serta me-unlink masing-masing objek
    }
    
    public static void pesananSelesai (Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusSelesai(true); //set status selesai menjadi true pada objek Pesanan
        pesan.setStatusDiproses(false); //set status diproses menjadi false pada objek Pesanan tersebut
        pesan.setPelayan(null); //mbuat objek Pesanan memiliki objek Ojek yang bernilai null
        //Method ini untuk mengubah status pesanan dan status tukang ojek yang telah menyelesaikan pesanan serta me-unlink masing-masing objek
    }
    
    public static void jalankanSistemPenugas() // digunakan untuk menugaskan ojek yang idle dengan pesanan yang belum diproses
    {
        Pesanan pesan = cariPesananIdle(); //Method ini memanggil method cariPesananIdle, untuk mendapatkan pesanan yang belum diproses.
        Ojek pelayan = temukanOjekTerdekat(pesan); //Method ini memanggil method temukanOjekTerdekat untuk mendapatkan Ojek terdekat untuk Pesanan yang didapat dari cariPesananIdle().
        
        pesananDitugaskan(pesan, pelayan);
    }
    
    public static void pesananDibatalkan (Pelanggan pengguna)
    {
        for (Pesanan daftar : DatabasePesanan.getDatabase()) {
            if(pengguna.getID() == daftar.getPelanggan().getID()) {
                daftar.setStatusSelesai(false);
                daftar.setStatusDiproses(false);
                daftar.getPelayan().setPesanan(null);
                ojekLepasPesanan(daftar.getPelayan());
            }
        }
    }
    
    public static void pesananSelesai (Pelanggan pengguna)
    {
        for (Pesanan daftar : DatabasePesanan.getDatabase()) {
            if(pengguna.getID() == daftar.getPelanggan().getID()) {
                daftar.setStatusSelesai(true);
                daftar.setStatusDiproses(false);
                daftar.getPelayan().setPesanan(null);
                ojekLepasPesanan(daftar.getPelayan());
            }
        }
    }
    
    public static void printAllDatabase()
    {
        System.out.println("Database Pesanan: " + DatabasePesanan.getDatabase());
        System.out.println("Database Ojek: " + DatabaseUser.getOjekDatabase());
        System.out.println("Database Pelanggan: " + DatabaseUser.getPelangganDatabase());
    }
    
    public static void printOjekDatabase()
    {
        System.out.println("Database Ojek: " + DatabaseUser.getOjekDatabase());
    }
    
    public static void printPelangganDatabase()
    {
        System.out.println("Database Pelanggan: " + DatabaseUser.getPelangganDatabase());
    }
    
    public static void printPesananDatabase()
    {
        System.out.println("Database Pesanan: " + DatabasePesanan.getDatabase());
    }
    
    private static Ojek temukanOjekTerdekat(Pesanan pesan)
    {
        double xOjek = 0;
        double yOjek = 0;
        double xPesan = 0;
        double yPesan = 0;
        double min = 0;
        double now = 0;
        int i = 0;
        int index = 0;
        int count = 0;
        ArrayList<Ojek> ojek_database = DatabaseUser.getOjekDatabase();
        
        for (Ojek daftar : ojek_database) {
            
            if (daftar.getStatus() == StatusOjek.Idle)
            {
                xOjek = daftar.getPosisi().getX();
                yOjek = daftar.getPosisi().getY();
                xPesan = pesan.getLokasiAwal().getX();
                yPesan = pesan.getLokasiAwal().getY();
                
                if(i==0) {
                    min = Math.sqrt(Math.pow(xOjek-xPesan, 2) + Math.pow(yOjek-yPesan, 2));
                    index = count;
                }
                
                now = Math.sqrt(Math.pow(xOjek-xPesan, 2) + Math.pow(yOjek-yPesan, 2));
                
                if(now < min) {
                    min = now;
                    index = count;
                }
                
                i++;
            }
            count++;            
        }
        
        return ojek_database.get(index);
        //Method ini digunakan untuk menemukan Ojek terdekat yang sedang idle dengan Pesanan yang diberikan.
    }
}
