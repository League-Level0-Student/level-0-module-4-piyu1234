//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nickels = JOptionPane.showInputDialog("How many nickels do you you have?");
		// Convert their answer to an int using Integer.parseInt()
int numberofnickels = Integer.parseInt(Nickels);
		// Ask the user how many dimes they have, and convert their answer
String Dimes = JOptionPane.showInputDialog("How many dimes do you have");
int numberofdimes = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
String Quarters = JOptionPane.showInputDialog("How many quarters do you you have?");
int numberofquarters = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
double Total;
Total= (numberofnickels*5)
+(numberofdimes*10)
+(numberofquarters*25);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "the total number of cents you have" + Total);  }

	
}