package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	EASY(100), MEDIUM(500), HARD(1000);
	
	 private final Integer iDifficultyValue;
	
	 private eGameDifficulty(int difficulty) {
		 this.iDifficultyValue = difficulty;
	 }
	 
	 // Reverse-lookup map for getting a difficulty from a number
	 private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	 static {
	     for (eGameDifficulty d : eGameDifficulty.values()) {
	         lookup.put(d.getDifficulty(), d);
	     }
	 }

	public Integer getDifficulty() {
		return iDifficultyValue;
	 }

	 public static eGameDifficulty get(int iPossibleValues) {
		 return lookup.get(iPossibleValues);
	 }
	    
}
