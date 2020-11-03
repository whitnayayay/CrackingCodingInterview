package ArraysAndStrings;
//Given two strings, write a method to
//decide if one is a permutation of the other.
//if two strings are a permutation of one another, then 
//we know they have the same characters, but in different orders.
public class permutation {
	boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	String sort(String s) {
		char[] content = s.toCharArray(); //puts the string into a char array
		java.util.Arrays.sort(content); //sorts alphabetically
		return new String(content); //returns sorted array as a string
	}
}
