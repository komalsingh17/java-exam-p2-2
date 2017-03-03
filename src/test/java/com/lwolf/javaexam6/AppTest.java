package com.lwolf.javaexam6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testRotateListWith2Steps() {
        int steps = 2;
        List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6, 1, 2));
        List<Integer> resultList = App.rotateList(list, steps);
        assertEquals(expectedList, resultList);
    }

    public void testRotateListWithStepsMoreThanSize() {
        int steps = 9;
        List<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 1, 2, 3));
        List<Integer> resultList = App.rotateList(list, steps);
        assertEquals(expectedList, resultList);
    }
}
