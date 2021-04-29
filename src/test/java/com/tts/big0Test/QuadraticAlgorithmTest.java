package com.tts.big0Test;

import java.util.Collection;

import com.tts.big0.FileNameConstants;
import com.tts.big0.QuadraticAlgorithm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class QuadraticAlgorithmTest extends TestBase {

    @Parameterized.Parameters
    public static Collection input() {
        return TEST_SIZE_PARAMETER;
    }

    private int[] integerArray;

    private QuadraticAlgorithm testClass;

    public QuadraticAlgorithmTest(int nSize) {
        super();
        this.nSize = nSize;
    }

    @Test
    public void insertation_sort() {
        testClass.insertation_sort(integerArray);
    }

    @Before
    public void setup() {
        testClass = new QuadraticAlgorithm();
        integerArray = setArray(this.nSize);
        this.filename = FileNameConstants.POLY_TIME;
        super.setup();
    }

}
