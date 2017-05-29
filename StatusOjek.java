
/**
 * Ini merupakan kelas enum Status Ojek
 * Status Ojek pada program ojekampus terdiri dari Idle (sedang tidak memmperoleh tugas), jemput, dan mengantar
 * 
 * @author Mifta Adiwira    
 * @version 26 mei 2017
 */
public enum StatusOjek
{
    Antar ("Mengantar"),
    Idle ("Idle"),
    Jemput("Menjemput");
    
    private String deskripsi;
    
    StatusOjek (String deskripsi) 
    {
        this.deskripsi=deskripsi;
    }
    
    public String getdeskripsi()
    {
        return deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
