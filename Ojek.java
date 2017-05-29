import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;

/**
 * @author Mifta Adiwira
 * @version 26 mei 2017
 * Class Ojek adalah class yang digunakan untuk memanggil objek Ojek
 * Objek Ojek dipanggil untuk mengambil ID, nama, status, dan lokasi ojek.
 */
public class Ojek extends User
{
    private StatusOjek status = StatusOjek.Idle;    
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang;
    private String no_plat;

    /**
     * Constructor for objects of class Ojek
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
       super(id, nama);
       this.posisi_sekarang = posisi_sekarang;
       
    }
    
     /** Method ini berfungsi untuk menentukan (set) pesanan ojek
    * @parameter pesanan_sekarang , pesanan sekarang dari ojek
    */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
     /** Method ini berfungsi untuk menentukan (set) posisi Ojek
    * @parameter posisi_sekarang , posisi sekarang dari ojek
    */
    public void setPosisi(Lokasi sekarang)
    {
        posisi_sekarang = sekarang;
    }
    
     /** Method ini berfungsi untuk menentukan (set) status Ojek
    * @parameter status , status dari ojek
    */
    public void setStatus(StatusOjek status)
    {
        this.status=status;
    }
    
     /** Method ini berfungsi untuk mendapatkan (get) pesanan Ojek
    * @return pesanan_sekarang , pesanan dari ojek
    */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /** Method ini berfungsi untuk mendapatkan (get) posisi Ojek
    * @return posisi_sekarang , posisi dari ojek
    */
    public Lokasi getPosisi()
    {
        return posisi_sekarang;
    }
    
    /** Method ini berfungsi untuk mendapatkan (get) pesanan Ojek
    * @return status , status dari ojek
    */
    public StatusOjek getStatus()
    {
        return status;
    }

    public String getNoPlat()
    {
        return no_plat;
    }
    
    public boolean setNoPlat (String no_plat)
    {
        Pattern pola = Pattern.compile("\\D\\d{1,4}\\D{2,3}");
        Matcher sama = pola.matcher(no_plat);
        if(sama.matches())
        {
            this.no_plat = no_plat;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        if(pesanan_sekarang == null) {
            return "(Nama: " + nama + ", ID: " + id + ", Status: " + status + ")";
        }
        else {
            return "(Nama: " + nama + ", ID:  " + id + ", Status " + status + ", Pesanan saat ini: " + pesanan_sekarang.getPelanggan().getNama() + ")";
        }
    }
}
