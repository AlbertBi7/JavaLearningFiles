package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyTrafficLight extends JFrame implements ActionListener{
	JRadioButton red,green,yellow;
	Color redC,yellowC,greenC;
	MyTrafficLight(){
		red=new JRadioButton("RED");
		yellow=new JRadioButton("YELLOW");
		green=new JRadioButton("GREEN");
		ButtonGroup gp=new ButtonGroup();
		gp.add(red);
		red.setBounds(50,10,80,50);
		gp.add(yellow);
		yellow.setBounds(130,10,100,50);
		gp.add(green);
		green.setBounds(230,10,100,50);
		
		red.addActionListener(this);
		yellow.addActionListener(this);
		green.addActionListener(this);
		
		redC=getBackground();
		yellowC=getBackground();
		greenC=getBackground();
		
		add(red);
		add(yellow);
		add(green);
		setLayout(null);
		setSize(400,500);
		setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(150, 100, 50, 50);
		g.drawOval(150, 160, 50, 50);
		g.drawOval(150, 220, 50, 50);
		g.drawRect(125, 90, 100, 200);
		g.setColor(Color.BLACK);
		g.fillRect(125, 90, 100, 200);
		g.setColor(redC);
		g.fillOval(150, 100, 50, 50);
		g.setColor(greenC);
		g.fillOval(150, 160, 50, 50);
		g.setColor(yellowC);
		g.fillOval(150, 220, 50, 50);
	}

	public static void main(String[] args) {
		
		new MyTrafficLight();
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==red) {
			redC=Color.red;
			yellowC=getBackground();
			greenC=getBackground();
		}
		else if(e.getSource()==green) {
			redC=getBackground();
			yellowC=getBackground();
			greenC=Color.green;
		}
		else if(e.getSource()==yellow) {
			redC=getBackground();
			yellowC=Color.yellow;
			greenC=getBackground();
		}
		repaint();
		
	}

}
