package lab6;

import java.util.Scanner;

/*
 * 
 * Author: seanwarchuck
 * 
 */

public class PigLatin {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.print("Please input any word: ");
		String word = scnr.nextLine();
		String[] segment;
		
		if (word != "") {
			segment = word.split(" ");
			word = word.replaceAll("[^0-9a-zA-Z]+", "");
	
			String pigLatin = "";
			int n = 0;
			
				for (int i = 0; i < word.length(); i++) {
						
					char x = word.charAt(i);
		
					if (x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8' || x == '9' || x == '0') {
						pigLatin = word;
						n = 1;
						break;
					}
		
					else if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
						pigLatin = word.substring(i) + word.substring(0, i) + "ay";
						n = 1;
						break;
					}
					
					if (n == 0) {
						pigLatin = word + "ay";
					}
			} 
			
				System.out.println(word + ": " + pigLatin);
				
			System.out.println("Thank you for using my program, have a wonderful day!");
			scnr.close();			
		} 
				
	}
}
