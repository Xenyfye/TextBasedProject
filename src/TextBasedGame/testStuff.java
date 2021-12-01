package TextBasedGame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testStuff extends JFrame implements ActionListener
{
JPanel panel;

public testStuff()
{
 super("Remove component on JFrame during runtime");
 setLayout(new BorderLayout());

 panel=new JPanel();
 panel.setLayout(new FlowLayout());

 JButton button1=new JButton("BUTTON 1");
 JButton button2=new JButton("BUTTON 2");
 JButton button3=new JButton("BUTTON 3");
 JButton button4=new JButton("BUTTON 4");
 JButton button5=new JButton("BUTTON 5");

 panel.add(button1);
 panel.add(button2);
 panel.add(button3);
 panel.add(button4);
 panel.add(button5);

 add(panel,BorderLayout.CENTER);

 JButton removeButton=new JButton("Click here to remove button");
 removeButton.addActionListener(this);

 add(removeButton,BorderLayout.SOUTH);

 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(500,500);
 setVisible(true);
}

public void actionPerformed(ActionEvent event)
{
 Component[]storeAllButtonInPanel=panel.getComponents();

 if(storeAllButtonInPanel.length!=0)
 {
  panel.remove(storeAllButtonInPanel.length-1);
  panel.revalidate();
  validate();
  repaint();
 }

 else
 {
  JOptionPane.showMessageDialog(this,"No button to remove");
 }
}

public static void main(String[]args)
{
 @SuppressWarnings("unused")
testStuff rcojfat=new testStuff();
}
}