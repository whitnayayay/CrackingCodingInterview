package ArraysAndStrings;

/* Given an image represented by an NxN matrix, where each pixel in the image is represented
 * by an integer, write a method to rotate the image by 90 degrees.
 */


//solution: move top edge to the right, 
//			move the right edge to the bottom
//			move the bottom edge to the left edge
//			move the left edge to the top edge
public class RotateMatrix {

	boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top
				
				// left -> top
				matrix[first][i] = matrix[last - offset][first];
				
				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];
				
				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				
				//top -> right
				matrix[i][last] = top; //right <- saved top
			}
		}
		return true;
		
		
	}
}
