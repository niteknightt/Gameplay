package niteknightt.chess.gameplay;

import niteknightt.chess.gameplay.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        Main fb = new Main();
        Assertions.assertEquals("1", fb.doAthing(1));
        Assertions.assertEquals("2", fb.doAthing(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        Main fb = new Main();
        Assertions.assertEquals("Fizz", fb.doAthing(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        Main fb = new Main();
        Assertions.assertEquals("Buzz", fb.doAthing(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        Main fb = new Main();
        Assertions.assertEquals("Buzz", fb.doAthing(5));
    }

}