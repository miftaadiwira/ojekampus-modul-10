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
/**
 * GUI untuk Ojek apakah akan registrasi atau login
 * 
 * @author Mifta Adiwira
 * @version 26 mei 2017
 */
public class OjekGUI extends JFrame
{
    public OjekGUI() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("Ojek GUI");
        frame.setSize(200, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setContentPane(new JLabel(new ImageIcon("C:/Users/Windows/Desktop/biru.jpg")));
        
        JLabel label = new JLabel("Ojek");
        Font fontLabel = new Font("Courier", Font.BOLD, 15);
        label.setFont(fontLabel);
        frame.setLayout(null);
        frame.add(label);
        label.setBounds(80, 20, 150, 30);
        
        JButton ButtonReg = new JButton("Registrasi");
        frame.add(ButtonReg);
        Font fontButton = new Font("Courier", Font.BOLD, 13);
        ButtonReg.setFont(fontButton);
        ButtonReg.setBackground(Color.orange);
        ButtonReg.setBounds(45, 60, 105, 40);
        ButtonReg.setEnabled(true);
        ButtonReg.setVisible(true);
        ButtonReg.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent click) 
			{
				new RegistOjekGUI();
			}
		});
        
        JButton ButtonLogin = new JButton("Login");
        frame.add(ButtonLogin);
        ButtonLogin.setFont(fontButton);
        ButtonLogin.setBackground(Color.orange);
        ButtonLogin.setBounds(45, 120, 105, 40);
        ButtonLogin.setEnabled(true);
        ButtonLogin.setVisible(true);
        ButtonLogin.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent click) 
			{
				new OjekLoginGUI();
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
				new OjekGUI();
			}
		});
	}
}
