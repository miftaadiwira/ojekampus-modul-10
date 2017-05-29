import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import javax.swing.*;
/**
 * GUI untuk Ojek login
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class OjekLoginGUI extends JFrame
{
    public OjekLoginGUI() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Ojek Login GUI");
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/biru.jpg")));

        JLabel IdLabel = new JLabel("ID");
        Font fontLabel = new Font("Courier", Font.BOLD, 13);
        IdLabel.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(IdLabel);
        IdLabel.setBounds(20, 20, 150, 30);
        JTextField TextIdOjek = new JTextField();
        frame.add(TextIdOjek);
        TextIdOjek.setBounds(45, 20, 100, 30);
        TextIdOjek.setVisible(true);
        TextIdOjek.setEnabled(true);
        TextIdOjek.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent click)
            {
                TextIdOjek.setText("");
                TextIdOjek.setForeground(new Color(0,102,102));
            }
            
            @Override
            public void focusLost(FocusEvent click)
            {
                
            }
        });
        
        JLabel InfoLabel = new JLabel("Informasi Pesanan");
        frame.setLayout(null);
        frame.add(InfoLabel);
        InfoLabel.setFont(fontLabel);
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
        JButton ButtonEnter = new JButton("Enter");
        frame.add(ButtonEnter);
        Font fontButton = new Font("Courier", Font.BOLD, 13);
        ButtonEnter.setFont(fontButton);
        ButtonEnter.setBackground(Color.orange);
        ButtonEnter.setBounds(150, 20, 70, 30);
        ButtonEnter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText()));
                TextInfo.setText((DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText())).toString()));
            }
        });
                
        JButton ButtonAccept = new JButton("Accept");
        frame.add(ButtonAccept);
        ButtonAccept.setFont(fontButton);
        ButtonAccept.setBackground(Color.orange);
        ButtonAccept.setBounds(20, 150, 95, 30);
        ButtonAccept.setVisible(true);
        ButtonAccept.setEnabled(true);
        ButtonAccept.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText()));
                TextInfo.setText((DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText())).toString()));
            }
        });
        
        JButton ButtonDecline = new JButton("Decline");
        frame.add(ButtonDecline);
        ButtonDecline.setFont(fontButton);
        ButtonDecline.setBackground(Color.orange);
        ButtonDecline.setBounds(120, 150, 95, 30);
        ButtonDecline.setVisible(true);
        ButtonDecline.setEnabled(true);
        ButtonDecline.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                Administrasi.pesananDibatalkan(DatabaseUser.getUserOjek(Integer.parseInt(TextIdOjek.getText())));
            }
        });
    }
    
    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new OjekLoginGUI();
            }
        });
    }
}
