package com.bridgelabz.moodTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.moodAnalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	 static MoodAnalyzer moodAnalyzer;

	    @Before
	    static void init() {
	        System.out.println("Before All");
	        moodAnalyzer = new MoodAnalyzer();
	    }

	    @Test
	    public void testAnalyseMood(){
	        String result = moodAnalyzer.analyseMood("I am in Sad Mood");
	        Assert.assertEquals(result,"SAD");

	        result = moodAnalyzer.analyseMood("In Happy mood");
	        Assert.assertEquals(result,"HAPPY");
	    }
}
