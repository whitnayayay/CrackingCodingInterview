package ArraysAndStrings;

/* Given a string, write a function to check if it is
 * a permutation of a palindrome. A palindrome is a word 
 * or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters. Ignore
 * casing and non-letter characters
 * ex) input: Tact Coa
 * 	   output: True: (permutations: 'taco cat", "atco cta,", etc)
 */

public class PalindromePermutation {

	boolean isPermutationOfPalindrome(String phrase) {
	int countOdd = 0;
	int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
	for (char c : phrase.toCharArray()) {
		int x = getCharNumber(c);
		if (x != -1) {
			table[x]++;
			if (table[x] % 2 == 1) { // palindromes have even number letters!
				countOdd++;
			} else {
				countOdd--;
			}
		}
	}
	return countOdd <= 1;
	
	}
	
	int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
}
