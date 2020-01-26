package lab6;

//import java.io.*;
//
///**
// */
//
//public class PigLatinTranslator {
//
//	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//
//	public static void main(String[] args) throws IOException {
//
//		System.out.print("Enter sentence: ");
//		String english = getString();
//
//		String latin = pigLatin(english);
//		System.out.println(latin);
//	}
//
//	private static String pigLatin(String s) {
//		String latin = "";
//		int i = 0;
//		while (i < s.length()) {
//
//			while (i < s.length() && !isLetter(s.charAt(i))) {
//				latin = latin + s.charAt(i);
//				i++;
//			}
//
//			if (i >= s.length())
//				break;
//
//			int begin = i;
//			while (i < s.length() && isLetter(s.charAt(i))) {
//				i++;
//			}
//
//			int end = i;
//			latin = latin + pigWord(s.substring(begin, end));
//		}
//		return latin;
//	}
//
//	private static boolean isLetter(char c) {
//		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
//	}
//
//	private static String pigWord(String word) {
//		int split = firstVowel(word);
//		return word.substring(split) + "" + word.substring(0, split) + "ay";
//	}
//
//	private static int firstVowel(String word) {
//		word = word.toLowerCase();
//		for (int i = 0; i < word.length(); i++)
//			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
//					|| word.charAt(i) == 'u')
//				return i;
//		return 0;
//	}
//
//	private static String getString() throws IOException {
//		return buf.readLine();
//	}
//}
