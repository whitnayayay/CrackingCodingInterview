package ArraysAndStrings;


/* Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0.
 */

public class ZeroMatrix {
	
		void setZeros(int[][] matrix) {
			boolean[] row = new boolean[matrix.length];
			boolean[] column = new boolean[matrix[0].length];
			
			//store the row and column index with value 0
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length;j++) {
					if (matrix[i][j] == 0) {
						row[i] = true;
						column[j] = true;
					}
				}
			}
			
			//nullify rows
			for (int i = 0; i < row.length; i++) {
				if (row[i]) nullifyRow(matrix, i);
			}
			
			//nullify columns
			for (int j = 0; j < column.length; j++) {
				if (column[j]) nullifyColumn(matrix, j);
			}
		}
		
		void nullifyRow(int[][] matrix, int row) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[row][j] = 0;
			}
		}
		
		void nullifyColumn(int[][] matrix, int col) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][col] = 0;
			}
		}
}
