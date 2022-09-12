fun main() {
    try {
    println("Masukan nama anda ")
    val nama: String? = readLine()

    println("Nama Lengkap Anda Adalah  = $nama")

    print("Masukan angka pertama :")
    val angka1: Int = readLine()!!.toInt()
    print("Masukan angka kedua :")
    val angka2: Int = readLine()!!.toInt()
    println("Hasil = ${angka1 + angka2}")

    println("Hasil = ${angka1 - angka2}")

    println("Hasil = ${angka1 * angka2}")

    println("Hasil = ${angka1 / angka2}")
}   catch(e:Exception) {
        print("Oparasion yang di masukan tidak valid")

    }
}







