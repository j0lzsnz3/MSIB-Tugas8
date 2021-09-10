class PendaftaranMahasiswa : Pendaftaran() {

    private var namaPendaftar: String? = null

    fun doPendaftaran(nama: String) {
        this.namaPendaftar = nama
    }

    override fun cetakPendaftaran() {
        println("------------PENDAFTARAN MAHASISWA---------------")
        println("Nama Pendaftar: $namaPendaftar")
        println("------------------------------------------------")
    }
}