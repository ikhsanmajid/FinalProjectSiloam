package com.juaracoding.utils;

public enum TestCase {
    L1("Sales Login invalid", "Login Sales", "Ikhsan"),
    L2("Sales Login invalid", "Login Sales", "Ikhsan"),
    L3("Sales Login invalid", "Login Sales", "Ikhsan"),
    L4("Sales Login invalid", "Login Sales", "Ikhsan"),
    L5("Sales Login invalid", "Login Sales", "Ikhsan"),
    L6("Sales Login Valid", "Login Sales", "Ikhsan"),
    I1("Sales Input Empty Name Input", "Input Data Sales", "Ikhsan"),
    I2("Sales Input Empty BPJS Input", "Input Data Sales", "Ikhsan"),
    I3("Sales Input BPJS less than 13 Input", "Input Data Sales", "Ikhsan"),
    I4("Sales Input Empty No KTP Input", "Input Data Sales", "Ikhsan"),
    I5("Sales Input No KTP less than 16 Input", "Input Data Sales", "Ikhsan"),
    I6("Sales Input Empty Alamat Input", "Input Data Sales", "Ikhsan"),
    I7("Sales Kota KTP different with Faskes Tujuan", "Input Data Sales", "Ikhsan"),

    I8("Sales Input Empty Alasan Input", "Input Data Sales", "Ikhsan"),
    I9("Sales Input Valid Input", "Input Data Sales", "Ikhsan"),
    U1("Sales Upload Invalid Faskes Awal", "Upload Document Sales", "Ikhsan"),
    U2("Sales Upload Invalid Faskes Awal", "Upload Document Sales", "Ikhsan"),
    U3("Sales Upload Invalid Faskes Awal", "Upload Document Sales", "Ikhsan"),
    U4("Sales Upload Valid Faskes Awal", "Upload Document Sales", "Ikhsan"),
    U5("Sales Upload Invalid Faskes Tujuan", "Upload Document Sales", "Ikhsan"),
    U6("Sales Upload Invalid Faskes Tujuan", "Upload Document Sales", "Ikhsan"),
    U7("Sales Upload Invalid Faskes Tujuan", "Upload Document Sales", "Ikhsan"),
    U8("Sales Upload Valid Faskes Tujuan", "Upload Document Sales", "Ikhsan"),
    U9("Sales Upload Invalid Tanda Tangan Digital", "Upload Document Sales", "Ikhsan"),
    U10("Sales Upload Invalid Tanda Tangan Digital", "Upload Document Sales", "Ikhsan"),
    U11("Sales Upload Invalid Tanda Tangan Digital", "Upload Document Sales", "Ikhsan"),
    U12("Sales Upload Valid Tanda Tangan Digital", "Upload Document Sales", "Astrin"),
    T1("Sales Click Edit Btn", "Tanda Tangan Sales", "Astrin"),
    T2("Sales Input Empty Name Input", "Tanda Tangan Sales", "Ikhsan"),
    T3("Sales Input Empty BPJS Input", "Tanda Tangan Sales", "Ikhsan"),
    T4("Sales Input BPJS less than 13 Input", "Tanda Tangan Sales", "Ikhsan"),
    T5("Sales Input Empty No KTP Input", "Tanda Tangan Sales", "Ikhsan"),
    T6("Sales Input No KTP less than 16 Input", "Tanda Tangan Sales", "Ikhsan"),
    T7("Sales Input Empty Alamat Input", "Tanda Tangan Sales", "Ikhsan"),
    T8("Sales Kota KTP different with Faskes Tujuan", "Tanda Tangan Sales", "Ikhsan"),

    T9("Sales Input Empty Alasan Input", "Tanda Tangan Sales", "Ikhsan"),
//
    T10("Sales Simpan Data", "Tanda Tangan Sales", "Ikhsan");



    private String testCaseName, module, author;

    TestCase(String value, String module, String author){
        testCaseName = value;
        this.module = module;
        this.author = author;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public String getModuleName(){
        return module;
    }

    public String getAuthorName(){
        return author;
    }
}
