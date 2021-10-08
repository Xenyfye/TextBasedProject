package TextBasedGame;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class enterHouse extends JPanel {
	
	JFrame window = new JFrame();

	enterHouse(){
		window.getContentPane().add(this);
		
		//Window Info
		window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		window.setSize(1020, 617);
		window.setLocation(0, 0);
		//window.setUndecorated(true);
		window.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Image background = new ImageIcon(this.getClass().getResource("/FrontDoor.jpg")).getImage();
		g.drawImage(background, 0 , 0, getWidth(), getHeight(), this);
	}	
}

