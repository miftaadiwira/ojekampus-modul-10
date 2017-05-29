import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import javax.swing.*;
/**
 * GUI untuk Pesanan
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class PesananGUI extends JFrame
{
    /**
     * Constructor for objects of class CustomerGUI
     */
    public PesananGUI() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Pemesanan Customer");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/biru.jpg")));
        
        JLabel InputID = new JLabel("ID");
        Font fontLabel = new Font("Courier", Font.BOLD, 13);
        InputID.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(InputID);
        InputID.setBounds(10, 10, 150, 30);
        JTextField TextID = new JTextField();
        frame.add(TextID);
        TextID.setBounds(100, 10, 150, 30);
        TextID.setVisible(true);
        TextID.setEnabled(true);
        TextID.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextID.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JButton ButtonEnter = new JButton("Enter");
        frame.add(ButtonEnter);
        ButtonEnter.setFont(fontLabel);
        ButtonEnter.setBackground(Color.orange);
        ButtonEnter.setBounds(260, 10, 100, 30);
        ButtonEnter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                DatabaseUser.getUserPelanggan(Integer.parseInt(TextID.getText()));
            }
        });
        
        JLabel InputLayanan = new JLabel("Tipe Layanan");
        InputLayanan.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(InputLayanan);
        InputLayanan.setBounds(10, 60, 150, 30);
        
        JComboBox <TipeLayanan> PilihLayanan = new JComboBox<>();
        PilihLayanan.setModel(new DefaultComboBoxModel<>(TipeLayanan.values()));
        PilihLayanan.setBackground(new Color(214,217,223));
        PilihLayanan.setForeground(new Color(0,0,153));
        PilihLayanan.setBounds(100, 60, 150, 30);
        frame.add(PilihLayanan);
        PilihLayanan.setEnabled(true);
        PilihLayanan.setVisible(true);
        
        JLabel LabelAwal = new JLabel("Lokasi Awal");
        LabelAwal.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(LabelAwal);
        LabelAwal.setBounds(10, 100, 150, 30);
        
        JTextField TextAwalX = new JTextField();
        frame.add(TextAwalX);
        TextAwalX.setBounds(100, 100, 25, 30);
        TextAwalX.setText("X");
        TextAwalX.setVisible(true);
        TextAwalX.setEnabled(true);
        TextAwalX.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextAwalX.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField TextAwalY = new JTextField();
        frame.add(TextAwalY);
        TextAwalY.setBounds(125, 100, 25, 30);
        TextAwalY.setText("Y");
        TextAwalY.setVisible(true);
        TextAwalY.setEnabled(true);
        TextAwalY.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextAwalY.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField LokAwal = new JTextField();
        frame.add(LokAwal);
        LokAwal.setBounds(150, 100, 100, 30);
        LokAwal.setText("Nama Lokasi");
        LokAwal.setVisible(true);
        LokAwal.setEnabled(true);
        LokAwal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                LokAwal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField KetAwal = new JTextField();
        frame.add(KetAwal);
        KetAwal.setBounds(260, 100, 100, 30);
        KetAwal.setText("Keterangan");
        KetAwal.setVisible(true);
        KetAwal.setEnabled(true);
        KetAwal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                KetAwal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });

        JLabel LabelAkhir = new JLabel("Lokasi Akhir");
        LabelAkhir.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(LabelAkhir);
        LabelAkhir.setBounds(10, 140, 150, 30);
        
        JTextField TextAkhirX = new JTextField();
        frame.add(TextAkhirX);
        TextAkhirX.setBounds(100, 140, 25, 30);
        TextAkhirX.setText("X");
        TextAkhirX.setVisible(true);
        TextAkhirX.setEnabled(true);
        TextAkhirX.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextAkhirX.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField TextAkhirY = new JTextField();
        frame.add(TextAkhirY);
        TextAkhirY.setBounds(125, 140, 25, 30);
        TextAkhirY.setText("Y");
        TextAkhirY.setVisible(true);
        TextAkhirY.setEnabled(true);
        TextAkhirY.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextAkhirY.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField LokAkhir = new JTextField();
        frame.add(LokAkhir);
        LokAkhir.setBounds(150, 140, 100, 30);
        LokAkhir.setText("Nama Lokasi");
        LokAkhir.setVisible(true);
        LokAkhir.setEnabled(true);
        LokAkhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                LokAkhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField KetAkhir = new JTextField();
        frame.add(KetAkhir);
        KetAkhir.setBounds(260, 140, 100, 30);
        KetAkhir.setText("Keterangan");
        KetAkhir.setVisible(true);
        KetAkhir.setEnabled(true);
        KetAkhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                KetAkhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InputNpAwal = new JLabel("NP Awal");
        InputNpAwal.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(InputNpAwal);
        InputNpAwal.setBounds(10, 180, 150, 30);
        JTextField TextNpAwal = new JTextField();
        frame.add(TextNpAwal);
        TextNpAwal.setBounds(100, 180, 150, 30);
        TextNpAwal.setVisible(true);
        TextNpAwal.setEnabled(true);
        TextNpAwal.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextNpAwal.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InputNpAkhir = new JLabel("NP Akhir");
        InputNpAkhir.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(InputNpAkhir);
        InputNpAkhir.setBounds(10, 220, 150, 30);
        JTextField TextNpAkhir = new JTextField();
        frame.add(TextNpAkhir);
        TextNpAkhir.setBounds(100, 220, 150, 30);
        TextNpAkhir.setVisible(true);
        TextNpAkhir.setEnabled(true);
        TextNpAkhir.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextNpAkhir.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InputBiaya = new JLabel("Biaya");
        InputBiaya.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(InputBiaya);
        InputBiaya.setBounds(10, 260, 150, 30);
        JTextField TextBiaya = new JTextField();
        frame.add(TextBiaya);
        TextBiaya.setBounds(100, 260, 150, 30);
        TextBiaya.setVisible(true);
        TextBiaya.setEnabled(true);
        TextBiaya.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextBiaya.setText("");
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JButton ButtonPesan = new JButton("Pesan");
        ButtonPesan.setFont(fontLabel);
        frame.add(ButtonPesan);
        ButtonPesan.setBackground(Color.orange);
        ButtonPesan.setBounds(260, 300, 100, 30);
        ButtonPesan.setVisible(true);
        ButtonPesan.setEnabled(true);
        ButtonPesan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                try
                {
                    DatabasePesanan.addPesanan(new Pesanan(DatabaseUser.getUserPelanggan(Integer.parseInt(TextID.getText())), (TipeLayanan)PilihLayanan.getSelectedItem(), new Lokasi(LokAwal.getText(), Integer.parseInt(TextAwalX.getText()), Integer.parseInt(TextAwalY.getText()), KetAwal.getText()), new Lokasi(LokAkhir.getText(), Integer.parseInt(TextAkhirX.getText()), Integer.parseInt(TextAkhirY.getText()), KetAkhir.getText()), TextNpAwal.getText(), TextNpAkhir.getText(), Integer.parseInt(TextBiaya.getText())));
                    Administrasi.printPesananDatabase();
                    Administrasi.jalankanSistemPenugas();
                }
                catch(PesananSudahAdaException sudah_ada)
                {
                    System.out.println(sudah_ada.getMessage());
                }
            }
        });
    }
    
     public static void main(String[] args)
     {
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new PesananGUI();
            }
        });
    }
}