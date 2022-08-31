package br.com.alura.list

fun main() {
    val prateleira = Prateleira(genero = "literatura", livros = listaDeLivros)

    prateleira.organizarPorAutor().imprime()
    prateleira.organizarPorAnoPublicacao().imprime()
}