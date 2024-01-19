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
    U12("Sales Upload Valid Tanda Tangan Digital", "Upload Document Sales", "Ikhsan"),
    T1("Sales Click Edit Btn", "Tanda Tangan Sales", "Astrin"),
    T2("Sales Input Empty Name Input", "Tanda Tangan Sales", "Ikhsan"),
    T3("Sales Input Empty BPJS Input", "Tanda Tangan Sales", "Ikhsan"),
    T4("Sales Input BPJS less than 13 Input", "Tanda Tangan Sales", "Ikhsan"),
    T5("Sales Input Empty No KTP Input", "Tanda Tangan Sales", "Ikhsan"),
    T6("Sales Input No KTP less than 16 Input", "Tanda Tangan Sales", "Ikhsan"),
    T7("Sales Input Empty Alamat Input", "Tanda Tangan Sales", "Ikhsan"),
    T8("Sales Kota KTP different with Faskes Tujuan", "Tanda Tangan Sales", "Ikhsan"),
    T9("Sales Input Empty Alasan Input", "Tanda Tangan Sales", "Ikhsan"),
    T10("Sales Simpan Data", "Tanda Tangan Sales", "Ikhsan"),
    N1("Filter Data with Invalid date","New Sales Page","Astrin"),
    N2("Filter Data Valid","New Sales Page", "Astrin"),
    N3("Reset Filter Data","New Sales Page", "Astrin"),
    N4("Search Data without input keyword","New Sales Page", "Astrin"),
    N5("Search Data with input alphabet","New Sales Page", "Astrin"),
    N6("Search Data with input numeric","New Sales Page", "Astrin"),
    N7("Search Data with input symbol","New Sales Page", "Astrin"),
    N8("User Refresh data","New Sales Page", "Astrin"),
    N9("Check action signature","New Sales Page", "Astrin"),
    N10("Check action view","New Sales Page", "Astrin"),
    N11("Update data without data","New Sales Page", "Astrin"),
    N12("Cancel data existing","New Sales Page", "Astrin"),
    N13("Update data","New Sales Page", "Astrin"),
    N14("Delete document existing","New Sales Page", "Astrin"),
    N15("Reupload document existing","New Sales Page", "Astrin"),
    N16("Logout Sales", "Login Sales", "Ikhsan"),
    A1("Admin not input username and password", "Login Admin", "Yanuar"),
    A2("Admin Input only username", "Login Admin", "Yanuar"),
    A3("Admin input invalid username and password", "Login Admin", "Yanuar"),
    A4("Admin input valid username capital letters and valid password capital letters", "Login Admin", "Yanuar"),
    A5("Admin input valid username capital letters and valid password", "Login Admin", "Yanuar"),
    A6("Admin input valid username and valid password capital letters", "Login Admin", "Yanuar"),
    A7("Admin input password more than 16 char", "Login Admin", "Yanuar"),
    A8("Admin input valid username and invalid password", "Login Admin", "Yanuar"),
    A9("Admin input invalid username and valid password", "Login Admin", "Yanuar"),
    A10("Admin Input username dan password valid", "Login Admin", "Yanuar"),
    VE1("Filter data Januari 2024", "View & Export Admin", "Yanuar"),
    VE2("Start date empty and end date empty", "View & Export Admin", "Yanuar"),
    VE3("Start date is longer than end date", "View & Export Admin", "Yanuar"),
    VE4("Fill only start date", "View & Export Admin", "Yanuar"),
    VE5("Fill only end date", "View & Export Admin", "Yanuar"),
    VE6("Clear start date and end date", "View & Export Admin", "Yanuar"),
    VE7("Clear empty start date and empty end date", "View & Export Admin", "Yanuar"),
    VE8("Filter data and view data Januari 2024", "View & Export Admin", "Yanuar");

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
