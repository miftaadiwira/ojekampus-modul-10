/**
 * Ini merupakan kelas Enum Tipe Layanan
 * Tipe Layanan dari program ojekampus terdiri dari AntarOrang, AntarBarang, dan BeliBarang
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public enum TipeLayanan
{
  AntarOrang("Antar Orang"),
  AntarBarang("Antar Barang"),
  BeliBarang("Beli Barang");  
  
  private String deskripsi;
  
  TipeLayanan (String deskripsi) 
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
