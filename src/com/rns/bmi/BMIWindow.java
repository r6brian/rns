package com.rns.bmi;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.rns.bmi.Planet;
import com.rns.entity.Person;

//Inherits the methods from the JFrame object
public class BMIWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Creating the JFrame components
	private String s_bmi = "";
	
	private static JFrame bmicalc = new JFrame("BMI Calculator");
	private JLabel j_fname = new JLabel("First Name:");
	private JLabel j_mass = new JLabel("Weight in kilos:");
	private JLabel j_height = new JLabel("Height in cm:");
	private JTextField j_bmi = new JTextField(s_bmi, 30);
	private JTextField j_mass_input = new JTextField(30);
	private JTextField j_height_input = new JTextField(30);
	private JTextField j_fname_input = new JTextField(30);
	private JButton j_submit = new JButton("Submit");
	private JLabel j_planets = new JLabel("Planet");
	private JComboBox<Planet> j_planets_input = new JComboBox<Planet>(Planet.values());
	
//Constructor	
	BMIWindow()
	{
		j_bmi.setEditable(false);
		j_submit.addActionListener(new SubmitButtonListener());
		bmicalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bmicalc.setLayout(new GridLayout(5,2));
		
		bmicalc.getContentPane().add(j_fname);
			bmicalc.getContentPane().add(j_fname_input);
		bmicalc.getContentPane().add(j_mass);
			bmicalc.getContentPane().add(j_mass_input);	
		bmicalc.getContentPane().add(j_height);
			bmicalc.getContentPane().add(j_height_input);
		bmicalc.getContentPane().add(j_planets);
			bmicalc.getContentPane().add(j_planets_input);
		bmicalc.getContentPane().add(j_submit);
		bmicalc.getContentPane().add(j_bmi);
		
		bmicalc.pack();
		bmicalc.setVisible(true);
	}
	//Resets the frame
private void ResetFrame(){
	j_mass_input.setText("");
	j_mass_input.setEnabled(false);
	j_height_input.setText("");
	j_height_input.setEnabled(false);
	j_fname_input.setText("");
	j_fname_input.setEnabled(false);
}
	//The logic that is run when the button is pressed
private class SubmitButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		Person person = new Person();
		//Checks for the correct input
		try{
			
		person = new Person(j_fname_input.getText(), Float.parseFloat(j_mass_input.getText()),
				Float.parseFloat(j_height_input.getText())/100);
		j_fname_input.setEditable(false);
		j_height_input.setEditable(false);
		j_mass_input.setEditable(false);
		
		} catch(NumberFormatException ex){
			s_bmi = "Incorrect Input!";j_bmi.setText(s_bmi);
			}
		//Don't try this at home kids!
		if (!s_bmi.equals("Incorrect Input!")){
			Planet current_planet = (Planet) j_planets_input.getSelectedItem();
			s_bmi = Double.toString(person.calculateBodyMassIndex(current_planet.getGForce()));
			}
		j_bmi.setText(s_bmi);}

	
}
}

