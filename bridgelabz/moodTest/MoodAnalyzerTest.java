package com.bridgelabz.moodTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import com.bridgelabz.moodAnalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	
	 static MoodAnalyzer moodAnalyzer;

	    @Test
	    public void testAnalyseMood(){
	        moodAnalyzer = new moodAnalyzer("I am in Sad Mood");
	        String result = moodAnalyzer.analyseMood();
	        Assertions.assertEquals(result,"SAD");

	        moodAnalyzer = new moodAnalyzer("I am in Happy Mood");
	        result = moodAnalyzer.analyseMood();
	        Assertions.assertEquals(result,"HAPPY");
	    }
}
