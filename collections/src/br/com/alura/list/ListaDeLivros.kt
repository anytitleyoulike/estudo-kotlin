package br.com.alura.list

fun main() {

    listaDeLivros.add(Livro("Sagarana", "Guimarães Rosa", 1946))

    listaDeLivros.imprime()
    val ordenadosPorAno = listaDeLivros.sorted()

    ordenadosPorAno.imprime();

    val ordenadosPorTitulo = listaDeLivros
        .sortedBy { it.titulo }

    ordenadosPorTitulo.imprime()

    listaDeLivros
        .filter { it.anoPublicacao > 1980 }
        .sortedBy { it.anoPublicacao }
        .imprime()

    val titulos = listaDeLivros
        .filter { it.autor.startsWith("W") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    print(titulos)
}