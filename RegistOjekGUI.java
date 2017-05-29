import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import javax.swing.*;
/**
 * GUI untuk Ojek registrasi
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class RegistOjekGUI extends JFrame
{
    public RegistOjekGUI() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Registrasi Ojek GUI");
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/biruu.jpg")));
        
        JLabel InputNama = new JLabel("Nama :");
        frame.setLayout(null);
        frame.add(InputNama);
        Font fontLabel = new Font("Courier", Font.BOLD, 13);
        InputNama.setFont(fontLabel);
        InputNama.setBounds(20, 20, 200, 30);
        JTextField TextNama = new JTextField();
        frame.add(TextNama);
        TextNama.setBounds(90, 20, 200, 30);
        TextNama.setText("Nama anda");
        TextNama.setVisible(true);
        TextNama.setEnabled(true);
        TextNama.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextNama.setText("");
                TextNama.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            { 
            }
        });
        
        JLabel InputTelepon = new JLabel("Telepon :");
        frame.setLayout(null);
        frame.add(InputTelepon);
        InputTelepon.setFont(fontLabel);
        InputTelepon.setBounds(20, 60, 200, 30);
        JTextField TextTelepon = new JTextField();
        frame.add(TextTelepon);
        TextTelepon.setBounds(90, 60, 200, 30);
        TextTelepon.setText("08xxxxxxxxxx");
        TextTelepon.setVisible(true);
        TextTelepon.setEnabled(true);
        TextTelepon.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextTelepon.setText("");
                TextTelepon.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InputEmail = new JLabel("Email :");
        frame.setLayout(null);
        frame.add(InputEmail);
        InputEmail.setFont(fontLabel);
        InputEmail.setBounds(20, 100, 200, 30);
        JTextField TextEmail = new JTextField();
        frame.add(TextEmail);
        TextEmail.setBounds(90, 100, 200, 30);
        TextEmail.setText("miftaadiwira@gmail.com");
        TextEmail.setVisible(true);
        TextEmail.setEnabled(true);
        TextEmail.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextEmail.setText("");
                TextEmail.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InputDob = new JLabel("DoB :");
        frame.setLayout(null);
        frame.add(InputDob);
        InputDob.setFont(fontLabel);
        InputDob.setBounds(20, 140, 200, 30);
        JTextField TextDob = new JTextField();
        frame.add(TextDob);
        TextDob.setBounds(90, 140, 200, 30);
        TextDob.setText("dd/mm/yy");
        TextDob.setVisible(true);
        TextDob.setEnabled(true);
        TextDob.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextDob.setText("");
                TextDob.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InputPlat = new JLabel("Plat :");
        frame.setLayout(null);
        frame.add(InputPlat);
        InputPlat.setFont(fontLabel);
        InputPlat.setBounds(20, 180, 200, 30);
        JTextField TextPlat = new JTextField();
        frame.add(TextPlat);
        TextPlat.setBounds(90, 180, 200, 30);
        TextPlat.setText("Plat Motor Anda");
        TextPlat.setVisible(true);
        TextPlat.setEnabled(true);
        TextPlat.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextPlat.setText("");
                TextPlat.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InputLokasi = new JLabel("Lokasi :");
        frame.setLayout(null);
        frame.add(InputLokasi);
        InputLokasi.setFont(fontLabel);
        InputLokasi.setBounds(20, 220, 200, 30);
        InputLokasi.setVisible(true);
        InputLokasi.setEnabled(true);
        
        JTextField TextLokasiX = new JTextField();
        frame.add(TextLokasiX);
        TextLokasiX.setBounds(90, 220, 50, 30);
        TextLokasiX.setText("X");
        TextLokasiX.setVisible(true);
        TextLokasiX.setEnabled(true);
        TextLokasiX.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextLokasiX.setText("");
                TextLokasiX.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField TextLokasiY = new JTextField();
        frame.add(TextLokasiY);
        TextLokasiY.setBounds(150, 220, 50, 30);
        TextLokasiY.setText("Y");
        TextLokasiY.setVisible(true);
        TextLokasiY.setEnabled(true);
        TextLokasiY.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextLokasiY.setText("");
                TextLokasiY.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField TextNamaLokasi = new JTextField();
        frame.add(TextNamaLokasi);
        TextNamaLokasi.setBounds(90, 260, 70, 30);
        TextNamaLokasi.setText("Lokasi");
        TextNamaLokasi.setVisible(true);
        TextNamaLokasi.setEnabled(true);
        TextNamaLokasi.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextNamaLokasi.setText("");
                TextNamaLokasi.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JTextField TextKeterangan = new JTextField();
        frame.add(TextKeterangan);
        TextKeterangan.setBounds(170, 260, 90, 30);
        TextKeterangan.setText("Keterangan");
        TextKeterangan.setVisible(true);
        TextKeterangan.setEnabled(true);
        TextKeterangan.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextKeterangan.setText("");
                TextKeterangan.setForeground(new Color(0,0,100));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JButton RegisOjek = new JButton("Registrasi");
        frame.add(RegisOjek);
        RegisOjek.setFont(fontLabel);
        RegisOjek.setBackground(Color.orange);
        RegisOjek.setBounds(90, 300, 95, 30);
        RegisOjek.setVisible(true);
        RegisOjek.setEnabled(true);
        RegisOjek.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.addOjek(new Ojek(DatabaseUser.getIDOjekTerakhir(), TextNama.getText(), new Lokasi(TextNamaLokasi.getText(), Integer.parseInt(TextLokasiX.getText()), Integer.parseInt(TextLokasiY.getText()), TextKeterangan.getText())));
                Administrasi.printOjekDatabase();
            }
        });
    }
    
    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new RegistOjekGUI();
            }
        });
    }
}
