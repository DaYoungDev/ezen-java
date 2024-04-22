package com.day16.fifteen;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous2 extends Frame{ 
	Button btn;	

	//생성자
	public Anonymous2(){
		btn=new Button("close");
		add(btn,"South");
		btn.addActionListener(new EventHandler());

		// 1. 익명클래스로
		btn.addActionListener(new EventHandler() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	

		// 2. 람다식으로
		btn.addActionListener(e -> System.exit(0));
	}	

	public static void main(String[] args){
		Anonymous2 a=new Anonymous2();
		a.setSize(300,300);
		a.setVisible(true);
	}//main

	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}//내부 class
}//class
