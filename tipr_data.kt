fun main() {
    var nama: String ="Rinaldi"
    var Alamat: String ="""
        Saya tinggal di Dompas belajar di
        politeknik Bengkalis Di prodi Rekayasa
        Perangkat lunak
    """.trimIndent()

    println(nama)
    println ("Tentang "+ Alamat)

    //deklarasi VAL =imutable VAR=mutable
    nama= "aldi"
    println(nama)
}