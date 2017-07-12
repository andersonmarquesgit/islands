package br.com.islands;

import br.com.islands.model.Island;

public class Main {

	public static void main(String[] args) {
		int M[][] = new int[][] { 
			{ 1, 1, 0, 0, 0 }, 
			{ 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 1 }, 
			{ 0, 0, 0, 0, 0 },
			{ 1, 0, 1, 0, 1 } 
		};
				
		int G[][] = new int[][] {
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
		
		int P[][] = new int[][] {
			{0, 0, 1, 0, 0}, 
			{0, 1, 2, 1, 0}, 
			{0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0}
		};
		
		Island I = new Island();
		System.out.println("Quantidade de ilhas em P: " + I.countIslands(P) + " - Tamanho da area em P: " + I.area(P));
		System.out.println("Quantidade de ilhas em G: " + I.countIslands(G) + " - Tamanho da area em G: " + I.area(G));
		System.out.println("Quantidade de ilhas em M: " + I.countIslands(M) + " - Tamanho da area em M: " + I.area(M));
	}
}
