package day17;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


//inheritance
//JFrame: window in java
public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//create a frame object
					LoginFrame frame = new LoginFrame();
					//set it visible
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		//when you close the window, also exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//bounds = location + size
//		setBounds(500, 400, 450, 300);
//		setLocation(500, 400);
		setSize(500, 600);
		//display the window in the center of screen
		setLocationRelativeTo(this);
		
		//panel:container, box
		contentPane = new JPanel();
		//set up that panel as the content pane of this window
		setContentPane(contentPane);
		
		//layout:a way to display components
		//default layout:FlowLayout
//		contentPane.setLayout(new FlowLayout());
		contentPane.setLayout(null);//absolute layout,we decide location+size
		
		//create a button
		JButton btn1 = new JButton("button 1");
		//location+size
		btn1.setBounds(100, 100, 100, 40);
		//add it into contentPane
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("button 2");
		btn2.setBounds(200, 200, 200, 50);
		contentPane.add(btn2);
		
		//bind a listener
//		btn1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// whatever you want happen when you click the button , you write it here
////				System.out.println("invalid account or password");
//				JOptionPane.showMessageDialog(LoginFrame.this, "invalid account or password");
//			}
//		});
		
		//bind a listener
		btn1.addActionListener((e)->JOptionPane.showMessageDialog(LoginFrame.this, "invalid account or password"));
		
	}

}
