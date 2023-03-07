/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

/**
 * Use an annotation(s) in this class to apply some control over the order of test execution.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MethodOrderTest {
    @Rule
    public TestName name = new TestName();

    @Test
    public void shouldIOrderTheExecutionOfMyTests() {
        assertEquals("shouldIOrderTheExecutionOfMyTests", name.getMethodName());
        System.out.println(name.getMethodName());
    }

    @Test
    public void testSomething() {
        assertEquals("testSomething", name.getMethodName());
        System.out.println(name.getMethodName());
    }

    @Test
    public void businessMethodShouldWorkCorrectly() {
        assertEquals("businessMethodShouldWorkCorrectly", name.getMethodName());
        System.out.println(name.getMethodName());
    }

    @Test
    public void throwsExceptionIfUserDoesNotHaveSufficientPrivileges() {
        assertEquals("throwsExceptionIfUserDoesNotHaveSufficientPrivileges", name.getMethodName());
        System.out.println(name.getMethodName());
    }
}