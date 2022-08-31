package br.com.alura.list

fun main() {
//    livrosComNulos.imprime()

    listaDeLivros
        .groupBy { it.editora }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}