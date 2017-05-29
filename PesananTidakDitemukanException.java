
/**
 * Ini merupakan kelas Exception apabila pesanan tidak ditemukan
 * 
 *@author Mifta Adiwira
 *@version 26 mei 2017
 */
public class PesananTidakDitemukanException extends Exception
{
    // instance variables - replace the example below with your own
    private Pesanan pesanan_error;

    /**
     * Constructor for objects of class PesananTidakDitemukanException
     */
    public PesananTidakDitemukanException(Pesanan pesanan_input)
    {
        super("Pesanan yang dipesan oleh");
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
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " tidak ditemukan";
    }
}
