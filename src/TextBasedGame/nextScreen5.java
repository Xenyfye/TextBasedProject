package TextBasedGame;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class nextScreen5 extends JPanel implements ActionListener{
	JFrame window = new JFrame();
	JLabel picture = new JLabel();
	JPanel backgroundPanel = new JPanel();
	private final JPanel btnPanel = new JPanel();
	private final JButton backButton = new JButton("Back");
	private final JButton bookBtn = new JButton("Read book ");
	private final JTextArea txt = new JTextArea();

	nextScreen5(Inventory testInv){
		txt.setText("\n\nSomeone's journal, maybe it has clues in it");
		txt.setWrapStyleWord(true);
		txt.setEditable(false);
		txt.setLineWrap(true);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextScreen4 next = new nextScreen4(testInv);
				window.dispose();
			}
		});
		btnPanel.setBackground(Color.BLACK);		
		GroupLayout gl_btnPanel = new GroupLayout(btnPanel);
		gl_btnPanel.setHorizontalGroup(
			gl_btnPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addGroup(gl_btnPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_btnPanel.createSequentialGroup()
							.addGap(29)
							.addComponent(bookBtn, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
						.addGroup(gl_btnPanel.createSequentialGroup()
							.addGap(32)
							.addComponent(backButton, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
					.addGap(29))
		);
		bookBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(window.getContentPane(), "In a haste, you start skimming through. A number catches your eye as it appears every few pages, 5937. Might be important. You return the journal to where you found it");
			}
		});
		gl_btnPanel.setVerticalGroup(
			gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
					.addGap(90)
					.addComponent(bookBtn)
					.addGap(33)
					.addComponent(backButton)
					.addContainerGap(259, Short.MAX_VALUE))
		);
		btnPanel.setLayout(gl_btnPanel);
		//Initial window setup code
		window.getContentPane().setForeground(Color.BLACK);
		window.setBackground(Color.BLACK);
		window.setResizable(false);
		window.setSize(1280,698);
		window.setLocation(80,80);
		window.setUndecorated(true);
		window.setVisible(true);
		
		backgroundPanel.setBackground(Color.black);
		
		picture.setIcon(new ImageIcon("C:\\Users\\opadm\\eclipse-workspace\\CSIS 2450_TeamProject\\media\\Library-Book.png"));
		
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
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addComponent(picture)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(btnPanel, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(picture, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 710, Short.MAX_VALUE)
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