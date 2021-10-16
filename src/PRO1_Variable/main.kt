package PRO1_Variable

fun main() {
//    VARIABLE (Tempat menyimpan data)
//    kotlin memiliki 2 jenis variabel = var(Mutable, dapat diubah) & val(Immutabel, tidak dapat diubah)
//    val lebih direkomendasikan dikotlin

    // MUTABLE
    // dapat diubah datanya dengan tipe data yang sama
    var firstname: String = "Zha"
    var name = "Zha"
    // deklarasi tipedata itu optional,
    // tidak wajib didefinisikan tipe data nya, secara pintar kotlin bisa mendeteksi tipedata

    println(firstname)
    println(name)
    name = "Hase"
    println(name)

    // IMMUTABLE
    //
    val age: Int = 19
    val year = 2001 //untuk angka defaultnya integer, kalo mau byte harus didefinisikan sebagai byte

//    year = 2002 -> mboten saget kados niku:)
    println("Lahir tahun $year, saat ini berusia $age")

    //NULLABLE
//    secara default, kotlin harus dideklarasikan nilainya, akan error jika tidak diberi nilai
//    kotlin mendukung variable null, karena kotlin bisa mengakses java
//    untuk mengakses variabel null, gunakan tanda tanya(?) setelah tipedata
    var nul = null
    var buah: String? = null
    println(nul)
    println(buah)
    println(buah?.length) //gunakan tanda tanya untuk mengakses fungsi

    //CONSTANT
//    constan merupakan immutable data, biasanya dideklarasikan dengan UPPER_CASE
//    constan wajib menggunakan val
//    constan digunakan untuk kebutuhan global(bisa diakses dari mana saja)
    println("nama saya $NAME, usia saya $AGE")
}