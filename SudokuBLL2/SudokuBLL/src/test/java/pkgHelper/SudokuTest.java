package pkgHelper;

import java.util.HashMap;

import org.junit.Test;

import pkgEnum.eGameDifficulty;
import pkgGame.Sudoku;
import pkgGame.Sudoku.SudokuCell;

public class SudokuTest {
	
	@Test
	public void Sudoku_Test() throws Exception {
		Sudoku s = new Sudoku(9, eGameDifficulty.MEDIUM);
		System.out.println(s.getPuzzle());
		
	}
	
	@Test
	public void PossibleValuesMultiplierTest() throws Exception {
		
	}

}
