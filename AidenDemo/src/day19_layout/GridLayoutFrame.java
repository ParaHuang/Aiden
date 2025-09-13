package day19_layout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class GridLayoutFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutFrame frame = new GridLayoutFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private int amount=10;
	private JButton[] btns = new JButton[amount*amount];
	
	public GridLayoutFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 480);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(amount, amount,2,2));
		
		try {
		    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
//		
		
		int x = 10;
		for(int i=0 ; i<btns.length ; i++) {
			btns[i] = new JButton();
			btns[i].setBackground(Color.PINK);
			btns[i].setActionCommand(i+"");	//set up a mark
			contentPane.add(btns[i]);
//			int index = i;
			
			btns[i].addActionListener(e->{
				//1.inside anonymous inner class,we can't use local variable,unless it's final
				//2.in a higher java version,if you never change the value of a variable
				//you can use this local variable inside anonymous inner class,
				//because the jvm would take it as final
				//3.inside anonymous inner class, you can use global variable all as you what
				
				
				
				//which button we clicked
				//solution 1:define a temporary variable to save i, then use it here
//				System.out.println(index);
				//solution 2:mark every button outside,get the mark here
				String mark = e.getActionCommand();
//				System.out.println(command);
				int index = Integer.parseInt(mark);
				System.out.println(index);
				//current button
				if(btns[index].getBackground() == Color.PINK) {
					btns[index].setBackground(Color.BLUE);
				}else {
					btns[index].setBackground(Color.PINK);
				}
				
				//left
				if(btns[index-1].getBackground() == Color.PINK) {
					btns[index-1].setBackground(Color.BLUE);
				}else {
					btns[index-1].setBackground(Color.PINK);
				}
				//right
				if(btns[index+1].getBackground() == Color.PINK) {
					btns[index+1].setBackground(Color.BLUE);
				}else {
					btns[index+1].setBackground(Color.PINK);
				}
				//up
				if(btns[index-amount].getBackground() == Color.PINK) {
					btns[index-amount].setBackground(Color.BLUE);
				}else {
					btns[index-amount].setBackground(Color.PINK);
				}
				//down
				if(btns[index+amount].getBackground() == Color.PINK) {
					btns[index+amount].setBackground(Color.BLUE);
				}else {
					btns[index+amount].setBackground(Color.PINK);
				}
			});
		}
	}

}

















