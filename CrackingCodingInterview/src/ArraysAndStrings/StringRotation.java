package ArraysAndStrings;

import java.util.*;
/* Assume you have a method isSubstring which checks if
 * one word is a substring of another. Given two strings,
 * s1, and s2, write code to check if s2 is a rotation of s1 
 * using only one call to isSubstring 
 * (e.g.,"waterbottle" is a rotation of 'erbottlewat").
 * 
 */

//solution
// s1 = xy == waterbottle
// x = wat
// y = erbottle
//s2 = yx = erbottlewat
//s2 will always be a substring of s1s1

public class StringRotation {
	boolean isRotation(String s1, String s2) {
		int len = s1.length();
		/*Check that s1 and s2 are equal length and not empty */
		if (len == s2.length() && len > 0) {
			//concatenate s1 and s2 within new buffer
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}
		return false;
	}

	private boolean isSubstring(String s1s1, String s2) { 
	        int M = s1s1.length(); 
	        int N = s2.length(); 

	        for (int i = 0; i <= N - M; i++) { 
	            int j;
	            for (j = 0; j < M; j++) 
	                if (s2.charAt(i + j) 
	                    != s1s1.charAt(j)) 
	                    break; 
	            if (j == M) 
	                return true; 
	        } 
		return false;
	}
}
