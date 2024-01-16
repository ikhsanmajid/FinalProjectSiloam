Feature: Sales Input Data
  Scenario: Sales Input Empty Name Input
    Given Sales Form Input
    When Sales Input Empty Nama
    And Sales Input Nomor BPJS
    And Sales Input Nomor KTP
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan
    And Sales Klik Simpan Data
    Then Sales Validation Name Empty Appear

  Scenario: Sales Input Empty BPJS Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Empty Nomor BPJS
    And Sales Input Nomor KTP
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan
    And Sales Klik Simpan Data
    Then Sales Validation BPJS Empty Appear

  Scenario: Sales Input BPJS less than 13 Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Nomor BPJS less than 13
    And Sales Input Nomor KTP
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan
    And Sales Klik Simpan Data
    Then Sales Validation Nomor BPJS 13 character expected Appear

  Scenario: Sales Input Empty No KTP Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Nomor BPJS
    And Sales Input Empty Nomor KTP
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan
    And Sales Klik Simpan Data
    Then Sales Validation No KTP Empty Appear

  Scenario: Sales Input No KTP less than 16 Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Nomor BPJS
    And Sales Input Nomor KTP less than 16
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan
    And Sales Klik Simpan Data
    Then Sales Validation No KTP 16 character expected Appear

  Scenario: Sales Input Empty Alamat Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Nomor BPJS
    And Sales Input Nomor KTP
    And Sales Input Empty Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan
    And Sales Klik Simpan Data
    Then Sales Validation Alamat Empty Appear

  Scenario: Sales Input Empty Alasan Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Nomor BPJS
    And Sales Input Nomor KTP
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan Different
    And Sales Input Empty Alasan
    And Sales Klik Simpan Data
    Then Sales Validation Alasan Empty Appear


  Scenario: Sales Input Valid Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Nomor BPJS
    And Sales Input Nomor KTP
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan Different
    And Sales Input Alasan
    And Sales Klik Simpan Data
    Then Sales Data Berhasil Disimpan
