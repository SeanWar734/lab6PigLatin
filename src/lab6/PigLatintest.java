package lab6;
//
//import java.util.Scanner;
//
//public class PigLatintest {
//	// Static Variables
//	static Scanner input;
//	static String userInput;
//	static String[] segment;
//
//	// Main method
//	public static void main(String[] args) {
//		// Create new scanner
//		input = new Scanner(System.in);
//
//		// Variables
//		String output = "";
//
//
//		// Message asking for user input
//		System.out.print("English to Pig Latin Translator by PurpleHootis, Inc." + '\n' + '\n' + "Please enter a word or sentence to be translated:  ");
//		userInput = input.nextLine();
//		segment = userInput.split(" ");
//		// Loop over split word to be translated
//		for (int x = 0;x <= segment.length -1;x ++) {
//			for (int y = 0;y <= segment[x].length() -1;y ++) {
//				char segmentIndex = segment[x].charAt(y);
//				// If character at index y is a vowel
//				if (segmentIndex == 'a' || segmentIndex == 'e' || segmentIndex == 'i' || segmentIndex == 'o' || segmentIndex == 'u') {
//					// if 
//					if (y != 0) {
//						String toMove = segment[x].substring(0, y);
//						String cutHere = segment[x].substring(y, segment[x].length());
//						output += cutHere + toMove + "ay" + " ";
//					}
//					else {
//						output += segment[x] + "yay" + " ";
//					}
//				}
//				else {
//
//				}
//			}
//		} // end for loop
//		System.out.print(output);
//	} // end main
//} // end class
