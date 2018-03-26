
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

         public class StringMethods2 {
		public static void main(String[] args) {
			
			// 1. Create a String variable and initialize it with
			//    random upper and lower case characters.
String RandomWord = "RAnDoM ";

			// 2. Print your String to the console in upper case.
			System.out.println(RandomWord.toUpperCase());
			// 3. Print your String to the console in lower case.
System.out.println(RandomWord.toLowerCase());
			// 4. Print the first 3 char's of your String
RandomWord.substring(2, 4);
System.out.println(RandomWord.substring(2, 4));
			//    HINT: .substring(start,end)

			
			// 5. Print a single char somewhere in the middle of your String
        //    REMINDER: char's in string start at index 0  
System.out.println(RandomWord.charAt(4));

			// 6. BONUS -- print the LAST 3 char's of your string using
			//        .length() to determine WHERE the last 3 char's are located.
int bigPos= RandomWord.length()-3;
System.out.println("The last 3 characters are at");
System.out.println(bigPos);
System.out.println(bigPos+1);
System.out.println(bigPos+2);
		}
	}

