package br.com.islands;

import br.com.islands.concrete.Island;

public class Main {

	public static void main(String[] args) {
		
		int matrix01[][] = new int[][] {
			{0, 0, 1, 0, 0}, 
			{0, 1, 2, 1, 0}, 
			{0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0}
		};
		
		int matrix02[][] = new int[][] {
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 2, 0, 0, 0, 0, 0},
			{0, 1, 2, 2, 1, 0, 0, 0, 0},
			{0, 0, 2, 3, 3, 1, 0, 0, 0},
			{0, 0, 0, 2, 3, 3, 1, 0, 0},
			{0, 0, 0, 1, 1, 1, 1, 0, 0},
			{0, 0, 1, 1, 2, 2, 1, 1, 1},
			{0, 0, 1, 2, 5, 3, 4, 1, 0},
			{0, 0, 1, 2, 2, 2, 1, 1, 0},
			{0, 1, 1, 3, 3, 1, 1, 0, 0},
			{0, 1, 2, 3, 3, 3, 0, 0, 0},
			{0, 0, 1, 1, 1, 1, 0, 0, 0},
			{0, 0, 0, 5, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0}

		};	
		
		int matrix03[][] = new int[][] { 
			{ 1, 1, 0, 0, 0 }, 
			{ 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 1 }, 
			{ 0, 0, 0, 0, 0 },
			{ 1, 0, 1, 0, 1 } 
		};
		
		int matrix04[][] = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};	
		
		int matrix05[][] = new int[][] {
			{0, 0, 0, 0},
			{0, 0, 0, 0},
			{0, 0, 0, 0},
			{0, 0, 5, 0}
		};
		
		Island I = new Island();
		System.out.println("matrix01: 햞ea - " + I.getArea(matrix01) + ", Perimetro: " + I.getPerimeter(matrix01) + ", Quantidade: " + I.getQttIslands(matrix01));
		System.out.println("matrix02: 햞ea - " + I.getArea(matrix02) + ", Perimetro: " + I.getPerimeter(matrix02) + ", Quantidade: " + I.getQttIslands(matrix02));
		System.out.println("matrix03: 햞ea - " + I.getArea(matrix03) + ", Perimetro: " + I.getPerimeter(matrix03) + ", Quantidade: " + I.getQttIslands(matrix03));
		System.out.println("matrix04: 햞ea - " + I.getArea(matrix04) + ", Perimetro: " + I.getPerimeter(matrix04) + ", Quantidade: " + I.getQttIslands(matrix04));
		System.out.println("matrix05: 햞ea - " + I.getArea(matrix05) + ", Perimetro: " + I.getPerimeter(matrix05) + ", Quantidade: " + I.getQttIslands(matrix05));
		
	}
}
