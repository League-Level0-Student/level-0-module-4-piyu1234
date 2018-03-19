import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String Pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
   
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0; i < 6 ; i++) {
	


			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
 	int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "petHappiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Bathe", "Groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if( task==0) {   Cuddle(); 
}
else if (task == 1) {
	Bathe();
}
else if( task==2) {   Groom();
}
if (happinessLevel == 6) {
JOptionPane.showMessageDialog(null, "You love your pet");
break;
}

}

}
	
	// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	

	// 4. Create methods to handle each of your user selections.
static void Cuddle()  {
happinessLevel=happinessLevel + 1;
JOptionPane.showMessageDialog(null, "Your pet might purr when they want a cuddle");
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
static void Bathe()  {
	happinessLevel=happinessLevel + 1;
	JOptionPane.showMessageDialog(null, "Your pet might smell bad, so you want to bathe your pet");
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
static void Groom()  {
	happinessLevel=happinessLevel + 1;
	JOptionPane.showMessageDialog(null, "Your pet might purr when they want to be groomed");
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}



}