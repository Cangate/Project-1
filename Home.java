
package pizza;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;

public class Home extends JPanel {
	
    private ImageIcon BG1 = new ImageIcon("Media/BG1.jpg");
	private ImageIcon play = new ImageIcon("Media/play.gif");
	private JButton Bplay = new JButton(play);
	
	public Home() {
		
		setLayout(null);
		setSize(Maingame.frame.getWidth(),Maingame.frame.getHeight());
		Bplay.setBounds(250,490, 198,85);
		add(Bplay);
		Bplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Maingame.frame.remove(Maingame.frame.home);
                if(Maingame.frame.how==null){
                	Maingame.frame.how=new How_to();
                }
                Maingame.frame.add(Maingame.frame.how);
                Maingame.frame.how.requestFocusInWindow();
                Maingame.frame.repaint();
				
			}
         });
		
	}
	
         public void paintComponent(Graphics g){
		
		  super.paintComponent(g);
		  g.drawImage(BG1.getImage(),0,0,700,620,this);
	

	}

}
