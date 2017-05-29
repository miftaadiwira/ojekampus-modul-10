
/**
 * @author Mifta Adiwira
 * @version 26 mei 2017
 * Class Lokasi adalah class yang digunakan untuk memanggil objek Lokasi
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private String nama_lokasi;
    private String keterangan_lokasi;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi)
    {
        this.nama_lokasi = nama_lokasi;
        this.x = x;
        this.y = y;
        this.keterangan_lokasi = keterangan_lokasi;
    }
    
    public void printData()
    {
        System.out.println("Koordinat x:" +x);
        System.out.println("Koordinat y:" +y);
        System.out.println("Keterangan Lokasi:" +keterangan_lokasi);
    }

    /** Method ini berfungsi untuk mengambil (get) koordinat x
    * @return 0 , koordinat x dari lokasi
    */
    public double getX()
    {
        // put your code here
        return x;
    }
    
    /** Method ini berfungsi untuk mengambil (get) koordinat y
    * @return 0 , koordinat y dari lokasi
    */
    public double getY()
    {
        // put your code here
        return y;
    }
    
    /** Method ini berfungsi untuk mengambil (get) nama lokasi
    * @return nama_lokasi , nama dari lokasi
    */
    public String getNama()
    {
        return nama_lokasi;
    }
    
    /** Method ini berfungsi untuk mengambil (get) keterangan lokasi
    * @return keterangan_lokasi , keterangan dari lokasi
    */
    public String getKeteranganLokasi()
    {
        return keterangan_lokasi;
    }
    
    /** Method ini berfungsi untuk menentukan (set) koordinat x lokasi
    * @parameter x , koordinat x dari lokasi
    */
    public void setX (double x)
    {
        this.x = x;
    }
    
    /** Method ini berfungsi untuk menentukan (set) koordinat y lokasi
    * @parameter y , koordinat y dari lokasi
    */
    public void setY (double y)
    {
        this.y = y;
    }
    
    /** Method ini berfungsi untuk menentukan (set) nama lokasi
    * @parameter nama , nama dari lokasi
    */
    public void setNama (String nama_lokasi)
    {
        this.nama_lokasi = nama_lokasi;
    }
    
    /** Method ini berfungsi untuk menentukan (set) keterangan lokasi
    * @parameter keterangan_lokasi , keterangan dari lokasi
    */
    public void getKeteranganLokasi (String keterangan_lokasi)
    {
    }
    
    public String toString()
    {
        return "daerah "+this.nama_lokasi + "("+this.x+","+this.y+") di "+this.keterangan_lokasi;
    }
}
