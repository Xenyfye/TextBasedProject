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
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class nextScreen6 extends JPanel implements ActionListener {
	JFrame window = new JFrame();
	JLabel picture = new JLabel();
	JPanel backgroundPanel = new JPanel();
	private final JTextArea textArea = new JTextArea();
	private final JButton srchChest = new JButton("Search through chest");
	JButton backBtn = new JButton("Back");

	nextScreen6(Inventory testInv) {
		// Initial window setup code
		window.getContentPane().setForeground(Color.BLACK);
		window.setBackground(Color.BLACK);
		window.setResizable(false);
		window.setSize(1280, 698);
		window.setLocation(80, 80);
		window.setUndecorated(true);
		window.setVisible(true);

		// Code to change JLabel picture - Specific to each to window
		picture.setIcon(new ImageIcon("C:\\Users\\opadm\\eclipse-workspace\\CSIS 2450_TeamProject\\media\\Library-Chest.png"));

		// Mumbo Jumbo code for component grouping
		GroupLayout groupLayout = new GroupLayout(window.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(backgroundPanel,
				Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1276, Short.MAX_VALUE));
		backgroundPanel.setBackground(Color.BLACK);
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(backgroundPanel,
				GroupLayout.PREFERRED_SIZE, 692, Short.MAX_VALUE));

		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(Color.BLACK);

		srchChest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!testInv.checkForItem("Raygun")) {
					JOptionPane.showMessageDialog(window.getContentPane(), "You found a Raygun");
					testInv.addItem("Raygun");
				} else {
					JOptionPane.showMessageDialog(window.getContentPane(), "The chest is empty");
				}
			}
		});
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextScreen4 next = new nextScreen4(testInv);
				window.dispose();
			}
		});
		GroupLayout gl_btnPanel = new GroupLayout(btnPanel);
		gl_btnPanel.setHorizontalGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup().addContainerGap()
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_btnPanel.createSequentialGroup().addGap(32)
						.addGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_btnPanel.createSequentialGroup()
										.addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 173,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(gl_btnPanel.createSequentialGroup()
										.addComponent(srchChest, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
										.addGap(29)))));
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		gl_btnPanel.setVerticalGroup(gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup().addContainerGap()
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(srchChest).addGap(30).addComponent(backBtn)
						.addContainerGap(334, Short.MAX_VALUE)));
		textArea.setLineWrap(true);
		textArea.setText("\n\nStorage space? Or someone's personal belongings? Be cautious, don’t make it look too much like you’ve gone through it");
		btnPanel.setLayout(gl_btnPanel);
		GroupLayout gl_panel_1 = new GroupLayout(backgroundPanel);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addComponent(picture, GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE).addGap(2)
						.addComponent(btnPanel, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addComponent(picture, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(btnPanel,
						GroupLayout.PREFERRED_SIZE, 710, GroupLayout.PREFERRED_SIZE)));
		backgroundPanel.setLayout(gl_panel_1);
		window.getContentPane().setLayout(groupLayout);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
