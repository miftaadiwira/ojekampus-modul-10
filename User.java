
import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;
/**
 * Ini merupakan class User dimana merupakan kelas yang menjadi 
 * hirarki utama bagi pengguna sehingga class Pelanggan dan class Ojek dapat meng-extend-nya
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class User
{
    protected int id;
    protected String nama;
    protected String telefon; 
    protected String email;
    protected Date dob;
    /**
     * Constructor for objects of class Pelanggan
     */
    public User (int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }

    /** Method ini berfungsi untuk mengambil (get) ID pelanggan
     * @return id , id dari pelanggan
     */
    public int getID()
    {
        return id;        
    }
    
    public Date getDOB()
    {
        return dob;
    }
    
    /** Method ini berfungsi untuk mengambil (get) nama pelanggan
    * @return nama , nama dari pelanggan
    */
    public String getNama()
    {
        return nama;
    }
    
    public boolean setTelefon (String telefon)
    {
        Pattern pola = Pattern.compile("\\d{1,12}");
        Matcher sama = pola.matcher(telefon);
        if(sama.matches())
        {
            this.telefon = telefon;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean setEmail(String email)
    {
        Pattern pola = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher sama = pola.matcher(email);
        if(sama.matches())
        {
            this.email = email;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void setDOB (int day, int month, int year)
    {
        dob =  new GregorianCalendar(year, month, day).getTime();
    }
    
    /** Method ini berfungsi untuk menentukan (set) id pelanggan
    * @parameter id , id dari pelanggan
    */
    public void setID (int id)
    {
        this.id = id;
    }
    
    /** Method ini berfungsi untuk menentukan (set) nama pelanggan
    * @parameter nama , nama dari pelanggan
    */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public String getTelefon()
    {
        return telefon;
    }
    
    public String getEmail()
    {
        return email;
    }
}
