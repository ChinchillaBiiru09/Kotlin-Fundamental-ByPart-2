package PRO5_OperasiPerbandingan

fun main() {
    //OPERATOR PERBANDINGAN
//    > -> lebih dari, < -> kurang dari, >= -> lebih dari sama dengan, <= -> kurang dari sama dengan
//    == -> sama dengan/sebanding, != -> tidak sama dengan
    val a = 10
    val b = 20

    val result: Boolean = a < b
    println(result)

    println( a >= b) // -> buat merubah tanda ada disetting, editor, font, enable ligature
    println(b <= a)
    println(a != b)

//    perbandingan juga bisa untuk string
    println("Aku" >= "Kua") // -> false
    println("Aku" >= "aku") // -> false
    println("Aku" >= "Aku") // -> true
    println("Aku" >= "kuA") // -> false
//    kesimpulan:
//    pada perbandingan string, jumlah, karakter, upper/lower, urutan karakter akan berperngaruh
//    pada hasil perbandingan
}