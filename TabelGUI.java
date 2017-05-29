import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Kelas ini merupakan kelas yang akan menampilkan beberapa informasi dari Database Pesanan 
 * Apabila pesanan sudah dilakukan, data-datanya akan masuk ke tabel ini 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class TabelGUI extends JFrame
{
    private JTable tabel_pesanan;
    private DefaultTableModel tabel;
    private String[] judul_kolom = {"Pelanggan", "Lokasi Awal", "Pengguna Awal", "Lokasi Akhir", "Pengguna Akhir", "Ojek", "Status"};
    
    public class Tabel extends DefaultTableModel
    {

    }
    /**
     * Constructor for objects of class TabelGUI
     */
    public TabelGUI()
    {
        this.setTitle("Tabel Pesanan GUI");
        this.setSize(800,500);
 
        tabel = new Tabel();
        tabel.setColumnIdentifiers(judul_kolom);
        tabel_pesanan = new JTable(tabel);
        tabel_pesanan.setBackground(Color.white);
        tabel_pesanan.setFillsViewportHeight(true);
        add(new JScrollPane(tabel_pesanan));
        
        setVisible(true);
    
        daftarpesanan();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void daftarpesanan()
    {
        ArrayList<Pesanan> list_pesanan = DatabasePesanan.getDatabase();
        String[] kolom = judul_kolom;
        for(Pesanan pesan : list_pesanan)
        {
            kolom[0] = pesan.getPelanggan().getNama();
            kolom[1] = pesan.getLokasiAwal().getNama();
            kolom[2] = pesan.getPenggunaAwal();
            kolom[3] = pesan.getLokasiAkhir().getNama();
            kolom[4] = pesan.getPenggunaAkhir();
            kolom[5] = pesan.getPelayan().getNama();
            tabel.addRow(kolom);
        }
    }
    
    public static void main(String[] args)
    {
        new TabelGUI();
    }
}
