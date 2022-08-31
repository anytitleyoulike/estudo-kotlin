package br.com.alura.collection

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Lucas", "Marcello", "Luciana")
    val assistiramCursoKotlin: Set<String> = setOf("Joao", "Marcello", "Julia")

    var assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos)

//    assistiramAmbos.map {
//        println("map ${it}");
//    }

    println(assistiramCursoKotlin union assistiramCursoAndroid)
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)
}