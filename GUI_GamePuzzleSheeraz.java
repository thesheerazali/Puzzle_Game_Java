import java.awt.*;
 import javax.swing.*;
   import java.awt.event.*;
    class  GUI_GamePuzzleSheeraz implements ActionListener{
		
		
		Frame f=new Frame();
		
	   Font font = new Font("arial",Font.BOLD,40);
	   Font font1 = new Font("arial",Font.BOLD,20);
	   
	ImageIcon icon=new ImageIcon("1.png");
	ImageIcon icon1=new ImageIcon("2.png");
	ImageIcon icon2=new ImageIcon("3.png");
	ImageIcon icon3=new ImageIcon("4.png");
	ImageIcon icon4=new ImageIcon("5.png");
	ImageIcon icon5=new ImageIcon("6.png");
	ImageIcon icon6=new ImageIcon("7.png");
	ImageIcon icon7=new ImageIcon("8.png");
	ImageIcon icon8=new ImageIcon("9.png");
	ImageIcon icon9=new ImageIcon("10.png");
	ImageIcon icon10=new ImageIcon("11.png");
	ImageIcon icon11=new ImageIcon("12.png");
	ImageIcon icon12=new ImageIcon("13.png");
	ImageIcon icon13=new ImageIcon("14.png");
	ImageIcon icon14=new ImageIcon("15.png");
	
	    ImageIcon iconstart=new ImageIcon("start12.png");
	   JButton start=new JButton(iconstart);
	   
	    ImageIcon iconexit=new ImageIcon("exit2.png");
	   JButton exit=new JButton(iconexit);
	   
	    ImageIcon iconres=new ImageIcon("restart2.png");
	   JButton restart=new JButton(iconres);
	  
	   
	   ImageIcon photo=new ImageIcon("sheeraz1.jpg");
	   JLabel photo2=new JLabel(photo);
	   
	   
	   JButton b1=new JButton(icon);
	   JButton b2=new JButton(icon1);
	   JButton b3=new JButton(icon2);
	   JButton b4=new JButton(icon3);
	   JButton b5=new JButton(icon4);
	   JButton b6=new JButton(icon5);
	   JButton b7=new JButton(icon6);
	   JButton b8=new JButton(icon7);
	   JButton b9=new JButton(icon8);
	   JButton b10=new JButton(icon9);
	   JButton b11=new JButton(icon10);
	   JButton b12=new JButton(icon11);
	   JButton b13=new JButton(icon12);
	   JButton b14=new JButton(icon13);
	   JButton b15=new JButton(icon14);
	   JButton b16=new JButton();
	   
	  
	   
	   
	   ImageIcon iconpuz=new ImageIcon("puzzle10.jpg");
	   JLabel lab1=new JLabel(iconpuz);
	   
	   GUI_GamePuzzleSheeraz(){
		   
		   photo2.setBounds(950,150,500,700);
		   f.add(photo2);
		   
        lab1.setBounds(650,40,300,100);
		//lab1.setFont(font);
		//lab1.setBackground(Color.gray);
			
			f.setBackground(Color.black);
			f.setBounds(0,0,1650,1000);
			
			start.setBounds(750,220,140,110);
			
			restart.setBounds(750,360,140,110);
			
			exit.setBounds(750,500,140,110);
			
			
			b1.setBounds(130,150,130,148);
			b2.setBounds(260,150,130,148);
			b3.setBounds(390,150,130,148);
			b4.setBounds(520,150,130,148);
		
			b5.setBounds(130,300,130,148);
			b6.setBounds(260,300,130,148);
			b7.setBounds(390,300,130,148);
			b8.setBounds(520,300,130,148);
			
			b9.setBounds(130,450,130,148);
			b10.setBounds(260,450,130,148);
			b11.setBounds(390,450,130,148);
			b12.setBounds(520,450,130,148);
			
			b13.setBounds(130,600,130,148);
			b14.setBounds(260,600,130,148);
			b15.setBounds(390,600,130,148);
			b16.setBounds(520,600,130,148);
			
		
			
			f.setLayout(null);
			
			f.add(restart);
			f.add(start);
			f.add(lab1);
			f.add(exit);
			
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);
			f.add(b6);
			f.add(b7);
			f.add(b8);
			f.add(b9);
			f.add(b10);
			f.add(b11);
			f.add(b12);
			f.add(b13);
			f.add(b14);
			f.add(b15);
			f.add(b16);
			
			start.addActionListener(this);
			restart.addActionListener(this);
			exit.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b10.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b13.addActionListener(this);
			b14.addActionListener(this);
			b15.addActionListener(this);
			b16.addActionListener(this);
			
			
			f.show();
	    }
		
		
			void showNumbers(){
			
			
			b1.setIcon(null);
			b2.setIcon(null);
			b3.setIcon(null);
			b4.setIcon(null);
			b5.setIcon(null);
			b6.setIcon(null);
			b7.setIcon(null);
			b8.setIcon(null);
			b9.setIcon(null);
			b10.setIcon(null);
			b11.setIcon(null);
			b12.setIcon(null);
			b13.setIcon(null);
			b14.setIcon(null);
			b15.setIcon(null);

		}
		
		void imageShow(){
			
			
			
		}
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==exit){
				System.exit(0);
			}
			
			if(e.getSource()==start){
				b1.setIcon(icon5);
				
				
				b2.setIcon(icon6);
			    b3.setIcon(icon7);
			    b4.setIcon(icon3);
				b5.setIcon(icon11);
				b6.setIcon(icon2);
			    b7.setIcon(icon10);
				b8.setIcon(icon12);
				b9.setIcon(icon14);
				b10.setIcon(icon1);
				b11.setIcon(icon);
				b12.setIcon(icon13);
				b13.setIcon(icon4);
				b14.setIcon(icon8);
				
				b15.setIcon(icon9);
				
				
				b16.setIcon(null);
			}
			
			if(e.getSource()==restart){
				
				
				//int b = (int) (Math.random()*)10;
				//String img = Math.ramdom()*15;
				
				
				b1.setIcon(icon4);

				
				b2.setIcon(icon7);
			    b3.setIcon(icon5);
			    b4.setIcon(icon3);
				b5.setIcon(icon10);
				b6.setIcon(icon2);
			    b7.setIcon(icon11);
				b8.setIcon(icon8);
				b9.setIcon(icon12);
				b10.setIcon(icon1);
				b11.setIcon(icon);
				b12.setIcon(icon13);
				b13.setIcon(icon14);
				b14.setIcon(icon6);
				b15.setIcon(icon9);
				b16.setIcon(null);
				
				
			}
			
			if(e.getSource()==b1){
				if(b2.getIcon()==null){
					b2.setIcon(b1.getIcon());
					b1.setIcon(null);
				}
			}
			
			if(e.getSource()==b1){
				if (b5.getIcon()==null){
					b5.setIcon(b1.getIcon());
					b1.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b2){
			   if(b3.getIcon()==null){
					b3.setIcon(b2.getIcon());
					b2.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b2){
				if(b1.getIcon()==null){
					b1.setIcon(b2.getIcon());
					b2.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b2){
				if(b6.getIcon()==null){
					b6.setIcon(b2.getIcon());
					b2.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b3){
				if(b4.getIcon()==null){
					b4.setIcon(b3.getIcon());
					b3.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b3){
				if(b2.getIcon()==null){
					b2.setIcon(b3.getIcon());
					b3.setIcon(null);
				}
				
			}
			if(e.getSource()==b3){
				if(b7.getIcon()==null){
					b7.setIcon(b3.getIcon());
					b3.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b4){
				if(b8.getIcon()==null){
					b8.setIcon(b4.getIcon());
					b4.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b4){
				if(b3.getIcon()==null){
					b3.setIcon(b4.getIcon());
					b4.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b5){
				if(b1.getIcon()==null){
					b1.setIcon(b5.getIcon());
					b5.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b5){
				if(b6.getIcon()==null){
					b6.setIcon(b5.getIcon());
					b5.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b5){
				if(b9.getIcon()==null){
					b9.setIcon(b5.getIcon());
					b5.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b6){
				if(b2.getIcon()==null){
					b2.setIcon(b6.getIcon());
					b6.setIcon(null);
				}
				
			}
			
			
			if(e.getSource()==b6){
				if(b5.getIcon()==null){
					b5.setIcon(b6.getIcon());
					b6.setIcon(null);
				}
				
			}
			
			
			if(e.getSource()==b6){
				if(b7.getIcon()==null){
					b7.setIcon(b6.getIcon());
					b6.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b6){
				if(b10.getIcon()==null){
					b10.setIcon(b6.getIcon());
					b6.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b7){
				if(b3.getIcon()==null){
					b3.setIcon(b7.getIcon());
					b7.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b7){
				if(b6.getIcon()==null){
					b6.setIcon(b7.getIcon());
					b7.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b7){
				if(b8.getIcon()==null){
					b8.setIcon(b7.getIcon());
					b7.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b7){
				if(b11.getIcon()==null){
					b11.setIcon(b7.getIcon());
					b7.setIcon(null);
				}
				
			}
			
			
			if(e.getSource()==b8){
				if(b4.getIcon()==null){
					b4.setIcon(b8.getIcon());
					b8.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b8){
				if(b7.getIcon()==null){
					b7.setIcon(b8.getIcon());
					b8.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b8){
				if(b12.getIcon()==null){
					b12.setIcon(b8.getIcon());
					b8.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b9){
				if(b5.getIcon()==null){
					b5.setIcon(b9.getIcon());
					b9.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b9){
				if(b10.getIcon()==null){
					b10.setIcon(b9.getIcon());
					b9.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b9){
				if(b13.getIcon()==null){
					b13.setIcon(b9.getIcon());
					b9.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b10){
				if(b9.getIcon()==null){
					b9.setIcon(b10.getIcon());
					b10.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b10){
				if(b11.getIcon()==null){
					b11.setIcon(b10.getIcon());
					b10.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b10){
				if(b6.getIcon()==null){
					b6.setIcon(b10.getIcon());
					b10.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b10){
				if(b14.getIcon()==null){
					b14.setIcon(b10.getIcon());
					b10.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b11){
				if(b12.getIcon()==null){
					b12.setIcon(b11.getIcon());
					b11.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b11){
				if(b10.getIcon()==null){
					b10.setIcon(b11.getIcon());
					b11.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b11){
				if(b15.getIcon()==null){
					b15.setIcon(b11.getIcon());
					b11.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b11){
				if(b7.getIcon()==null){
					b7.setIcon(b11.getIcon());
					b11.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b12){
				if(b8.getIcon()==null){
					b8.setIcon(b12.getIcon());
					b12.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b12){
				if(b16.getIcon()==null){
					b16.setIcon(b12.getIcon());
					b12.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b12){
				if(b11.getIcon()==null){
					b11.setIcon(b12.getIcon());
					b12.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b13){
				if(b14.getIcon()==null){
					b14.setIcon(b13.getIcon());
					b13.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b13){
				if(b9.getIcon()==null){
					b9.setIcon(b13.getIcon());
					b13.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b14){
			    if(b15.getIcon()==null){
					b15.setIcon(b14.getIcon());
					b14.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b14){
				if(b10.getIcon()==null){
					b10.setIcon(b14.getIcon());
					b14.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b14){
				if(b13.getIcon()==null){
					b13.setIcon(b14.getIcon());
					b14.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b15){
				if(b16.getIcon()==null){
					b16.setIcon(b15.getIcon());
					b15.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b15){
				if(b11.getIcon()==null){
					b11.setIcon(b15.getIcon());
					b15.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b15){
				if(b14.getIcon()==null){
					b14.setIcon(b15.getIcon());
					b15.setIcon(null);
				}
				
	        }
			
			if(e.getSource()==b16){
				if(b15.getIcon()==null){
					b15.setIcon(b16.getIcon());
					b16.setIcon(null);
				}
				
			}
			
			if(e.getSource()==b16){
				if(b12.getIcon()==null){
					b12.setIcon(b16.getIcon());
					b16.setIcon(null);
				}
				
			}
			
		}
        public static void main(String arg[]){
		  GUI_GamePuzzleSheeraz ob=new GUI_GamePuzzleSheeraz();
	    }
		
    }