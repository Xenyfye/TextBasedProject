package TextBasedGame;

import java.awt.Graphics;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class StartScreen extends JPanel implements ActionListener, KeyListener{
	
	JFrame window = new JFrame();
	JButton startButton = new JButton();
	JButton exitButton = new JButton();
	
	StartScreen(){
		window.getContentPane().add(this);
		
		//Start button info
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterHouse test = new enterHouse();
				window.dispose();
			}
		});
		startButton.setFont(new Font("Stencil", Font.PLAIN, 25));
		startButton.setForeground(Color.BLACK);
		startButton.setBackground(Color.GRAY);
		
		//Quit button info
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.dispose();
			}
		});
		quitButton.setFont(new Font("Stencil", Font.PLAIN, 25));
		quitButton.setForeground(Color.BLACK);
		quitButton.setBackground(Color.GRAY);
		
		//Layout code
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(275)
					.addComponent(startButton, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addComponent(quitButton, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addGap(328))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(410, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(startButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(quitButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(122))
		);
		setLayout(groupLayout);
		
		//Window Info
		window.addKeyListener(this);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		window.setSize(1020, 617);
		window.setLocation(0, 0);
		//window.setUndecorated(true);
		window.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Image background = new ImageIcon(this.getClass().getResource("/HauntedHouseTest.jpg")).getImage();
		g.drawImage(background, 0 , 0, getWidth(), getHeight(), this);
	}
	
	//Close program when Q is pressed
	@Override
	public void keyPressed(KeyEvent kp) {
		if(kp.getKeyCode() == KeyEvent.VK_Q) {
			window.dispose();
			//System.exit(0);
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
