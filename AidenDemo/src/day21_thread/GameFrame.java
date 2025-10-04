package day21_thread;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	public GameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bush = new JButton("Bush");
		bush.setBounds(520, 100, 100, 85);
		contentPane.add(bush);
		
		JButton dinosaur = new JButton("Dinosaur");
		dinosaur.setBounds(30, 100, 100, 85);
		contentPane.add(dinosaur);
		
		Thread bushThread = new Thread() {
			@Override
			public void run() {
				boolean right = true;
				while(true) {
					//get current location
					int x = bush.getX();
					x-=10;
					if(x<-100) {
						x = 520;
					}
					//change base on that
					bush.setLocation(x, 100);
					
					takeBreak(100);
					
				}
			}
		};
		bushThread.start();
		
		
		
		dinosaur.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 32) {
					Thread dinoThread = new Thread() {
						@Override
						public void run() {
//							for(int i=1 ; i<=10 ; i++) {//times
//								int y = getY();
//								y-=10;
//								setLocation(i, y)
//								takeBreak(30);
//							}
						}
					};
					dinoThread.start();
				}
			}
		});
	}
	
	public void takeBreak(int milSecond) {
		try {
			Thread.sleep(milSecond);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
