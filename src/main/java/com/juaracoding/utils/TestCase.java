package com.juaracoding.utils;

public enum TestCase {
    T1("");

    private String testCaseName;

    TestCase(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
