Feature: Sales Upload Document
  Scenario: Sales Upload Invalid Faskes Awal
    Given Sales click upload foto faskes awal
    And Sales Klik Simpan File
    Then Sales message file empty error

  Scenario: Sales Upload Invalid Faskes Awal
    Given Sales click upload foto faskes awal
    And Sales insert invalid type foto
    And Sales Klik Simpan File
    Then Sales message file type error

  Scenario: Sales Upload Invalid Faskes Awal
    Given Sales click upload foto faskes awal
    And Sales insert invalid size foto
    And Sales Klik Simpan size 6mb File
    Then Sales message file size error

  Scenario: Sales Upload Valid Faskes Awal
    Given Sales click upload foto faskes awal
    And Sales insert valid foto faskes awal
    And Sales Klik Simpan File
    Then Sales gambar faskes awal berhasil diupload

  Scenario: Sales Upload Invalid Faskes Tujuan
    Given Sales click upload foto faskes tujuan
    And Sales Klik Simpan File
    Then Sales message file empty error

  Scenario: Sales Upload Invalid Faskes Tujuan
    Given Sales click upload foto faskes tujuan
    And Sales insert invalid type foto
    And Sales Klik Simpan File
    Then Sales message file type error

  Scenario: Sales Upload Invalid Faskes Tujuan
    Given Sales click upload foto faskes tujuan
    And Sales insert invalid size foto
    And Sales Klik Simpan size 6mb File
    Then Sales message file size error

  Scenario: Sales Upload Valid Faskes Tujuan
    Given Sales click upload foto faskes tujuan
    And Sales insert valid foto faskes tujuan
    And Sales Klik Simpan File
    Then Sales gambar faskes tujuan berhasil diupload

  Scenario: Sales Upload Invalid Tanda Tangan Digital
    Given Sales click upload foto tanda tangan digital
    And Sales Klik Simpan File
    Then Sales message file empty error

  Scenario: Sales Upload Invalid Tanda Tangan Digital
    Given Sales click upload foto tanda tangan digital
    And Sales insert invalid type foto
    And Sales Klik Simpan File
    Then Sales message file type error

  Scenario: Sales Upload Invalid Tanda Tangan Digital
    Given Sales click upload foto tanda tangan digital
    And Sales insert invalid size foto
    And Sales Klik Simpan size 6mb File
    Then Sales message file size error

  Scenario: Sales Upload Valid Tanda Tangan Digital
    Given Sales click upload foto tanda tangan digital
    When Sales insert valid foto tanda tangan digital
    And Sales Klik Simpan File
    Then Sales gambar tanda tangan berhasil diupload dan dokumen lengkap