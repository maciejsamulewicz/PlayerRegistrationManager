package app;

import java.awt.EventQueue;

import view.MyFrame;
/**
 * 
 * @author Maciek
 *
 */
public class MainTest {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new MyFrame();
			}
		});
		
	}

}
