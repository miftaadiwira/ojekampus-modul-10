import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import javax.swing.*;
/**
 * GUI untuk Customer registrasi
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class RegistGUI extends JFrame
{
    /**
     * Constructor for objects of class CustomerGUI
     */
    public RegistGUI() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Registrasi Customer");
        frame.setSize(300, 280);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/biru.jpg")));
        
        JLabel InputNama = new JLabel("Nama");
        frame.setLayout(null);
        frame.add(InputNama);
        Font fontLabel = new Font("Courier", Font.BOLD, 13);
        InputNama.setFont(fontLabel);
        InputNama.setBounds(20, 20, 150, 30);
        InputNama.setBackground(Color.orange);
        JTextField TextNama = new JTextField();
        frame.add(TextNama);
        TextNama.setBounds(90, 20, 150, 30);
        TextNama.setVisible(true);
        TextNama.setEnabled(true);
        
        JLabel InputTelepon = new JLabel("Telepon");
        frame.setLayout(null);
        frame.add(InputTelepon);
        InputTelepon.setFont(fontLabel);
        InputTelepon.setBounds(20, 60, 150, 30);
        InputTelepon.setBackground(Color.orange);
        JTextField TextTelepon = new JTextField();
        frame.add(TextTelepon);
        TextTelepon.setBounds(90, 60, 150, 30);
        TextTelepon.setText("08xxxxxxxxxx");
        TextTelepon.setVisible(true);
        TextTelepon.setEnabled(true);
        TextTelepon.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextTelepon.setText("");
                TextTelepon.setForeground(new Color(0,0,153));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        
        JLabel InputEmail = new JLabel("Email");
        frame.setLayout(null);
        frame.add(InputEmail);
        InputEmail.setBounds(20, 100, 150, 30);
        InputEmail.setFont(fontLabel);
        InputEmail.setBackground(Color.orange);
        JTextField TextEmail = new JTextField();
        frame.add(TextEmail);
        TextEmail.setBounds(90, 100, 150, 30);
        TextEmail.setText("miftaadiwira@gmail.com");
        TextEmail.setVisible(true);
        TextEmail.setEnabled(true);
        TextEmail.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextEmail.setText("");
                TextEmail.setForeground(new Color(0,0,153));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });

        JLabel InputDob = new JLabel("DoB");
        frame.setLayout(null);
        frame.add(InputDob);
        InputDob.setBounds(20, 140, 150, 30);
        InputDob.setFont(fontLabel);
        InputDob.setBackground(Color.orange);
        JTextField TextDob = new JTextField();
        frame.add(TextDob);
        TextDob.setBounds(90, 140, 150, 30);
        TextDob.setText("dd/mm/yy");
        TextDob.setVisible(true);
        TextDob.setEnabled(true);
        TextDob.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextDob.setText("");
                TextDob.setForeground(new Color(0,0,153));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JButton regis = new JButton("Registrasi");
        frame.add(regis);
        regis.setBackground(Color.orange);
        Font fontButton = new Font("Courier", Font.BOLD, 13);
        regis.setFont(fontButton);
        regis.setBounds(140, 190, 95, 30);
        regis.setVisible(true);
        regis.setEnabled(true);
        regis.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                DatabaseUser.addPelanggan(new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), TextNama.getText(), TextTelepon.getText()));
                Administrasi.printPelangganDatabase();
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
                new RegistGUI();
            }
        });
    }
}
