package pkgHelper;

import java.util.ArrayList;
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
	
//	@Test
//	public void PossibleValuesMultiplierTest() throws Exception {
//		Sudoku s = new Sudoku(9);
//		HashMap<Integer,Sudoku.SudokuCell> cells = new HashMap<Integer,Sudoku.SudokuCell>();
//		System.out.println(PossibleValuesMultiplier(cells));
//	}
//
//	private int PossibleValuesMultiplier(HashMap<Integer, SudokuCell> cells) {
//int multiplier = 1;
//		
//		for (SudokuCell i : cells.values()) {
//			multiplier *= i.getLstValidValues().size();
//			if (multiplier > Integer.MAX_VALUE) {
//				return Integer.MAX_VALUE;
//			}
//			else {
//				multiplier *= i.getLstValidValues().size();
//			}
//		}
//		return multiplier;
//	}
	
//@Test
//public void isDifficultyMetTest() throws Exception {
//	Sudoku s = new Sudoku(9, eGameDifficulty.MEDIUM);
//	System.out.println(s.isDifficultyMet(100));
//}

//	@Test
//	public void RemoveCellsTest() throws Exception {
//		Sudoku s = new Sudoku(9);
//		s.RemoveCells();
//	}

}
