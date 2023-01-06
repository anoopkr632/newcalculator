import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.lang.runtime.SwitchBootstraps;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	JFrame jf;
	JButton seven;JButton eight;JButton nine;JButton add;
	JButton six;JButton five;JButton four;JButton sub;
	JButton one;JButton two;JButton three;JButton multiplication;
	JButton dot;JButton zero;JButton equal;JButton division;
	JButton clear;
	JLabel display;
	boolean textOperator=false;
	String oldvalue;
	String newvalue;
	float oldvaluF;
	float newvalueF;
	int operator;
	Color displayclr=new Color(255, 255, 255);
	Color displayfontclr=new Color(26, 59, 92);
	Color buttonclr=new Color(249, 255, 135);
	Color clearbutton=new Color(237, 121, 121);
	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setLocation(500,200);
		jf.setSize(255,407);
		jf.setVisible(true);
		
		boolean RoundRectangle3D = true;
		Border border=BorderFactory.createLineBorder(Color.darkGray,5,RoundRectangle3D);
		Border buttonborder=BorderFactory.createLineBorder(Color.darkGray,2,RoundRectangle3D);
		Border clearbuttonborder=BorderFactory.createLineBorder(Color.darkGray,4,RoundRectangle3D);
		display=new JLabel("");
		display.setBackground(displayclr);
		display.setBorder(border);
		display.setForeground(displayfontclr);
		display.setFont(new Font("TimesRoman", Font.BOLD, 32));
		display.setBounds(0, 0, 240,100);
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setOpaque(true);
		jf.add(display);
		
		
		
		seven=new JButton("7");
		seven.setBounds(0,100, 60, 60);
		seven.setBorder(buttonborder);
		seven.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		seven.setBackground(buttonclr);
		seven.addActionListener(this);
		jf.add(seven);
		
		eight=new JButton("8");
		eight.setBounds(60, 100, 60, 60);
		eight.setBorder(buttonborder);
		eight.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		eight.setBackground(buttonclr);
		eight.addActionListener(this);
		jf.add(eight);
		
		nine=new JButton("9");
		nine.setBounds(120, 100, 60, 60);
		nine.setBorder(buttonborder);
		nine.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		nine.setBackground(buttonclr);
		nine.addActionListener(this);
		jf.add(nine);
		
		add=new JButton("+");
		add.setBounds(180, 100, 60, 60);
		add.setBorder(buttonborder);
		add.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		add.setBackground(buttonclr);
		add.addActionListener(this);
		jf.add(add);
		
		six=new JButton("6");
		six.setBounds(0,160, 60, 60);
		six.setBorder(buttonborder);
		six.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		six.setBackground(buttonclr);
		six.addActionListener(this);
		jf.add(six);
		
		five=new JButton("5");
		five.setBounds(60, 160, 60, 60);
		five.setBorder(buttonborder);
		five.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		five.setBackground(buttonclr);
		five.addActionListener(this);
		jf.add(five);
		
		four=new JButton("4");
		four.setBounds(120, 160, 60, 60);
		four.setBorder(buttonborder);
		four.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		four.setBackground(buttonclr);
		four.addActionListener(this);
		jf.add(four);
		
		sub=new JButton("-");
		sub.setBounds(180, 160, 60, 60);
		sub.setBorder(buttonborder);
		sub.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		sub.setBackground(buttonclr);
		sub.addActionListener(this);
		jf.add(sub);
		
		three=new JButton("3");
		three.setBounds(0,220, 60, 60);
		three.setBorder(buttonborder);
		three.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		three.setBackground(buttonclr);
		three.addActionListener(this);
		jf.add(three);
		
		two=new JButton("2");
		two.setBounds(60, 220, 60, 60);
		two.setBorder(buttonborder);
		two.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		two.setBackground(buttonclr);
		two.addActionListener(this);
		jf.add(two);
		
		one=new JButton("1");
		one.setBounds(120, 220, 60, 60);
		one.setBorder(buttonborder);
		one.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		one.setBackground(buttonclr);
		one.addActionListener(this);
		jf.add(one);
		
		multiplication=new JButton("*");
		multiplication.setBounds(180, 220, 60, 60);
		multiplication.setBorder(buttonborder);
		multiplication.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		multiplication.setBackground(buttonclr);
		multiplication.addActionListener(this);
		jf.add(multiplication);
		
		dot=new JButton(".");
		dot.setBounds(0,280, 60, 60);
		dot.setBorder(buttonborder);
		dot.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		dot.setBackground(buttonclr);
		dot.addActionListener(this);
		jf.add(dot);
		
		zero=new JButton("0");
		zero.setBounds(60, 280, 60, 60);
		zero.setBorder(buttonborder);
		zero.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		zero.setBackground(buttonclr);
		zero.addActionListener(this);
		jf.add(zero);
		
		equal=new JButton("=");
		equal.setBounds(120, 280, 60, 60);
		equal.setBorder(buttonborder);
		equal.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		equal.setBackground(buttonclr);
		equal.addActionListener(this);
		jf.add(equal);
		
		division=new JButton("/");
		division.setBounds(180, 280, 60, 60);
		division.setBorder(buttonborder);
		division.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 24));
		division.setBackground(buttonclr);
		division.addActionListener(this);
		jf.add(division);
		
		clear=new JButton("clear");
		clear.setBounds(0, 340, 240, 30);
		clear.setBackground(clearbutton);
		clear.setForeground(Color.black);
		clear.setFont(new Font("TimesRoman", Font.BOLD, 23));
		clear.setBorder(clearbuttonborder);
		clear.setHorizontalAlignment(SwingConstants.CENTER);
		clear.setVerticalTextPosition(SwingConstants.TOP);
		clear.addActionListener(this);
		jf.add(clear);
		
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	public static void main(String[] args) {
		Calculator setup=new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==seven) {
			if(textOperator) {
			oldvalue=display.getText();
			display.setText("7");
			textOperator=false;}
			else {
				display.setText(display.getText()+"7");
			}
			
		}
		
		else if(e.getSource()==eight) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("8");
				textOperator=false;}
				else {
					display.setText(display.getText()+"8");
				}
		}
		
		else if(e.getSource()==nine) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("9");
				textOperator=false;}
				else {
					display.setText(display.getText()+"9");
				}
		}
		
		else if(e.getSource()==six) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("6");
				textOperator=false;}
				else {
					display.setText(display.getText()+"6");
				}
		}
		
		else if(e.getSource()==five) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("5");
				textOperator=false;}
				else {
					display.setText(display.getText()+"5");
				}
		}
		
		else if(e.getSource()==four) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("4");
				textOperator=false;}
				else {
					display.setText(display.getText()+"4");
				}
		}
		
		else if(e.getSource()==three) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("3");
				textOperator=false;}
				else {
					display.setText(display.getText()+"3");
				}
		}
		
		else if(e.getSource()==two) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("2");
				textOperator=false;}
				else {
					display.setText(display.getText()+"2");
				}
		}
		
		else if(e.getSource()==one) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("1");
				textOperator=false;}
				else {
					display.setText(display.getText()+"1");
				}
		}
		
		else if(e.getSource()==zero) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText("0");
				textOperator=false;}
				else {
					display.setText(display.getText()+"0");
				}
		}
		
		else if(e.getSource()==dot) {
			if(textOperator) {
				oldvalue=display.getText();
				display.setText(".");
				textOperator=false;}
				else {
					display.setText(display.getText()+".");
				}
		}
		
		
		
		else if(e.getSource()==add) {
			operator=1;
			textOperator=true;
		}
		
		else if(e.getSource()==multiplication) {
			operator=2;
			textOperator=true;
		}
		
		else if(e.getSource()==division) {
			operator=3;
			textOperator=true;
		}
		
		else if(e.getSource()==sub) {
			operator=4;
			textOperator=true;
		}
		
		else if(e.getSource()==clear) {
			display.setText("");
		}
		
		
		else if(e.getSource()==equal) {
			switch(operator){
			case 1:
				newvalue=display.getText();
				oldvaluF=Float.parseFloat(oldvalue);
				newvalueF=Float.parseFloat(newvalue);
				float result=oldvaluF+newvalueF;
				display.setText(result+"");
				if(e.getSource()==add) {
					operator=1;
					textOperator=true;
				}
				break;
			case 2:
				newvalue=display.getText();
				oldvaluF=Float.parseFloat(oldvalue);
				newvalueF=Float.parseFloat(newvalue);
				float result1=oldvaluF*newvalueF;
				display.setText(result1+"");
				break;
			case 3:
				newvalue=display.getText();
				oldvaluF=Float.parseFloat(oldvalue);
				newvalueF=Float.parseFloat(newvalue);
				float result2=oldvaluF/newvalueF;
				display.setText(result2+"");
				break;
			case 4:
				newvalue=display.getText();
				oldvaluF=Float.parseFloat(oldvalue);
				newvalueF=Float.parseFloat(newvalue);
				float result3=oldvaluF-newvalueF;
				display.setText(result3+"");
				break;
			}
		}
	}
}
