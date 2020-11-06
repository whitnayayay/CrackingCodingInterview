package ArraysAndStrings;
/*There are three types of edits that can be performed on strings.
 * Insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit
 * or (two edits) away.
 * ex) pale, ple -> true
 * 	pales, pale -> true
 * 	pale, bale -> true
 *  pale, bae -> false
 */
public class OneAway {
	boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneEditInsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return oneEditInsert(second,first);
		}
			return false; 
	}
	
	/*check to see if you strings are one edit replaceable*/
	boolean oneEditReplace(String s1, String s2) {
		boolean foundDifferent = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifferent) {
					return false;
				}
			foundDifferent = true;
			}
		}

		return true;
	}
	
	/* Check if you can insert a character in s1 to make s2*/
	boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
			
		}
		return false;
	}
	
	boolean oneEditRemove(String s1, String s2) {
		
		return false;
	}
}
