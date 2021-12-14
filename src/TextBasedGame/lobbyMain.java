package TextBasedGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class lobbyMain extends JPanel implements ActionListener{
	JFrame window = new JFrame();
	JLabel picture = new JLabel();
	JPanel backgroundPanel = new JPanel();
	private final JPanel btnPanel = new JPanel();
	private final JButton goUpstairs = new JButton("Go upstairs");
	private final JButton stayDownstairs = new JButton("Stay downstairs");

	lobbyMain(Inventory testInv){
		btnPanel.setBackground(Color.BLACK);
	
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setText("\n\nChoose your path, Wherever you decide it beats staying in one place\n");
		textArea.setLineWrap(true);
		GroupLayout gl_btnPanel = new GroupLayout(btnPanel);
		gl_btnPanel.setHorizontalGroup(
			gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_btnPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(stayDownstairs, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
						.addComponent(goUpstairs, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
					.addGap(29))
		);
		gl_btnPanel.setVerticalGroup(
			gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(stayDownstairs)
					.addGap(40)
					.addComponent(goUpstairs)
					.addContainerGap(313, Short.MAX_VALUE))
		);
		stayDownstairs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextScreen4 next = new nextScreen4(testInv);
				window.dispose();
			}
		});
		goUpstairs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextScreen7 next = new nextScreen7(testInv);
				window.dispose();
			}
		});
		
		btnPanel.setLayout(gl_btnPanel);
		//Initial window setup code
		window.getContentPane().setForeground(Color.BLACK);
		window.setBackground(Color.BLACK);
		window.setResizable(false);
		window.setSize(1280,696);
		window.setLocation(80,80);
		window.setUndecorated(true);
		window.setVisible(true);
		
		backgroundPanel.setBackground(Color.black);
				
		picture.setIcon(new ImageIcon("C:\\Users\\opadm\\eclipse-workspace\\CSIS 2450_TeamProject\\media\\Lobby.png"));
		
		//LayoutStuff (Background Panel, Btn Panel, Buttons, TextField)
		GroupLayout groupLayout = new GroupLayout(window.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(backgroundPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(backgroundPanel, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		GroupLayout gl_panel_1 = new GroupLayout(backgroundPanel);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(picture)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(btnPanel, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(picture, GroupLayout.PREFERRED_SIZE, 710, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnPanel, GroupLayout.PREFERRED_SIZE, 710, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		backgroundPanel.setLayout(gl_panel_1);
		window.getContentPane().setLayout(groupLayout);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}