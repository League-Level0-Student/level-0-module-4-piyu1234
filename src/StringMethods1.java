//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
		String AwesomeGirl = "Gymnast";
		// 2. Print the 3rd char of your String to the console.
		
		System.out.println(AwesomeGirl.charAt(2)); 
	
		//    HINT: .charAt
		
		// 3. Print the length of your String to the console.
		
		System.out.println(AwesomeGirl.length());
		//    HINT: .length

		// 4. Using a for loop, print one char at time to the console.
		for (int i = 0; i < 7; i++) {  
			AwesomeGirl.charAt(i);
			
		}
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		
		for (int i = 0; i <AwesomeGirl.length() ; i++) {
			if (AwesomeGirl.charAt(i) == 'n')   {
				System.out.println(i);
		}
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}
}

