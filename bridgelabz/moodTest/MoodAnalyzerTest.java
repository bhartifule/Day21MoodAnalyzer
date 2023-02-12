package com.bridgelabz.moodTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import com.bridgelabz.moodAnalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	
	static MoodAnalyzer moodAnalyzer;

	@BeforeAll
	static void init() {
		System.out.println("Before All");
		moodAnalyzer = new MoodAnalyzer();
	}

	@Test
	public void testAnalyseMood() {
		String result = moodAnalyzer.analyseMood("I am in Sad Mood");
		Assertions.assertEquals(result, "SAD");

		result = moodAnalyzer.analyseMood("In Happy mood");
		Assertions.assertEquals(result, "HAPPY");
	}
}
