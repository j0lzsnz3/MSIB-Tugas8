class PendaftaranGuru : Pendaftaran() {

    private var namaGuru: String? = null

    fun doPendaftaran(namaGuru: String) {
        this.namaGuru = namaGuru
    }

    override fun cetakPendaftaran() {
        println("------------PENDAFTARAN GURU---------------")
        println("Nama Pendaftar: $namaGuru")
        println("------------------------------------------------")
    }
}