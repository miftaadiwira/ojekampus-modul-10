import javax.swing.UIManager.LookAndFeelInfo;
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
import javax.swing.*;
import javax.swing.JComponent;
/**
 * Ini adalah kelas GUI pembuka untuk memulai aplikasi Ojekampus
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class MainGUI extends JFrame
{
    public MainGUI() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Ojek GUI");
        frame.setSize(600, 350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/Ojek-Online.png")));
        
        JLabel label1 = new JLabel("Selamat Datang di Ojekampus");
        Font fontLabel = new Font("Courier", Font.BOLD, 25);
        label1.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(label1);
        label1.setBounds(130, 2, 400, 30);
        
        JLabel label2 = new JLabel("Apakah Anda Seorang :");
        Font fontLabel2 = new Font("Courier", Font.BOLD, 15);
        label2.setFont(fontLabel2);
        frame.setLayout(null);
        frame.add(label2);
        label2.setBounds(230, 40, 200, 30);
        
        JButton ButtonReg = new JButton("Pelanggan");
        frame.add(ButtonReg);
        Font fontButton = new Font("Courier", Font.BOLD, 13);
        ButtonReg.setFont(fontButton);
        ButtonReg.setBounds(250, 80, 105, 40);
        ButtonReg.setBackground(Color.orange); 
        ButtonReg.setEnabled(true);
        ButtonReg.setVisible(true);
        ButtonReg.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent click) 
			{
				new CustomerGUI();
			}
		});
        
        JButton ButtonLogin = new JButton("Ojek");
        frame.add(ButtonLogin);
        ButtonLogin.setFont(fontButton);
        ButtonLogin.setBounds(250, 140, 105, 40);
        ButtonLogin.setBackground(Color.orange);
        ButtonLogin.setEnabled(true);
        ButtonLogin.setVisible(true);
        ButtonLogin.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent click) 
			{
				new OjekGUI();
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
				new MainGUI();
			}
		});
	}
}
