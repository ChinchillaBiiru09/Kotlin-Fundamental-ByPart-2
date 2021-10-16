package PRO3_TipeDataRange

fun main() {
    //RANGE
//    untuk membuat variable yang berisi urutan angka
//    range bisa ascending(1 sampai ??) atau descending(?? sampai 1)
//    cara membuat variabel range menggunakan ..(asc) dan downTo(desc)
    val range = 1..10 //ascending
    val range2 = 10 downTo 1 //descending
    val range3 = 1 .. 20 step 2 //step nilai
//    range tidak dapat diakses berdasarkan index
//    sebenarnya range bukan untuk menampung data, tapi biasanya digunakan untuk proses perulangan
    println(range)

    //OPERASI RANGE
//    count() -> total data range, contains(value) -> mengecek apakah ada value tersebut, return value nya boolean
//    first -> mendapatkan nilai pertama
//    last -> mendapatkan nilai terakhir
//    step -> mendapat step nilai
    println(range.count())
    println(range.contains(10))
    println(range.contains(20))
    println(range.first)
    println(range.last)
    println(range.step)
}