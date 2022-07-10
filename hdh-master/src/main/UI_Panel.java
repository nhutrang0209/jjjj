package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class UI_Panel extends JPanel {

	Panel p;
	public UI_Button button0,button1,button2,button3,button4,button5;
	public UI_Panel(Panel p) {
		this.p=p;
		button0=new UI_Button("Deadlock", 0,p);
		button1=new UI_Button("Solution 1: A Philosopher Go Out",1,p);
		button2=new UI_Button("Solution 2: Only 1 Philosopher is eating",2,p);
		button3=new UI_Button("Solution 3: Up to 2 Philosophers are eating",3,p);
		button4=new UI_Button("Solution 4: Change order of picking up forks",4,p);
		button5=new UI_Button("Solution 5: Return the fork if only get 1",5,p);

		setPreferredSize(new Dimension(300,600));
		setLayout(new GridLayout(6,1,50,50));
		setBackground(Color.white);
		add(button0);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		


	}
}
