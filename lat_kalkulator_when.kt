fun main() {
    println("Masukan nama anda ")
    val nama: String? = readLine()

    println("Nama Lengkap Anda Adalah  = $nama")

    print("Masuk Angka Pertama :")
    val angka1 = readLine()!!.toDouble()
    print("Masuk Angka Kedua :")
    val angka2 = readLine()!!.toDouble()
    print("Masuk Angka Ketiga :")
    val angka3 = readLine()!!.toDouble()
    print("Masukan Oparasi - Tambah(a), Bagi(b), Perkalian(c), kurang(d): ")
    when (readLine()) {
        "a" ->
            print("Hasil = ${angka2 + angka3}")

        "b" -> {
            print("Hasil = ${angka2 / angka3}")

        }

        "c" -> {
            print("Hasil = ${angka1 * angka3}")

        }

        "d" -> {
            print("Hasil = ${angka3 - angka1}")

        }

        else -> {
            print("Oparasion yang di masukan tidak valid")
        }

    }
}


