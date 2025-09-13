package day20_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrame frame = new MenuFrame();
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
	public MenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		//create a menu bar
		JMenuBar bar = new JMenuBar();
		
		//build menu
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Window");
		JMenu menu3 = new JMenu("Help");
		
		//add menu into bar
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		
		//sub menu
		JMenuItem item1_1 = new JMenuItem("Save");
		JMenuItem item1_2 = new JMenuItem("Save As");
		JMenuItem item1_3 = new JMenuItem("Restart");
		//add sub menu
		menu1.add(item1_1);
		menu1.add(item1_2);
		menu1.add(item1_3);
		
		//set bar as the menu of current window
		setJMenuBar(bar);
		
	}

}
