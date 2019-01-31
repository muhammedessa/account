package com.muhammedessa.acount;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	 
	JLabel lblNewLabel = new JLabel("New label");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClickMe = new JButton("Click me");
		btnClickMe.setBounds(138, 24, 117, 29);
		btnClickMe.addActionListener(this);
		 
		frame.getContentPane().add(btnClickMe);
		
		textField = new JTextField();
		textField.setBounds(6, 24, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		lblNewLabel.setBounds(173, 137, 147, 37);
		frame.getContentPane().add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lblNewLabel.setText(   textField.getText()   );
		 
		
	}
}
