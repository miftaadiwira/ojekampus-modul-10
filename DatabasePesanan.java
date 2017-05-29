
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * @author Mifta Adiwira
 * @version 26 mei 2017
 * Class DatabasePesanan adalah class yang digunakan untuk memanggil objek DatabasePesanan
 * Objek DatabasePesanan dipanggil untuk menyimpan data pesanan.
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> listPesanan = new ArrayList<>();
    private static JFrame pesanframe = new JFrame();
    /** Method ini berfungsi untuk menghapus pesanan 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */
    public static boolean hapusPesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        Administrasi adm = new Administrasi();
        for(Pesanan daftar:listPesanan)
        {
            if(daftar.getPelanggan().equals(pesan.getPelanggan()))
            {
                if(!(daftar.getPelayan().equals(null)))
                {
                    adm.pesananSelesai(pesan);
                    return true;
                }
            }
            else
            {
                throw new PesananTidakDitemukanException(pesan);
            }
        }
        throw new PesananTidakDitemukanException(pesan);
    }
    
    /** Method ini berfungsi untuk menghapus pesanan 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */
    public static boolean hapusPesanan(Pelanggan pengguna) throws PesananOlehPelangganDitemukanException
    {
        Administrasi adm = new Administrasi();
        for(Pesanan daftar:listPesanan)
        {
            if(daftar.getPelanggan().equals(pengguna))
            {
                if(!(daftar.getPelayan().equals(null)))
                {
                    adm.pesananSelesai(pengguna);
                    return true;
                }
            }
            else
            {
                throw new PesananOlehPelangganDitemukanException(pengguna);
            }
        }
        throw new PesananOlehPelangganDitemukanException(pengguna);
        //mencari pesanan yang dilakukan oleh pelanggan.
        //Jika pesanan tersebut sudah memiliki pelayan, pesanan tersebut dijadikan selesai secara administrasi.
    }
    
    /** Method ini berfungsi untuk mengambil (get) pesanan 
    * @return listPesanan, berfungsi mengembalikan nilai ke listPesanan.
    */
    public static Pesanan getPesanan(Pelanggan pengguna)
    {
        for (Pesanan daftar : listPesanan) {
           if(pengguna.equals(daftar.getPelanggan())) {
               return daftar;
            }
       }
       return null;
       //mencari pesanan yang sedang dilakukan pengguna
    }
    
    public static ArrayList<Pesanan> getDatabase()
    {
        return listPesanan;
    }
    
    public static boolean addPesanan(Pesanan pesan)throws PesananSudahAdaException
    {
       for (Pesanan daftar : listPesanan) {
           if( pesan.getPelanggan().equals(daftar.getPelanggan())) 
           {
               throw new PesananSudahAdaException(daftar);
           }
       }
       JOptionPane.showMessageDialog(pesanframe, "Pesanan Anda telah berhasil dilakukan!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
       listPesanan.add(pesan);
       return true;
       //Pesanan hanya akan berhasil apabila pelanggan yang memesan tidak sedang melakukan pemesanan lainnya.
    }
}
    
