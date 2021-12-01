package TextBasedGame;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class lobbyMain {
	JFrame window = new JFrame();
	JLabel picture = new JLabel("");


	lobbyMain(){
		window.getContentPane().setForeground(Color.BLACK);
		window.setBackground(Color.BLACK);
		window.setResizable(false);
		window.setSize(1280,720);
		window.setLocation(80,80);
		//window.setUndecorated(true);
		window.setVisible(true);
		picture.setBackground(Color.BLACK);
		
		picture.setIcon(new ImageIcon("C:\\Users\\opadm\\eclipse-workspace\\2450_TeamProject\\media\\Lobby-Main.png"));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		GroupLayout groupLayout = new GroupLayout(window.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(picture)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(picture)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 692, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);		
		window.getContentPane().setLayout(groupLayout);
	}
}

