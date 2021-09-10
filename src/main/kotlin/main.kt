fun main(args: Array<String>) {
    val pendaftaranMahasiswa = PendaftaranMahasiswa()
    pendaftaranMahasiswa.doPendaftaran("Imam Kurniansyah")
    pendaftaranMahasiswa.cetakPendaftaran()

    val pendaftaranGuru = PendaftaranGuru()
    pendaftaranGuru.doPendaftaran("Dodo Suhardo")
    pendaftaranGuru.cetakPendaftaran()
}