package pkgHelper;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {
	
	@Test
	public void Sudoku_Test() throws Exception {
		Sudoku s = new Sudoku(9);
		System.out.println(s.getPuzzle());
		
	}

}
