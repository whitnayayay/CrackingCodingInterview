package ArraysAndStrings;

/* Write a method to replace all spaces in a string with "%20"
 *  Assume that the string has sufficient space at the end
 *  to hold the additional characters, and that you are given
 *  the true length of the string
 */ 

//first, count spaces. need two extra characters for each space.
//double the count. Then, walk backwards through the string, if no space,
//copy original character
public class URLify {
	void replaceSpaces(char[] str, int trueLength) {
		int numOfSpaces = countOfChar(str, 0, trueLength, ' ');
		int newIndex = trueLength - 1 + numOfSpaces * 2;
		
		for (int oldIndex = trueLength -1; oldIndex >= 0; oldIndex -= 1) {
			if (str[oldIndex] == ' ') { //insert %20
				str[newIndex] = '0';
				str[newIndex - 1] = '2';
				str[newIndex - 2] = '%';
				newIndex -= 3;
			} else {
				str[newIndex] = str[oldIndex];
				newIndex -= 1;
			}
		}
	}
	
	
	int countOfChar(char[] str, int start, int end, int target) {
		int count = 0;
		for (int i = start; i < end; i++) { // checks each character of the string and keeps track of the spaces
			if (str[i] == target) {
				count++;
			}
		}
		return count;
	}
}
