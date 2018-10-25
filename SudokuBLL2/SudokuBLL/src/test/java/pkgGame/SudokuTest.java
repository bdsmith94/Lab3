package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class SudokuTest {
	
//	@Test
//	public void Sudoku_test1() {
//		try { 
//			Sudoku s1 = new Sudoku(9);
//		} catch (Exception e) {
//			fail("Failed to Create Sudoku");
//		}
//	}
	
	@Test
	public void isSudoku_test1() {
		try {
			Sudoku s1 = new Sudoku(9);
			s1.PrintPuzzle();
			assertTrue(s1.isSudoku());
		} catch (Exception e) {
			fail("Test failed");
		}
	}
}