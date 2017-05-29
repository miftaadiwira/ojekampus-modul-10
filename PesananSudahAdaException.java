/**
 * Ini merupakan kelas Exception apabila telah terdapat pesanan sebelumnya
 * 
 * @author Mifta Adiwira    
 * @version 26 mei 2017
 */
public class PesananSudahAdaException extends Exception
{
    // instance variables - replace the example below with your own
    private Pesanan pesanan_error;

    /**
     * Constructor for objects of class PesananSudahAdaException
     */
    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        super("\nPelanggan dengan nama ");
        this.pesanan_error = pesanan_input;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getMessage()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan dengan tipe layanan " + pesanan_error.getTipeLayanan();
    }
}
