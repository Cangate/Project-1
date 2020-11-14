
package pizza;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gover extends JPanel {
	
	ImageIcon BGover = new ImageIcon("Media/over.gif");
	
		Gover(){
			
			setLayout(null);	
			setSize(Maingame.frame.getWidth(), Maingame.frame.getHeight());	
		}
	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			
			g.drawImage(BGover.getImage(),0,0,700,620,this);
		 
	 
		}


}
