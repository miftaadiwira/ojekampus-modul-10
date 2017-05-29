import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;
/**
 * @author Mifta Adiwira    
 * @version 26 mei 2017
 * Class Pelanggan adalah class yang digunakan untuk memanggil objek Pelanggan
 * Objek Pelanggan dipanggil untuk mengambil ID dan Nama Pelanggan
 */
public class Pelanggan extends User
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Pelanggan
     */
    public Pelanggan (int id, String nama, String telefon)
    {
        super(id,nama);
        setTelefon(telefon);
    }

    public String toString()
    {
        if(DatabasePesanan.getPesanan(this) != null)
        {
            return "(Nama: " + nama + ", ID: " + id + ", Telefon: " + telefon + ", Pengguna awal: " + DatabasePesanan.getPesanan(this).getPenggunaAwal() + ")";
        }
        else 
        {
            return "(Nama: " + nama + ", ID: " + id + ", Telefon: " + telefon  + ")";
        }  
    }
}
