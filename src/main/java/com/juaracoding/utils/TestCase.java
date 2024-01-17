package com.juaracoding.utils;

public enum TestCase {
    T1("Sales Login invalid"),
    T2("Sales Login invalid"),
    T3("Sales Login invalid"),
    T4("Sales Login invalid"),
    T5("Sales Login invalid"),
    T6("Sales Login Valid"),
    T7("Sales Input Empty Name Input"),
    T8("Sales Input Empty BPJS Input"),
    T9("Sales Input BPJS less than 13 Input"),
    T10("Sales Input Empty No KTP Input"),
    T11("Sales Input No KTP less than 16 Input"),
    T12("Sales Input Empty Alamat Input"),
    T13("Sales Input Empty Alasan Input"),
    T14("Sales Input Valid Input"),
    T15("Sales Upload Invalid Faskes Awal"),
    T16("Sales Upload Invalid Faskes Awal"),
    T17("Sales Upload Invalid Faskes Awal"),
    T18("Sales Upload Valid Faskes Awal"),
    T19("Sales Upload Invalid Faskes Tujuan"),
    T20("Sales Upload Invalid Faskes Tujuan"),
    T21("Sales Upload Invalid Faskes Tujuan"),
    T22("Sales Upload Valid Faskes Tujuan"),
    T23("Sales Upload Invalid Tanda Tangan Digital"),
    T24("Sales Upload Invalid Tanda Tangan Digital"),
    T25("Sales Upload Invalid Tanda Tangan Digital"),
    T26("Sales Upload Valid Tanda Tangan Digital");

    private String testCaseName;

    TestCase(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
