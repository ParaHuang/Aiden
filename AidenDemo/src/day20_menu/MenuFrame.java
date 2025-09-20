package day20_menu;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
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

		setUpJMenuBar();

		setUpJPopupMenu();
	}

	private void setUpJPopupMenu() {
		JPopupMenu pop = new JPopupMenu();
		
		JMenuItem item1 = new JMenuItem("Save");
		JMenuItem item2 = new JMenuItem("Exit");
		JMenu menu3 = new JMenu("background");

		JMenuItem item_red = new JMenuItem("Red");
		JMenuItem item_yellow = new JMenuItem("Yellow");
		JMenuItem item_green = new JMenuItem("Green");
		menu3.add(item_red);
		menu3.add(item_yellow);
		menu3.add(item_green);

		pop.add(item1);
		pop.add(item2);
		pop.add(menu3);
		
		add(pop);
		
//		
		//need:MouseListener
		//give:MouseAdapter
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//right click
				if(e.getButton() == MouseEvent.BUTTON3) {
					//show the popup menu
					pop.show(contentPane, e.getX(), e.getY());
				}
			}
		});
	}

	public void setUpJMenuBar() {
		// create a menu bar
		JMenuBar bar = new JMenuBar();

		// build menu
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Window");
		JMenu menu3 = new JMenu("Help");

		// add menu into bar
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);

		// sub menu
		JMenuItem item1_1 = new JMenuItem("Save");
		JMenuItem item1_2 = new JMenuItem("Save As");
		JMenuItem item1_3 = new JMenuItem("Restart");
		// add sub menu
		menu1.add(item1_1);
		menu1.add(item1_2);
		menu1.add(item1_3);

		// Menu can contain items
		// Item is leaf
		JMenuItem item2_1 = new JMenuItem("Exit");
		menu2.add(item2_1);

		JMenu menu2_2 = new JMenu("Show View");
		menu2.add(menu2_2);

		JMenuItem item2_2_1 = new JMenuItem("Console");
		menu2_2.add(item2_2_1);

		// set bar as the menu of current window
		this.setJMenuBar(bar);

		item2_1.addActionListener(e -> {
			int result = JOptionPane.showConfirmDialog(MenuFrame.this, "do you really want to exit?", "confirm",
					JOptionPane.OK_CANCEL_OPTION);
			if (result == 0) {
				System.exit(0); // control the program finish
//						dispose();			//close the current window
			}
		});
	}

}



class A implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}










