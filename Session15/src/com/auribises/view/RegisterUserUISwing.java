package com.auribises.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.auribises.model.User;

public class RegisterUserUISwing implements ActionListener{
	

	JFrame fr; // reference variable which will point to the object of Frame
	
	JLabel lblTitle, lblName, lblEmail, lblPassword;
	
	JTextField txtName, txtEmail, txtPassword;
	//JPasswordField password;
	
	JButton btnRegister, btnCancel;
	
	JPanel pnlTitle, pnlName, pnlEmail, pnlPassword, pnlButton, pnlAll;
	
	User uRef;
	
	public RegisterUserUISwing() {
		
		uRef = new User();
		
		fr = new JFrame("Welcome");
		//fr.setTitle("Welcome");
		
		lblTitle = new JLabel("Please Enter Your Details !!");
		lblName = new JLabel();
		lblName.setText("Enter Your Name");
		lblEmail = new JLabel("Enter Your Email");
		lblPassword = new JLabel("Enter Your Password");
		
		txtName = new JTextField(14);
		txtEmail = new JTextField(14);
		txtPassword = new JTextField(14);
		
		btnRegister = new JButton("Register");		
		//btnRegister.setLabel("Register");
		btnCancel = new JButton("Cancel");
		
		btnRegister.addActionListener(this);
		btnCancel.addActionListener(this);
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlEmail = new JPanel();
		pnlPassword = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
	}
	
	public void showUI(){
		
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlPassword.add(lblPassword);
		pnlPassword.add(txtPassword);
		
		pnlButton.add(btnRegister);
		pnlButton.add(btnCancel);
		
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlPassword);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		//fr.setSize(400, 400);
		fr.pack();
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegister){
			System.out.println("Register Clicked");
			
			uRef.name = txtName.getText();
			uRef.email = txtEmail.getText();
			uRef.password = txtPassword.getText();
				
			if(uRef.name.isEmpty() || uRef.email.isEmpty() || uRef.password.isEmpty()){
				lblTitle.setText("Please Enter All Details");
			}else{
				lblTitle.setText("Thank you !! You are registered with us !!");
				txtName.setText("");
				txtEmail.setText("");
				txtPassword.setText("");	
				
				WelcomeUserUI welcome = new WelcomeUserUI(uRef);
				welcome.showUI();
			}

			System.out.println(uRef);
				
		}else{
			System.out.println("Cancel Clicked");
			fr.dispose();
		}
	}

}
