package pkgGame;

// Warning: These tests are not good///

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;
import pkgHelper.LatinSquare;

public class SudokuTest {

	@Test
	public void TestRegionNbr()
	{
		Sudoku s1= null;
		
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		
		int [] Region5 = {4,2,3,7,9,1,8,5,6};
		
		try {
			 s1 = new Sudoku(puzzle);
		} catch (Exception e) {
			fail("Bad Sudoku");
		}
		
		assertTrue(Arrays.equals(Region5, s1.getRegion(5)));
		
	}

	@Test
	public void TestSetRegion()
	{
		Sudoku s2 = null;
		int[][] puzzle = {
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		int[] Region0 = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		try {
			s2 = new Sudoku(puzzle) ;
			s2.SetRegion(0);
			assertTrue(Arrays.equals(Region0, s2.getRegion(0)))	;		

		} catch (Exception e) {
			fail("Test failed to set a Region");
		}
	}
	
	@Test
	public void ShuffleArrayTest() {
		// This was intended to show that ShuffleArray will shuffle the values, but I can't figure out
		//why ShuffleArray isn't working
			int[] arr1 = { 1, 2, 3, 4, 5};
			Sudoku.ShuffleArray(arr1);
						
			System.out.println(Arrays.toString(arr1));
	}
	
	@Test
	public void TestShuffleRegion()
	{
		Sudoku s3 = null;
		int[][] puzzle = {
				{1, 2, 3, 0, 0, 0, 0, 0, 0 },
				{4, 5, 6, 0, 0, 0, 0, 0, 0 },
				{7, 8, 9, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		try {
			s3 = new Sudoku(puzzle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s3.ShuffleRegion(0);
		
		System.out.print(Arrays.toString(s3.getRegion(0)));
	}
}