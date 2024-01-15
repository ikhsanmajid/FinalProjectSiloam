Feature: Sales Input Data
  Scenario: Sales Input Form Input
    Given Sales Form Input
    When Sales Input Nama
    And Sales Input Nomor BPJS
    And Sales Input Nomor KTP
    And Sales Input Alamat
    And Sales Select Kota KTP
    And Sales Input Faskes Awal
    And Sales Select Faskes Tujuan
    And Sales Klik Simpan Data
    Then Sales Data Berhasil Disimpan
