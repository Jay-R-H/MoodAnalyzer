package MoodNalyzer;

import MoodAnalyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void testMood_WhenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void testMood_WhenAnyMood() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("Im in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("happy", mood);
    }

    @Test
    public void testMood_WhenNullInput() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("happy", null);
    }
}
