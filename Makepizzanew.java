package pizza;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Makepizzanew extends JPanel{
	
	int x;
	int k=0;
	public int h=4;
	public int pizza=0;
	public int sc=0;
	int d,s,c,p,z ;
        Timer t1;
	static int timecount= 60;
	
	
	
	Font font = new Font("Arial black",Font.BOLD,36);
	ImageIcon BG4 = new ImageIcon("Media/u_BG2.jpg");
	JButton dough = new JButton(new ImageIcon("Media/u_Pizza_dough.png"));
	JButton sauce = new JButton(new ImageIcon("Media/u_Sauce.png"));
	JButton chees = new JButton(new ImageIcon("Media/u_chees.png"));
	JButton pep = new JButton(new ImageIcon("Media/u_peperonis.png"));
	JButton ok = new JButton(new ImageIcon("Media/ok.gif"));
        JButton cake = new JButton(new ImageIcon("Media/cake.jpg"));

	Makepizzanew(){
		t1 = new Timer(1000,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timecount -= 1 ;
				System.out.println("Timecount : "+timecount);
				if (timecount == 0){
					 Maingame.frame.remove(Maingame.frame.make);
                                         if(Maingame.frame.over==null){
                                        	Maingame.frame.over=new Gover();
                                         }
                                           Maingame.frame.add(Maingame.frame.over);
                                           Maingame.frame.over.requestFocusInWindow();
                                             Maingame.frame.repaint();
                                    t1.stop();
				}
			}
                        
		});
		t1.start();

	
		this.d=Maingame.frame.order.pizza.getd();
		this.s=Maingame.frame.order.pizza.gets();
		this.c=Maingame.frame.order.pizza.getc();
		this.p=Maingame.frame.order.pizza.getp();
		this.x=Maingame.frame.order.getX();
                this.z=Maingame.frame.order.pizza.getp();
		
		setLayout(null);
		repaint();
		 setSize(Maingame.frame.getWidth(), Maingame.frame.getHeight());
		 ok.setBounds(110,500, 130,60);
		 add(ok);
		 dough.setBounds(77,250, 200,310);
		 add(dough);
		 sauce.setBounds(50,85, 220,155);
		 add(sauce);
		 chees.setBounds(292,85, 230,160);
		 add(chees);
		 pep.setBounds(535,85, 155,155);
		 add(pep);
		 
		 System.out.println("h:"+h);
		 System.out.println("dB:"+d);
		 System.out.println("sB:"+s);
		 System.out.println("cB:"+c);
		 System.out.println("pB:"+p);
		 
		 dough.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	d=1;
	            	System.out.println("d:"+d);
	            	//Makepizza
	        		if(d==1) {
	        			pizza=8;//d
	        			if(s==1) {
	        				pizza=1;//ds
	        				if(c==1) {
	        					pizza=2;//ds,c
	        					if(p==1) {
	        						pizza=3;//ds,c,p
	        					}
	        				}else if(p==1) {
	        					pizza=4;//ds,p
	        				}
	        			}else if(c==1) {
	        				pizza=5;//dc
	        				if(p==1) {
	        					pizza=6;//dc,p
	        				}
	        			}else {
	        				if(p==1) {
	        					pizza=7;//dp
	        				}
	        			}
	        			
	        		}else {
	        			pizza=0; //เธฅเธนเธ�เธจเธฃ
	        			
	        		}
	        		repaint();
	            	
	            	
	            }
	        });
		 sauce.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	s=1;
	            	System.out.println("s:"+s);
	            	//Makepizza
	        		if(d==1) {
	        			pizza=8;//d
	        			if(s==1) {
	        				pizza=1;//ds
	        				if(c==1) {
	        					pizza=2;//ds,c
	        					if(p==1) {
	        						pizza=3;//ds,c,p
	        					}
	        				}else if(p==1) {
	        					pizza=4;//ds,p
	        				}
	        			}else if(c==1) {
	        				pizza=5;//dc
	        				if(p==1) {
	        					pizza=6;//dc,p
	        				}
	        			}else {
	        				if(p==1) {
	        					pizza=7;//dp
	        				}
	        			}
	        			
	        		}else {
	        			pizza=0; //เธฅเธนเธ�เธจเธฃ
	        			
	        		}
	        		repaint();
	            	
	            	
	            }
	        });
		 chees.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	c=1;
	            	System.out.println("c:"+c);
	            	//Makepizza
	        		if(d==1) {
	        			pizza=8;//d
	        			if(s==1) {
	        				pizza=1;//ds
	        				if(c==1) {
	        					pizza=2;//ds,c
	        					if(p==1) {
	        						pizza=3;//ds,c,p
	        					}
	        				}else if(p==1) {
	        					pizza=4;//ds,p
	        				}
	        			}else if(c==1) {
	        				pizza=5;//dc
	        				if(p==1) {
	        					pizza=6;//dc,p
	        				}
	        			}else {
	        				if(p==1) {
	        					pizza=7;//dp
	        				}
	        			}
	        			
	        		}else {
	        			pizza=0; //เธฅเธนเธ�เธจเธฃ
	        			
	        		}
	        		repaint();
	            	
	            	
	            }
	        });
		 pep.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	p=1;
	            	System.out.println("p:"+p);
	            	//Makepizza
	        		if(d==1) {
	        			pizza=8;//d
	        			if(s==1) {
	        				pizza=1;//ds
	        				if(c==1) {
	        					pizza=2;//ds,c
	        					if(p==1) {
	        						pizza=3;//ds,c,p
	        					}
	        				}else if(p==1) {
	        					pizza=4;//ds,p
	        				}
	        			}else if(c==1) {
	        				pizza=5;//dc
	        				if(p==1) {
	        					pizza=6;//dc,p
	        				}
	        			}else {
	        				if(p==1) {
	        					pizza=7;//dp
	        				}
	        			}
	        			
	        		}else {
	        			pizza=0; //เธฅเธนเธ�เธจเธฃ
	        			
	        		}
	        		repaint();
	            	
	            	
	            }
	        });
		
		ok.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent e) {
				 System.out.println("x:"+Maingame.frame.order.getX());
				 if(h==1) {
					 pizza=0;
					 System.out.println("make:"+pizza);
					 
					 Maingame.frame.remove(Maingame.frame.make);
		               if(Maingame.frame.over==null){
		               	Maingame.frame.over=new Gover();
		               }
		               Maingame.frame.add(Maingame.frame.over);
		               Maingame.frame.over.requestFocusInWindow();
		               Maingame.frame.repaint();
				 }//game over
				 if(Maingame.frame.order.getX()==1){
					 
					 if(d==1&&s==0&&c==1&&p==0) {
						 Maingame.frame.order.x=0;
						 x=0;
						 h=4;
						 sc =1;
						 int m=10;
						 
						 Maingame.frame.score.setSc(m);
						 
						 Maingame.frame.remove(Maingame.frame.make);
			                if(Maingame.frame.good==null){
			                	Maingame.frame.good=new Good();
			                }
			                Maingame.frame.add(Maingame.frame.good);
			                Maingame.frame.good.requestFocusInWindow();
			                Maingame.frame.repaint();
					 }else {
						 	h-=1;
						 	pizza=0;
							System.out.println("h:"+h);
							
							
					 }
				 }//1
				 
				 if(Maingame.frame.order.getX()==2) {
					 
					 if(d==1&&s==0&&c==1&&p==0) {
						 Maingame.frame.order.x=0;
						 x=0;
						 sc =1;
						 int m=10;
						 
						 Maingame.frame.score.setSc(m);
						 Maingame.frame.remove(Maingame.frame.make);
			                if(Maingame.frame.good==null){
			                	Maingame.frame.good=new Good();
			                }
			                Maingame.frame.add(Maingame.frame.good);
			                Maingame.frame.good.requestFocusInWindow();
			                Maingame.frame.repaint();
					 }else {
						 	h-=1;
						 	pizza=0;
							System.out.println("h:"+h);
							
							
					 }
					 
				 }//2
				 
				 if(Maingame.frame.order.getX()==3) {
					 if(d==1&&s==0&&c==0&&p==1) {
						 Maingame.frame.order.x=0;
						 x=0;
						 sc =1;
						 int m=5 ;
						 
						 Maingame.frame.score.setSc(m);
						 
						 Maingame.frame.remove(Maingame.frame.make);
			                if(Maingame.frame.good==null){
			                	Maingame.frame.good=new Good();
			                }
			                Maingame.frame.add(Maingame.frame.good);
			                Maingame.frame.good.requestFocusInWindow();
			                Maingame.frame.repaint();
					 }else {
						 	h-=1;
						 	pizza=0;
							System.out.println("h:"+h);
							
							
					 }
					 
				 }//3
				 
				 if(Maingame.frame.order.getX()==4) {
					 if(d==1&&s==1&&c==0&&p==1) {
						 Maingame.frame.order.x=0;
						 x=0;
						 sc=1;
						 int m=5;
						 
						 Maingame.frame.score.setSc(m);
						 Maingame.frame.remove(Maingame.frame.make);
			                if(Maingame.frame.good==null){
			                	Maingame.frame.good=new Good();
			                }
			                Maingame.frame.add(Maingame.frame.good);
			                Maingame.frame.good.requestFocusInWindow();
			                Maingame.frame.repaint();
					 }else {
						 	h-=1;
						 	pizza=0;
							System.out.println("h:"+h);
							
							
							
					 }
					 
				 }//4
				 
				 if(Maingame.frame.order.getX()==5) {
					 if(d==1&&s==1&&c==1&&p==1) {
						 Maingame.frame.order.x=0;
						 x=0;
						 sc =1;
						 
						 int m=10;
						 
						 Maingame.frame.score.setSc(m);
						 Maingame.frame.remove(Maingame.frame.make);
			                if(Maingame.frame.good==null){
			                	Maingame.frame.good=new Good();
			                }
			                Maingame.frame.add(Maingame.frame.good);
			                Maingame.frame.good.requestFocusInWindow();
			                Maingame.frame.repaint();
					 }else {
						 	h-=1;
						 	pizza=0;
							System.out.println("h:"+h);
							
							
					 }
					 
					 
				 }//5
				 
				 pizza=0;
		 
				 d=0; s=0; c=0; p=0;
				 
				 
				 System.out.println("dA:"+d);
				 System.out.println("sA:"+s);
				 System.out.println("cA:"+c);
				 System.out.println("pA:"+p);
			 }//action 
				 
			 });
		
		 
		 repaint();
		 
		 
	 }//Makepiz
	
	 public int getdpress() {return d;}
	 public int getspress() {return s;}
	 public int getcpress() {return c;}
	 public int getppress() {return p;}
	 public int geth() {return h;}
	 //public int getsc() {return sc;}
	
	 
	 
	 
	
	 protected void paintComponent(Graphics g){
		  super.paintComponent(g);
		  repaint();
		  
		  g.drawImage(BG4.getImage(),0,0,700,620,this);
		  g.setFont(font);
		  g.drawString(""+Maingame.frame.score.getSc(), 600,37);
                  g.drawString(""+timecount, 450,45);
				
				switch(h) {		
				case 1 : {ImageIcon heart= new ImageIcon("Media/heart1.png");
				heart.paintIcon(this, g, 30, 0);
							break;}
				case 2 : {ImageIcon heart= new ImageIcon("Media/heart2.png");
				heart.paintIcon(this, g, 30, 0);
							break;}
				case 3 : {ImageIcon heart = new ImageIcon("Media/heart3.png");
				heart.paintIcon(this, g, 30, 0);
							break;}
				case 4 : {ImageIcon heart = new ImageIcon("Media/heart4.png");
				heart.paintIcon(this, g, 30, 0);
							break;}

				}
				switch(pizza) {	
				case 0 : {ImageIcon pizza= new ImageIcon("Media/that.gif");
				pizza.paintIcon(this, g, 330, 370);
							break;}
				case 1 : {ImageIcon pizza= new ImageIcon("Media/g_sauce.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				case 2 : {ImageIcon pizza= new ImageIcon("Media/g_saucechees.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				case 3 : {ImageIcon pizza= new ImageIcon("Media/g_fullpizz.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				case 4 : {ImageIcon pizza=new ImageIcon("Media/g_saucepep.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				case 5 : {ImageIcon pizza= new ImageIcon("Media/g_chees.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				case 6 : {ImageIcon pizza= new ImageIcon("Media/g_cheespep.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				case 7 : {ImageIcon pizza= new ImageIcon("Media/g_pep.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				case 8 : {ImageIcon pizza= new ImageIcon("Media/g_dough.png");
				pizza.paintIcon(this, g, 330, 250);
							break;}
				
				}
				
				
		  
 
	}
		
}


