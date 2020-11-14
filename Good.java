
package pizza;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Graphics;

public class Good extends JPanel {
	
	ImageIcon BG4 = new ImageIcon("Media/u_BG2.jpg");
	ImageIcon BGgood = new ImageIcon("Media/good.png");
	JButton next = new JButton(new ImageIcon("Media/next.gif"));
	
		Good(){
		
			setLayout(null);	
			setSize(Maingame.frame.getWidth(), Maingame.frame.getHeight());
			next.setBounds(250,490, 198,85);
			 add(next);
			 next.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	
		            	Maingame.frame.remove(Maingame.frame.good);
		                if(Maingame.frame.order==null){
		                	Maingame.frame.order=new Order();
		                }
		                Maingame.frame.add(Maingame.frame.order);
		                Maingame.frame.order.requestFocusInWindow();
		                Maingame.frame.repaint();
		            	/**/
		            }
		        });
		}
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			repaint();
			g.drawImage(BG4.getImage(),0,0,700,620,this);
			g.drawImage(BGgood.getImage(),50,0,600,520,this);
			
			
		 
	 
	}

}



/*if(Maingame.frame.order==null) {
		            		Maingame.frame.order=new Order();
		            	}
		            	Maingame.frame.add(Maingame.frame.order);
		                Maingame.frame.order.requestFocusInWindow();
		                Maingame.frame.repaint();*/