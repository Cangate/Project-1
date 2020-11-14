
package pizza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class How_to extends JPanel  {
	
	public int x =0;
	
	
	
	ImageIcon BG2 = new ImageIcon("Media/how_tok.gif");
	JButton play = new JButton(new ImageIcon("Media/play.gif"));
	
	 How_to(){
		 
		 setLayout(null);	
		 setSize(Maingame.frame.getWidth(), Maingame.frame.getHeight());
		 play.setBounds(450,490, 198,85);
		 add(play);
		 
		 play.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            	
	            	Maingame.frame.remove(Maingame.frame.how);
	                if(Maingame.frame.order==null){
	                	Maingame.frame.order=new Order();
	                }
	                Maingame.frame.add(Maingame.frame.order);
	                Maingame.frame.order.requestFocusInWindow();
	                Maingame.frame.repaint();
	            }
	           
	        });
		 
		 
		 
	 }
	 public int getX() {return x;}
	  
	 public void paintComponent(Graphics g){
		  super.paintComponent(g);
		  repaint();
		  g.drawImage(BG2.getImage(),0,0,700,620,this);
		 
	 }
	
		 
}
