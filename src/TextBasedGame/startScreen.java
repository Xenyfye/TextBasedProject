package TextBasedGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;


public class startScreen extends JPanel implements ActionListener{
	
	JFrame window = new JFrame();
	JLabel picture = new JLabel();
	
	//Code for what is displayed
	startScreen(){
		
		//Window Format
		window.getContentPane().add(this);
		setBackground(Color.BLACK);
		window.setResizable(false);
		window.setSize(1280,720);
		window.setLocation(80,80);
		//window.setUndecorated(true);
		window.setVisible(true);
		
		//Sets picture 
		picture.setIcon(new ImageIcon("C:\\Users\\opadm\\eclipse-workspace\\2450_TeamProject\\media\\HouseOutside.png"));
		
		//Panel that contains buttons
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		//Layout Code (Auto generated from design view)
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(picture)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(picture)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(52)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		//Advances game(Jumps to new method)
		JButton startButton = new JButton("Start ");
		//Closes window(Ends game)
		JButton quitButton = new JButton("Quit");
		
		//More Layout
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(quitButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
						.addComponent(startButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(229)
					.addComponent(startButton, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(quitButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(205, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);
		
		//Actual Events(Has to be after components it will delete)
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterHouse nextScreen = new enterHouse();
				panel.remove(startButton);
				panel.remove(quitButton);
			}
		});
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.dispose();
			}
		});		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}


	public static void formatButton(JButton button) {
		button.setFont(new Font("Stencil", Font.PLAIN, 25));
		button.setForeground(Color.BLACK);
		button.setBackground(Color.GRAY);
	}
}
	
