import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.UIManager.LookAndFeelInfo;
import java.util.Date;
import java.text.DateFormat;
/**
 * GUI untuk Customer apakah akan registrasi atau login
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class CustomerGUI extends JFrame
{
    private JLabel jam;
    /**
     * Constructor for objects of class CustomerGUI
     */
    public CustomerGUI()
    {
        JFrame frame = new JFrame();
        
        frame.setTitle("Customer GUI");
        frame.setSize(200, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/biru.jpg")));
        
        JLabel label = new JLabel("Customer");
        Font fontLabel = new Font("Courier", Font.BOLD, 15);
        label.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(label);
        label.setBounds(65, 20, 150, 30);
        
        JButton ButtonRegis = new JButton("Registrasi");
        frame.add(ButtonRegis);
        Font fontButton = new Font("Courier", Font.BOLD, 13);
        ButtonRegis.setFont(fontButton);
        ButtonRegis.setBackground(Color.orange);
        ButtonRegis.setBounds(45, 70, 105, 30);
        ButtonRegis.setEnabled(true);
        ButtonRegis.setVisible(true);
        ButtonRegis.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent click) 
			{
				new RegistGUI();
			}
			});
        
        JButton ButtonPesan = new JButton("Pemesanan");
        frame.add(ButtonPesan);
        ButtonPesan.setFont(fontButton);
        ButtonPesan.setBackground(Color.orange);
        ButtonPesan.setBounds(45, 110, 105, 30);
        ButtonPesan.setEnabled(true);
        ButtonPesan.setVisible(true);
        ButtonPesan.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent click) 
			{
				new PesananGUI();
			}
			});
        
        JButton ButtonTunggu = new JButton("Menunggu");
        frame.add(ButtonTunggu);
        ButtonTunggu.setFont(fontButton);
        ButtonTunggu.setBackground(Color.orange);
        ButtonTunggu.setBounds(45, 150, 105, 30);
        ButtonTunggu.setEnabled(true);
        ButtonTunggu.setVisible(true);
        ButtonTunggu.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent click) 
			{
				new TungguGUI();
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
                new CustomerGUI();
            }
        });
    }
}
