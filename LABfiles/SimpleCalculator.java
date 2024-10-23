package labPrograms24;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleCalculator implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beql,bclr;
	JTextField t1;
	int a=0,b=0;
	double result=0;
	String Operator;
	
	SimpleCalculator(){
		JFrame f=new JFrame("Calculator");
//		JPanel p=new JPanel();
		t1=new JTextField(); t1.setBounds(100,100,230,30);
		b1=new JButton("1"); b1.setBounds(100,140,50,50);
		
		b2=new JButton("2"); b2.setBounds(160,140,50,50);
		
		b3=new JButton("3"); b3.setBounds(220,140,50,50);
		
		badd=new JButton("+"); badd.setBounds(280,140,50,50);
		
		b4=new JButton("4"); b4.setBounds(100,200,50,50);
		
		b5=new JButton("5"); b5.setBounds(160,200,50,50);
		
		b6=new JButton("6"); b6.setBounds(220,200,50,50);
		
		bsub=new JButton("-"); bsub.setBounds(280,200,50,50);
		
		b7=new JButton("7"); b7.setBounds(100,260,50,50);
		
		b8=new JButton("8"); b8.setBounds(160,260,50,50);
		
		b9=new JButton("9"); b9.setBounds(220,260,50,50);
		
		bmul=new JButton("x"); bmul.setBounds(280,260,50,50);
		
		b0=new JButton("0"); b0.setBounds(100,320,50,50);
		
		bclr=new JButton("C"); bclr.setBounds(160,320,50,50);
	
		beql=new JButton("="); beql.setBounds(220,320,50,50);
		
		
		bdiv=new JButton("/"); bdiv.setBounds(280,320,50,50);
		
	
		f.add(t1);
		f.add(b1);f.add(b2);f.add(b3);f.add(badd);
		f.add(b4);f.add(b5);f.add(b6);f.add(bsub);
		f.add(b7);f.add(b8);f.add(b9);f.add(bmul);
		f.add(b0);f.add(bclr);f.add(beql);f.add(bdiv);
		
		b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);badd.addActionListener(this);
		b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);bsub.addActionListener(this);
		b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);bmul.addActionListener(this);
		b0.addActionListener(this);bclr.addActionListener(this);beql.addActionListener(this);bdiv.addActionListener(this);
		
		f.setLayout(null);
		f.setSize(300,300);
		f.setVisible(true);
		f.setResizable(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) t1.setText(t1.getText()+"1");
		if(e.getSource()==b2) t1.setText(t1.getText()+"2");
		if(e.getSource()==b3) t1.setText(t1.getText()+"3");
		if(e.getSource()==b4) t1.setText(t1.getText()+"4");
		if(e.getSource()==b5) t1.setText(t1.getText()+"5");
		if(e.getSource()==b6) t1.setText(t1.getText()+"6");
		if(e.getSource()==b7) t1.setText(t1.getText()+"7");
		if(e.getSource()==b8) t1.setText(t1.getText()+"8");
		if(e.getSource()==b9) t1.setText(t1.getText()+"9");
		if(e.getSource()==b0) t1.setText(t1.getText()+"0");
		if(e.getSource()==badd) {
			a=Integer.parseInt(t1.getText());
			Operator="+";
			t1.setText(null);
		}
		if(e.getSource()==bsub) {
			a=Integer.parseInt(t1.getText());
			Operator="-";
			t1.setText(null);
		}
		if(e.getSource()==bmul) {
			a=Integer.parseInt(t1.getText());
			Operator="*";
			t1.setText(null);
		}
		if(e.getSource()==bdiv) {
			a=Integer.parseInt(t1.getText());
			Operator="/";
			t1.setText(null);
		}
		if(e.getSource()==bclr) {
			
			t1.setText(null);
		}
		if(e.getSource()==beql) {
			b=Integer.parseInt(t1.getText());
			switch (Operator) {
			case "+":
				result=a+b;
				break;
			case "-":
				result=a-b;
				break;
			case "*":
				result=a*b;
				break;
			case "/":
				try {
				result=a/b;
				}catch(ArithmeticException ea) {
					
					String s="Division by zero";
					t1.setText(s);
					return;
				}
				break;
			
			}t1.setText(String.valueOf(result));
		}
		
		
		
	}

	public static void main(String[] args) {
	 new SimpleCalculator();
	}


	

}
