
/**
 * @author Mifta Adiwira
 * @version 26 mei 2017
 * Class Pesanan adalah class yang digunakan untuk memanggil objek Pesanan
 * Objek Pesanan dipanggil sebagai penghubung dari/ke class lainnya.
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    Ojek pelayan = null;
    Pelanggan pengguna;
    String pelanggan_awal;
    String pelanggan_akhir;
    double biaya;
    TipeLayanan layanan;
    Lokasi lokasi_awal;
    Lokasi lokasi_akhir;
    boolean diproses = false;
    boolean selesai = false;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.pelanggan_awal = pelanggan_awal;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
    }
    
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal,String pelanggan_akhir)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir; 
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;               
    }
    
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal,String pelanggan_akhir, double biaya)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;        
        this.biaya = biaya;
    }
    
    public String toString()
    {
        String final_status = "KOSONG";
        if(getStatusDiproses()==true && getStatusSelesai()==false)
        {
            final_status = "DIPROSES";
        }
        else if(getStatusDiproses()==false && getStatusSelesai()==false)
        {
            final_status = "KOSONG";
        }
        else if(getStatusDiproses()==false && getStatusSelesai()==true)
        {
            final_status = "SELESAI";
        }
        
        if(pelayan==null)
        {
            if(pelanggan_akhir != null)
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke " + pelanggan_akhir + " di " + 
                lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " + final_status + " || ");
            }
            else
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke " + lokasi_akhir.getNama() + 
                " dengan layanan " + layanan + " status " + final_status + " || ");
            }
        }
        else
        {
            if(pelanggan_akhir != null)
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke " + pelanggan_akhir + " di " + 
                lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " + final_status + " || Diproses oleh " + pelayan.getNama());
            }
            else
            {
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke "+ lokasi_akhir.getNama() + 
                " dengan layanan " + layanan + " status " + final_status + " || Diproses oleh " + pelayan.getNama());
            }
        }
    }
    //public void printData()
    //{
        //System.out.println("Lokasi Awal:" + this.lokasi_awal);
        //System.out.println("Lokasi Akhir:" + this.lokasi_akhir);
        //System.out.println("Pilih Layanan:" + this.layanan);
        //System.out.println("Pelanggan Awal:" + this.pelanggan_awal);
        //System.out.println("Pelanggan Akhir:" + this.pelanggan_akhir);
        //System.out.println("Status Diproses:" + this.diproses);
        //System.out.println("Status Selesai:" + this.selesai);
    //}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */    
    public Ojek getPelayan()
    {
        return pelayan;
    }
    
     /** Method ini berfungsi untuk mengambil (get) Pelanggan
    * @return pengguna, berfungsi untuk mengembalikan nilai dari pengguna.
    */
    public Pelanggan getPelanggan()
    {
        return pengguna;
    }
    
    /** Method ini berfungsi untuk mengambil (get) pengguna awal
    * @return null, berfungsi untuk mengambil nilai hingga null.
    */
    public String getPenggunaAwal()
    {
        return pelanggan_awal;
    }
    
    /** Method ini berfungsi untuk mengambil (get) pengguna akhir
    * @return null, berfungsi untuk mengambil nilai hingga null.
    */
    public String getPenggunaAkhir()
    {
        return pelanggan_akhir;
    }
    
    /** Method ini berfungsi untuk mengambil (get) biaya pemesanan
    * @return 0, berfungsi untuk mengembalikan nilai dari biaya pemesanan.
    */
    public double getBiaya()
    {
        return biaya;
    }
    
        /** Method ini berfungsi untuk mengambil (get) tipe layanan
    * @return null, berfungsi untuk mengambil nilai hingga null.
    */
    public TipeLayanan getTipeLayanan()
    {
        return layanan;
    }  
    
    /** Method ini berfungsi untuk mengambil (get) Lokasi Awal
    * @return lokasi_awal, berfungsi untuk mengembalikan nilai dari lokasi_awal.
    */
    public Lokasi getLokasiAwal()
    {
        return lokasi_awal;
    }
    
    /** Method ini berfungsi untuk mengambil (get) Lokasi Akhir
    * @return lokasi_awal, berfungsi untuk mengembalikan nilai dari lokasi_akhir.
    */
    public Lokasi getLokasiAkhir()
    {
        return lokasi_akhir;
    }      
    
    public boolean getStatusDiproses()
    {
        return diproses;
    }
    
    public boolean getStatusSelesai()
    {
        return selesai;
    }
    
    public void setPelayan (Ojek pelayan)
    {
        this.pelayan=pelayan;
    }
    
    public void setPelanggan (Pelanggan pengguna)
    {
        this.pengguna=pengguna;
    }
    
    public void setPenggunaAwal (String pelangan_awal)
    {
        this.pelanggan_awal=pelanggan_awal;
    }
    
    public void setPenggunaAkhir (String pelanggan_akhir)
    {
        this.pelanggan_akhir=pelanggan_akhir;
    }
    
    public void setBiaya (double biaya)
    {
        this.biaya=biaya;
    }
    
    public void setTipeLayanan (TipeLayanan layanan)
    {
        this.layanan=layanan;
    }
    
    public void setLokasiAwal (Lokasi lokasi_awal)
    {
        this.lokasi_awal=lokasi_awal;
    }
    
    public void setLokasiAkhir (Lokasi lokasi_akhir)
    {
        this.lokasi_akhir=lokasi_akhir;
    }
    
    public void setStatusDiproses (boolean diproses)
    {
        this.diproses=diproses;
    }
    
    public void setStatusSelesai (boolean selesai)
    {
        this.selesai=selesai;
    }
}
