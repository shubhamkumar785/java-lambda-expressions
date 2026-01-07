package org.lambda;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Window");
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		
		JButton button = new JButton("Click Me !!");
		
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button Click");
//				JOptionPane.showMessageDialog(null, "Hey, Button click");
//			}
//		});
		


