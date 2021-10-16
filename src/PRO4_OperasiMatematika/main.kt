package PRO4_OperasiMatematika

fun main() {
    //OPERASI MATEMATIKA
//    + -> tambah, - -> kurang, * -> kali, / -> bagi, % -> modulus
    val tambah: Int = 1 + 1
    println(tambah)
    val kurang: Int = tambah - 1
    println(kurang)
    val kali: Int = kurang * tambah
    println(kali)
    val bagi: Int = kali / kurang
    println(bagi)
    val mod: Int = kali % tambah
    println(mod)

    //Gabungan
    val result = 10.0/3.0 // -> untuk memperoleh hasil koma2
    val result2 = 10 + 10 / 2 // -> mengutamakan pembagian dan perkalian


    //AUGMENTED ASSIGNMENT
//    a = a + 10 -> a += 10, a = a - 10 -> a -= 10, a = a * 10 -> a *= 10
//    a = a / 10 -> a /= 10, a = a % 10 -> a %= 10
    var hasil_biasa = 10
    hasil_biasa = hasil_biasa + 10 // -> ada warning, karna secara default menggunakan augmented assignment
    println("Hasil assignment biasa => $hasil_biasa")
    var hasil_aug = 10
    hasil_aug += 10
    println("Hasil Augmented assignment => $hasil_aug")



    //OPERATOR UNARY
//    ++ (increment) -> a = a + 1, -- (decrement) -> a = a - 1, - -> negative
//    + -> positive, !(Bang) -> negasi/kebalikan(untuk boolean)
    hasil_aug++
    hasil_aug++
    println(hasil_aug)
    hasil_aug--
    hasil_aug--
    println(hasil_aug)
}