package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustomMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String print = "";
			for(int i = 0; i < s.length(); i++) {
				print = print + s.charAt(s.length() - i - 1);
			}
			System.out.println(print);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String print = "";
			boolean up = true;
			for(int i = 0; i < s.length(); i++) {
				if (up) {
				print = print + s.substring(i, i+1).toUpperCase();
				up = false;
				} else {
				print = print + s.substring(i, i+1).toLowerCase();
				up = true;
				}
			}
			System.out.println(print);
		}, "UpperLower");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String print = "";
			for(int i = 0; i < s.length(); i++) {
				print = print + s.substring(i, i+1) + ".";
			}
			System.out.println(print);
		}, "Periods");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String print = "";
			for(int i = 0; i < s.length(); i++) {
				if(!s.substring(i, i+1).equals("e") && !s.substring(i, i+1).equals("a") && !s.substring(i, i+1).equals("i") && !s.substring(i, i+1).equals("o") && !s.substring(i, i+1).equals("u")) {
				print = print + s.substring(i, i+1);
			
				}
			}
			System.out.println(print);
		}, "Voweless");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
