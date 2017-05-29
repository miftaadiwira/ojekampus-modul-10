import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
/**
 * @author Mifta Adiwira    
 * @version 26 mei 2017
 * Class DatabaseUser adalah class yang digunakan untuk memanggil objek DatabaseUser
 * Objek DatabaseUSer dipanggil untuk mennyimpan id dan nama.
 */
public class DatabaseUser
{
    // instance variables - replace the example below with your own
    private static ArrayList<User> user_database = new ArrayList<User>();
    private static int id_ojek_terakhir = 1;
    private static int id_pelanggan_terakhir = 1;
    private static JFrame pesan = new JFrame();
    
    /** Method ini berfungsi untuk menambah pelanggan 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */ 
    public static boolean addPelanggan (Pelanggan baru)
    {
        for(User list : user_database)
        {
            if(baru.getID()==list.getID())
            {
                if(list instanceof Pelanggan)
                {
                    System.out.println("Penambahan pelanggan ke database tidak berhasil dilakukan");
                    JOptionPane.showMessageDialog(pesan, "Pelanggan gagal didaftarkan pada database", "Pesan", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
        
        user_database.add(baru);
        id_pelanggan_terakhir++;
        System.out.println("Penambahan pelanggan ke database sudah berhasil dilakukan ");
        JOptionPane.showMessageDialog(pesan, "Pelanggan baru berhasil didaftarkan pada database!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
    
    /** Method ini berfungsi untuk menghapus pelanggan 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */
    public static boolean removePelanggan (int id)
    {
        for(User list : user_database)
        {
            if(id == list.getID())
            {
                if(list instanceof Pelanggan)
                {
                    user_database.remove(list);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /** Method ini berfungsi untuk menambah ojek 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */
    public static boolean addOjek (Ojek baru)
    {
        for(User list : user_database)
        {
            if(baru.getID()==list.getID())
            {
                if(list instanceof Ojek)
                {
                    System.out.println("Penambahan ojek ke database tidak berhasil dilakukan");
                    JOptionPane.showMessageDialog(pesan, "Ojek gagal didaftarkan pada database", "Pesan", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
        
        user_database.add(baru);
        id_ojek_terakhir++;
        System.out.println("Penambahan ojek ke database berhasil dilakukan");
        JOptionPane.showMessageDialog(pesan, "Ojek baru berhasil didaftarkan pada database!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
    
    /** Method ini berfungsi untuk menghapus ojek 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */
    public static boolean removeOjek (int id)
    {
        for(User list : user_database)
        {
            if(id == list.getID())
            {
                if(list instanceof Ojek)
                {
                    user_database.remove(list);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /** Method ini berfungsi untuk mengambil (get) id dari ojek terakhir
    * @return id_ojek_terakhir, berfungsi mengembalikan nilai id dari ojek terakhir.
    */
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
    
    /** Method ini berfungsi untuk mengambil (get) id dari pelanggan terakhir
    * @return id_pelanggan_terakhir, berfungsi mengembalikan nilai id dari pelanggan terakhir.
    */
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
    
    /** Method ini berfungsi untuk mengambil (get) nama dari ojek
    * @return ojek_database, berfungsi mengembalikan nilai nama dari ojek.
    */
    public static Ojek getUserOjek(int id)
    {
        for (User list : user_database) 
        {
            if(id == (list.getID())) 
            {
                if(list instanceof Ojek)
                {
                    JOptionPane.showMessageDialog(pesan, "Ojek ditemukan!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                    return (Ojek)list;
                }
            }
        }
        JOptionPane.showMessageDialog(pesan, "ID Ojek tidak terdaftar dalam database!", "Pesan", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    /** Method ini berfungsi untuk mengambil (get) nama dari pelanggan
    * @return pelanggan_database, berfungsi mengembalikan nilai nama dari pelanggan.
    */
    public static Pelanggan getUserPelanggan(int id)
    {
        for (User list : user_database) 
        {
            if(id == (list.getID())) 
            {
                if(list instanceof Pelanggan)
                {
                    JOptionPane.showMessageDialog(pesan, "Pelanggan ditemukan!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                    return (Pelanggan)list;
                }
            }
        }
        JOptionPane.showMessageDialog(pesan, "ID Pelanggan tidak ditemukan!", "Pesan", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    public static ArrayList<Ojek> getOjekDatabase()
    {
        ArrayList<Ojek> ojek_database = new ArrayList<Ojek>();
        
        for(User list : user_database)
        {
            if(list instanceof Ojek)
            {
                ojek_database.add((Ojek)list);
            }
        }
        return ojek_database;
    }
    
    public static ArrayList<Pelanggan> getPelangganDatabase()
    {
        ArrayList<Pelanggan> pelanggan_database = new ArrayList<Pelanggan>();
        
        for(User list : user_database)
        {
            if(list instanceof Pelanggan)
            {
                pelanggan_database.add((Pelanggan)list);
            }
        }
        
        return pelanggan_database;
    }
}
