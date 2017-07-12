package br.com.islands.model;

public class Island {

	int qttRow;
	int qttCol;

	public boolean checkCell(int matrix[][], int row, int col, boolean cellVisited[][]) {
		return (row >= 0) && (row < qttRow) && (col >= 0) && (col < qttCol)
				&& (matrix[row][col] == 1 && !cellVisited[row][col]);
	}
	
	public boolean checkCellPerimeter(int matrix[][], int row, int col, boolean cellVisited[][]) {
		if ((row >= 0) && (row < qttRow) && (col >= 0) && (col < qttCol)
				&& (matrix[row][col] == 0 && !cellVisited[row][col])) {
			return true;
		}else if(((row == -1) && (col >= 0))
				|| ((row >= 0) && (col >= qttCol))
				|| ((row >= qttRow))
				|| ((col < 0))) {
			return true;
		}
		return false;
	}
	
	public void DFS(int matrix[][], int row, int col, boolean cellVisited[][]) {
		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
		
		cellVisited[row][col] = true;

		for (int k = 0; k < 8; ++k) {
			if (checkCell(matrix, row + rowNbr[k], col + colNbr[k], cellVisited))
				DFS(matrix, row + rowNbr[k], col + colNbr[k], cellVisited);
		}	
	}
	
	public int DFS4Nbr(int matrix[][], int row, int col, boolean cellVisited[][]) {
		int rowNbr[] = new int[] {-1, 0, 0, 1};
		int colNbr[] = new int[] {0, 1,	-1, 0};

		cellVisited[row][col] = true;
		int count = 0;
		
		for (int k = 0; k < 4; ++k) {
			if (checkCellPerimeter(matrix, row + rowNbr[k], col + colNbr[k], cellVisited)) {
				++count;
			}
		}
		
		return count;
	}
	
	public int countIslands(int matrix[][]) {
		qttRow = matrix.length;
		qttCol = matrix[0].length;
		
		boolean visited[][] = new boolean[qttRow][qttCol];

		int count = 0;
		for (int i = 0; i < qttRow; ++i) {
			for (int j = 0; j < qttCol; ++j) {
				if (matrix[i][j] == 1 && !visited[i][j]) {
					DFS(matrix, i, j, visited);
					++count;
				}
			}
		}	
		return count;
	}
	
	public int area(int matrix[][]) {
		qttRow = matrix.length;
		qttCol = matrix[0].length;
		
		int count = 0;
		for (int i = 0; i < qttRow; ++i) {
			for (int j = 0; j < qttCol; ++j) {
				if (matrix[i][j] >= 1) {
					++count;
				}
			}
		}	
		return count;
	}
	
	public int perimeter(int matrix[][]) {
		qttRow = matrix.length;
		qttCol = matrix[0].length;
		
		boolean visited[][] = new boolean[qttRow][qttCol];

		int count = 0;
		for (int i = 0; i < qttRow; ++i) {
			for (int j = 0; j < qttCol; ++j) {
				if (matrix[i][j] >= 1 && !visited[i][j]) {
					count += DFS4Nbr(matrix, i, j, visited);
				}
			}
		}	
		return count;
	}
	
}
