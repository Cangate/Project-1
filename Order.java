
package pizza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Order extends JPanel {
	
	int y=0,y1=0;
	public int x = 5;
	
	
	How_to how = new How_to();
	Pizza pizza = new Pizza();
	ImageIcon BG3 = new ImageIcon("Media/u_BG_t.jpg");
	JButton okay = new JButton(new ImageIcon("Media/u_menu_okay.png"));
	
	
	
	public Order(){
		
		 //this.x= (int)(Math.random()*5)+1;
		 setLayout(null);	
		 setSize(Maingame.frame.getWidth(), Maingame.frame.getHeight());
		 okay.setBounds(400,265, 170,60);
		 add(okay);
		 
		 repaint();
		 
		 
		 okay.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	System.out.println(Maingame.frame.how.getX());
	            	Maingame.frame.remove(Maingame.frame.order);
	                if(Maingame.frame.make==null){
	                	Maingame.frame.make=new Makepizza();
	                }
	                Maingame.frame.add(Maingame.frame.make);
	                Maingame.frame.make.requestFocusInWindow();
	                Maingame.frame.repaint();
	            }
	        });
		
		 
	 }
	public int pizzrandom() {
          //  return 6;
	  return (int)(Math.random()*5)+1;
	}
	
	
	
	
	  
	 protected void paintComponent(Graphics g){
		  super.paintComponent(g);
		  
		  //repaint();
		  g.drawImage(BG3.getImage(),0,0,700,620,this);
		  switch(this.x=pizzrandom()) {		
			case 1 : {ImageIcon menu = new ImageIcon("Media/u_menu3_chees1.png");
						menu.paintIcon(this, g, 50, 100);
						System.out.println("x:"+x);
						break;}
			case 2 : {ImageIcon menu = new ImageIcon("Media/u_menu1chess_no_sauce1.png");
						menu.paintIcon(this, g, 50, 100);
						System.out.println("x:"+x);
						break;}
			case 3 : {ImageIcon menu = new ImageIcon("Media/u_menu5_pep1.png");
						menu.paintIcon(this, g, 50, 100);
						System.out.println("x:"+x);
						break;}
			case 4 : {ImageIcon menu = new ImageIcon("Media/u_menu2pep_no_chees1.png");
						menu.paintIcon(this, g, 50, 100);
						System.out.println("x:"+x);
						break;}
			case 5 : {ImageIcon menu = new ImageIcon("Media/u_menu4_pizza1.png");
						menu.paintIcon(this, g, 50, 100);
						System.out.println("x:"+x);
						break;}
                        case 6 : {ImageIcon menu = new ImageIcon("Media/u_menu5_pep2_cake.png");
						menu.paintIcon(this, g, 50, 100);
						System.out.println("x:"+x);
						break;}
       
			default : {	ImageIcon menu = new ImageIcon("Media/u_menu4_pizza1.png");
						menu.paintIcon(this, g, 50, 100);	
						System.out.println("defaut");
						break;}
			
			}
		  
		  
	}
	 		public int getX() {return x;}
}
