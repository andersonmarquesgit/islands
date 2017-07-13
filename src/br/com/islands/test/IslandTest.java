package br.com.islands.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.islands.concrete.Island;

public class IslandTest {

	int matrixTest01[][] = new int[][] {
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
	
	int matrixTest02[][] = new int[][] {
		{1, 1, 1, 1},
		{1, 1, 1, 1},
		{1, 1, 1, 1},
		{1, 1, 1, 1}
	};	
	
	int matrixTest03[][] = new int[][] {
		{0, 0, 0, 0},
		{0, 0, 0, 0},
		{0, 0, 0, 0},
		{0, 0, 5, 0}
	};
	
	int matrixTest04[][] = new int[][] {
		{0, 0, 0, 0},
		{0, 0, 0, 0},
		{0, 0, 0, 0},
		{0, 0, 0, 0}
	};
	
	/**
	 * Testa per�metro da ilha(s).
	 */
	@Test
	public void perimeter() {
		Island island = new Island();
		int expectedPerimeter = 44;
		int perimeter = island.getPerimeter(matrixTest01);
		
		assertEquals(expectedPerimeter, perimeter);
	}
	
	/**
	 * Testa �rea da ilha(s).
	 */
	@Test
	public void area() {
		Island island = new Island();
		int expectedArea = 54;
		int area = island.getArea(matrixTest01);
		
		assertEquals(expectedArea, area);
	}
	
	/**
	 * Testa quantidade de ilha(s).
	 */
	@Test
	public void qttIsland() {
		Island island = new Island();
		int expectedQtt = 2;
		int qtt = island.getQttIslands(matrixTest01);
		
		assertEquals(expectedQtt, qtt);
	}
	
	/**
	 * Testa se a matriz contem ilha v�lida, ou seja, � necess�rio que a margem da ilha possua 1.
	 */
	@Test
	public void notValidIsland() {
		Island island = new Island();
		int expectedQtt = 0;
		int qtt = island.getQttIslands(matrixTest03);
		
		assertEquals(expectedQtt, qtt);
	}
	
	/**
	 * Testa a �rea de uma ilha inv�lida, ou seja, n�o � poss�vel uma �rea de uma ilha inv�lida.
	 */
	@Test
	public void notValidIslandArea() {
		Island island = new Island();
		int expectedArea = 0;
		int area = island.getArea(matrixTest03);
		
		assertEquals(expectedArea, area);
	}
	
	/**
	 * Testa o per�metro de uma ilha inv�lida, ou seja, n�o � poss�vel um per�metro de uma ilha inv�lida.
	 */
	@Test
	public void notValidIslandPerimeter() {
		Island island = new Island();
		int expectedPerimeter = 0;
		int perimeter = island.getPerimeter(matrixTest03);
		
		assertEquals(expectedPerimeter, perimeter);
	}
	
	/**
	 * Testa se a matriz n�o possui ilhas.
	 */
	@Test
	public void noIsland() {
		Island island = new Island();
		int expectedQtt = 0;
		int qtt = island.getQttIslands(matrixTest04);
		
		assertEquals(expectedQtt, qtt);
	}
}
