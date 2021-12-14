package TextBasedGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class startScreen extends JPanel implements ActionListener{
	JFrame window = new JFrame();
	JLabel picture = new JLabel();
	JPanel backgroundPanel = new JPanel();
	
	JButton startButton = new JButton("Start ");
	JButton quitButton = new JButton("Quit");
	private final JTextArea txt = new JTextArea();
	
	startScreen(Inventory testInv){
		//Initial window setup code
		window.getContentPane().setForeground(Color.BLACK);
		window.setBackground(Color.BLACK);
		window.setResizable(false);
		window.setSize(1280,698);
		window.setLocation(80,80);
		window.setUndecorated(true);
		window.setVisible(true);
		
		//Code to change JLabel picture - Specific to each to window
		picture.setIcon(new ImageIcon("C:\\Users\\opadm\\eclipse-workspace\\CSIS 2450_TeamProject\\media\\HouseOutside.png"));
		
		//Panel holding all componenets
		backgroundPanel.setBackground(Color.BLACK);
		txt.setWrapStyleWord(true);
		txt.setEditable(false);
		txt.setLineWrap(true);
		txt.setText("\r\n\r\n\r\n---------------Nightmare Castle---------------\r\n\r\n\r\n"
				+ "Kidnappings are never a good thing but when you\u2019re placed in a situation to potentially save the world do you take the risk?\r\r\r\n");
		
		//Panel on leftside holding text and btns - Specific to each window
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(Color.BLACK);
		
		//Mumbo Jumbo code for component grouping		
		GroupLayout groupLayout = new GroupLayout(window.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(backgroundPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1276, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, 692, Short.MAX_VALUE)
		);		
		GroupLayout gl_panel = new GroupLayout(btnPanel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(quitButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
						.addComponent(startButton, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
					.addGap(29))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(startButton)
					.addGap(51)
					.addComponent(quitButton)
					.addContainerGap(313, Short.MAX_VALUE))
		);
		btnPanel.setLayout(gl_panel);	
		GroupLayout gl_panel_1 = new GroupLayout(backgroundPanel);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(18, Short.MAX_VALUE)
					.addComponent(picture)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPanel, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(picture, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);
		backgroundPanel.setLayout(gl_panel_1);
		window.getContentPane().setLayout(groupLayout);
		
		//Code for what happens when btns are pushed
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Each now window needs to be sent window,picture, backgroundPanel - Universal components that might change slightly but overall not really
				nextScreen next = new nextScreen(testInv);
				window.dispose();
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
		// TODO Auto-generated method stub
		
	}
}
