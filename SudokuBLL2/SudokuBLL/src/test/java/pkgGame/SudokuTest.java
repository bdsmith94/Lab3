package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class SudokuTest {
	
	@Test
	public void Sudoku_test1() {
		try {
			Sudoku s1 = new Sudoku(9);
			assertTrue(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}
}