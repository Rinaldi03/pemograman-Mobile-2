fun main() {
    println("Masukan Nama lengkap")
    val nama: String? = readLine()

    println("Nama Lengkap Anda Adalah  = $nama")

    println("Masukan Nilai UTS")
    val UTS: Int = readLine()!!.toInt()
    println("Masukan Nilai UAS")
    val UAS: Int = readLine()!!.toInt()

    val NA: Double = (0.4 * UTS) + (0.8 * UAS)
    println(NA)
    if (NA > 80) {
        println("Selamat Anda Naik Semester")
    }
        else (NA)
        println("Anda Cuti")

    println("Masukan Nilai Anda 1-12")
    val angka: Int =readLine()!!.toInt()

    }
