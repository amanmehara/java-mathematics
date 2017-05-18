package com.amanmehara.mathematics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Aman on 18-05-2017.
 */
public class ProgressionsTest {

    @Test
    public void arithmeticProgressionTest() {
        Assert.assertEquals(
                Arrays.asList(24,31,38,45,52,59,66,73,80,87,94),
                Progressions.ARITHMETIC_PROGRESSION.apply(11).apply(24,7)
        );
    }

    @Test
    public void geometricProgressionTest() {
        Assert.assertEquals(
                Arrays.asList(2,6,18,54),
                Progressions.GEOMETRIC_PROGRESSION.apply(4).apply(2L,3L)
        );
    }

}
