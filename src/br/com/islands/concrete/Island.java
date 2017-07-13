package br.com.islands.concrete;

import br.com.islands.inter.IslandCalcs;

public class Island implements IslandCalcs{

	private int qttRow;
	private int qttCol;

	@Override
	public int getQttIslands(int[][] matrix) {
		qttRow = matrix.length;
		qttCol = matrix[0].length;
		
		boolean cellVisited[][] = new boolean[qttRow][qttCol];

		int count = 0;
		for (int i = 0; i < qttRow; ++i) {
			for (int j = 0; j < qttCol; ++j) {
				if (matrix[i][j] == 1 && !cellVisited[i][j]) {
					DFS8Nbrs(matrix, i, j, cellVisited);
					++count;
				}
			}
		}	
		return count;
	}

	@Override
	public int getArea(int[][] matrix) {
		qttRow = matrix.length;
		qttCol = matrix[0].length;
		
		int count = 0;
		
		if(getQttIslands(matrix) >= 1) {
			for (int i = 0; i < qttRow; ++i) {
				for (int j = 0; j < qttCol; ++j) {
					if (matrix[i][j] >= 1) {
						++count;
					}
				}
			}
		}
		return count;
	}

	@Override
	public int getPerimeter(int[][] matrix) {
		qttRow = matrix.length;
		qttCol = matrix[0].length;
		
		boolean cellVisited[][] = new boolean[qttRow][qttCol];

		int count = 0;
		
		if(getQttIslands(matrix) >= 1) {
			for (int i = 0; i < qttRow; ++i) {
				for (int j = 0; j < qttCol; ++j) {
					if (matrix[i][j] >= 1 && !cellVisited[i][j]) {
						count += DFS4Nbrs(matrix, i, j, cellVisited);
					}
				}
			}	
		}
		return count;
	}
	
	
	/**
	 * @param matrix
	 * @param row
	 * @param col
	 * @param cellVisited
	 * @return
	 * 
	 * Verifica a célula para uso no DFS de 8 vizinhos
	 */
	private boolean checkCellDFS8Nbrs(int matrix[][], int row, int col, boolean cellVisited[][]) {
		return (row >= 0) && (row < qttRow) && (col >= 0) && (col < qttCol) && (matrix[row][col] == 1 && !cellVisited[row][col]);
	}
	
	/**
	 * @param matrix
	 * @param row
	 * @param col
	 * @param cellVisited
	 * @return
	 * 
	 * Verifica a célula para uso no DFS de 4 vizinhos
	 */
	private boolean checkCellDFS4Nbrs(int matrix[][], int row, int col, boolean cellVisited[][]) {
		if (((row >= 0) && (row < qttRow) && (col >= 0) && (col < qttCol) && (matrix[row][col] == 0 && !cellVisited[row][col]))
			|| (((row == -1) && (col >= 0)) || ((row >= 0) && (col >= qttCol)) || ((row >= qttRow)) || ((col < 0)))){
			return true;
		}
		
		return false;
	}
	
	/**
	 * @param matrix
	 * @param row
	 * @param col
	 * @param cellVisited
	 * 
	 * Busca de profundidade para 8 vizinhos. Nesse caso incluindo os vizinhos das diagonais da célula visitada
	 */
	private void DFS8Nbrs(int matrix[][], int row, int col, boolean cellVisited[][]) {
		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
		
		cellVisited[row][col] = true;

		for (int k = 0; k < 8; ++k) {
			if (checkCellDFS8Nbrs(matrix, row + rowNbr[k], col + colNbr[k], cellVisited))
				DFS8Nbrs(matrix, row + rowNbr[k], col + colNbr[k], cellVisited);
		}	
	}
	
	/**
	 * @param matrix
	 * @param row
	 * @param col
	 * @param cellVisited
	 * @return o valor do perímetro de cada célula
	 * 
	 * Busca de profundidade para 4 vizinhos. Nesse caso excluindo os vizinhos das diagonais da célula visitada
	 */
	private int DFS4Nbrs(int matrix[][], int row, int col, boolean cellVisited[][]) {
		int rowNbr[] = new int[] {-1, 0, 0, 1};
		int colNbr[] = new int[] {0, 1,	-1, 0};

		cellVisited[row][col] = true;
		int count = 0;
		
		for (int k = 0; k < 4; ++k) {
			if (checkCellDFS4Nbrs(matrix, row + rowNbr[k], col + colNbr[k], cellVisited))
				++count;
		}
		
		return count;
	}

}
