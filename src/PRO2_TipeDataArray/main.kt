package PRO2_TipeDataArray

fun main(){
    //ARRAY
//    deklarasi array kotlin menggunakan kata kunci array
//    <> -> diamond operasi
    val members: Array<String> = arrayOf("bii","mii")
    val ages: Array<Int> = arrayOf(1,16)
//    val numbers: Array = arrayOf(1,2,3) -> error cuk!

    println(members) // output -> [Ljava.lang.String;@77459877 => ini merupakan address memori arraynya

//    akses data dari indexing
//    index dimulai dari 0(sperti java). kalo pascal index dimulai dari 1
    println(members[1])

//    operasi array kotlin:
//    size -> panjang array, get(index) atau [index]-> mendapat data di index tertentu,
//    set(index, value) atau [index] = value -> mengubah data di index tertentu
    println(members.size)
    println(members.get(0))
    println(members.get(1))
    members.set(0,"Bii")
    members[1] = "Mii"
    println(members[0])
    println(members[1])

    //CATATAN
//    Meski variable val, masih bisa diubah, karna yang diubah isi arraynya
//    tapi kalo yang dirubang adalah si variable age nya, itu tidak bisa
//    age.set(1, 17) -> Bisa, karna hanya merubah isi arraynya
//    age = arrayof() -> Tidak bisa, mengganti variable val dengan array baru
//    atau data baru itu tidak bisa

    //ARRAY NULLABLE
//    wajib menyertakan panjang arraynya
    val color: Array<String?> = arrayOfNulls(5)
    println(color.size)
    color[0] = "Black"
    color[1] = "White"
    color[2] = "Red"
    color[3] = "Green"
    color[4] = "Blue"
    println(color[1])
}