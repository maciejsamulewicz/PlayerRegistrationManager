package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.Messaging.SyncScopeHelper;

public class MyFrame extends JFrame {

 public MyFrame(){
	 super("Ty te¿ mo¿esz zostaæ pi³karzem wielkiego klubu WKS Œl¹sk Wroc³aw!");
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setSize(700,1000);
	 setLocation(50, 50);
	
	 setLayout(null);
	 JButton register = new JButton("Zarejestruj");
	 add(register);
	 register.setBounds(250, 850, 150, 50);
	 setVisible(true);
	 
 }
	
}
