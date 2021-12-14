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

public class nextScreen12 extends JPanel implements ActionListener{
	JFrame window = new JFrame();
	JLabel picture = new JLabel();
	JPanel backgroundPanel = new JPanel();
	JTextArea txt =  new JTextArea();
	private final JPanel btnPanel = new JPanel();
	private final JButton btnTwo = new JButton("Shut down portal");
	private final JButton btnOne = new JButton("Back to way out");
	Boolean portalOff = false;

	nextScreen12(Inventory testInv){
		btnPanel.setBackground(Color.BLACK);
		txt.setLineWrap(true);
		txt.setText("There it is! ");
	
				

		GroupLayout gl_btnPanel = new GroupLayout(btnPanel);
		gl_btnPanel.setHorizontalGroup(
			gl_btnPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_btnPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnTwo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
						.addComponent(btnOne, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
					.addGap(29))
				.addGroup(Alignment.LEADING, gl_btnPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_btnPanel.setVerticalGroup(
			gl_btnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btnPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txt, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnOne)
					.addGap(51)
					.addComponent(btnTwo)
					.addContainerGap(313, Short.MAX_VALUE))
		);
		btnPanel.setLayout(gl_btnPanel);
		//Initial window setup code
		window.getContentPane().setForeground(Color.BLACK);
		window.setResizable(false);
		window.setBackground(Color.BLACK);
		window.setSize(1280,698);
		window.setLocation(80,80);
		window.setUndecorated(true);
		window.setVisible(true);
		
		backgroundPanel.setBackground(Color.black);
		
		picture.setIcon(new ImageIcon("C:\\\\Users\\\\opadm\\\\eclipse-workspace\\\\CSIS 2450_TeamProject\\\\media\\\\Shutdown.png"));
		
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					nextScreen7 next = new nextScreen7(testInv);
					window.dispose();

			}
		});
		
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(portalOff == false) {
					JOptionPane.showMessageDialog(window.getContentPane(), "You successfully turned off the Portal");
					portalOff = true;	
				} else {
					JOptionPane.showMessageDialog(window.getContentPane(), "The portal is off get out while you still can!!");

				}
				
			}
		});
		
		
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