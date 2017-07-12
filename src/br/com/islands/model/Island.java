package br.com.islands.model;

public class Island {

	int qtdRow;
	int qtdCol;

	public boolean checkCell(int matrix[][], int row, int col, boolean cellVisited[][]) {
		return (row >= 0) && (row < qtdRow) && (col >= 0) && (col < qtdCol)
				&& (matrix[row][col] == 1 && !cellVisited[row][col]);
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
	
	public int countIslands(int matrix[][]) {
		
		qtdRow = matrix.length;
		qtdCol = matrix[0].length;
		
		boolean visited[][] = new boolean[qtdRow][qtdCol];

		int count = 0;
		for (int i = 0; i < qtdRow; ++i) {
			for (int j = 0; j < qtdCol; ++j) {
				if (matrix[i][j] == 1 && !visited[i][j]) {
					DFS(matrix, i, j, visited);
					++count;
				}
			}
		}	
		return count;
	}
	
	
	public int area(int matrix[][]) {
		qtdRow = matrix.length;
		qtdCol = matrix[0].length;
		
		int count = 0;
		for (int i = 0; i < qtdRow; ++i) {
			for (int j = 0; j < qtdCol; ++j) {
				if (matrix[i][j] >= 1) {
					++count;
				}
			}
		}	
		return count;
	}
	
}
