package pl.edu.agh.mwo.hellomaven;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    /**
     * Sample test.
     */
    @Test
    public void sampleTest() {
        Assert.assertTrue(true);
    }
    
    @Test
    public void testRandomDiceRoll() {
        int randomNumber = new App().getRandomNumber();
        Assert.assertEquals("The dice is not fair.", 4, randomNumber);
    }
}
