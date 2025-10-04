package day21_thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main1 {
	//main thread
	public static void main(String[] args) throws InterruptedException {
		//Thread
		//1.control the speed
		//2.hold a program running

		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("AA"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=10 ; i++) {
					System.out.println("BB"+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}


//exception
/*
 Thread t1 = new Thread(){
 	@Override
	public void run() {
		whatever you want to do as a different program, write it here
	}
 };
 
 t1.start();
 
 
 */
