import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import javax.swing.*;
/**
 * GUI untuk login tunggu
 * 
 * @author Mifta Adiwira
 * @version 26 Mei 2017
 */
public class TungguGUI extends JFrame
{
    public TungguGUI() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Tunggu GUI");
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/biru.jpg")));

        JLabel IdLabel = new JLabel("ID : ");
        Font fontLabel = new Font("Courier", Font.BOLD, 13);
        IdLabel.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(IdLabel);
        IdLabel.setBounds(20, 20, 150, 30);
        JTextField TextID = new JTextField();
        frame.add(TextID);
        TextID.setBounds(45, 20, 100, 30);
        TextID.setVisible(true);
        TextID.setEnabled(true);
        TextID.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextID.setText("");
                TextID.setForeground(new Color(0,102,102));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JButton ButtonEnter = new JButton("Enter");
        Font fontButton = new Font("Courier", Font.BOLD, 13);
        ButtonEnter.setFont(fontButton);
        ButtonEnter.setBackground(Color.orange);
        frame.add(ButtonEnter);
        ButtonEnter.setBounds(150, 20, 70, 30);
        
        JLabel InfoLabel = new JLabel("Informasi Pesanan");        
        InfoLabel.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(InfoLabel);
        InfoLabel.setBounds(60, 65, 150, 30);
        JTextField TextInfo = new JTextField();
        frame.add(TextInfo);
        TextInfo.setBounds(17, 90, 210, 30);
        TextInfo.setVisible(true);
        TextInfo.setEnabled(true);
        TextInfo.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextInfo.setText("");
                TextInfo.setForeground(new Color(0,102,102));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JButton ButtonAccept = new JButton("Accept");
        ButtonAccept.setFont(fontButton);
        frame.add(ButtonAccept);
        ButtonAccept.setBounds(25, 140, 95, 30);
        ButtonAccept.setBackground(Color.orange);
        ButtonAccept.setVisible(true);
        ButtonAccept.setEnabled(true);
        ButtonAccept.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                DatabaseUser.getUserPelanggan(Integer.parseInt(TextID.getText()));
                TextInfo.setText(DatabasePesanan.getPesanan((DatabaseUser.getUserPelanggan(Integer.parseInt(TextID.getText())))).toString());
            }
        });
        
        JButton ButtonDecline = new JButton("Decline");
        ButtonDecline.setFont(fontButton);
        frame.add(ButtonDecline);
        ButtonDecline.setBounds(123, 140, 95, 30);
        ButtonDecline.setBackground(Color.orange);
        ButtonDecline.setVisible(true);
        ButtonDecline.setEnabled(true);
        ButtonDecline.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                Administrasi.pesananDibatalkan(DatabaseUser.getUserPelanggan(Integer.parseInt(TextID.getText())));
            }
        });
        
        JButton ButtonDelete = new JButton("Delete");
        ButtonDelete.setFont(fontButton);
        frame.add(ButtonDelete);
        ButtonDelete.setBounds(75, 175, 95, 30);
        ButtonDelete.setBackground(Color.orange);
        ButtonDelete.setVisible(true);
        ButtonDelete.setEnabled(true);
        ButtonDelete.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                Administrasi.pesananSelesai(DatabaseUser.getUserPelanggan(Integer.parseInt(TextID.getText())));
            }
        });
    }
    
    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TungguGUI();
            }
        });
    }
}
