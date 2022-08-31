package br.com.alura.list

fun List<Livro?>.imprime() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor} publicado em ${it.anoPublicacao}"
    }

    println(" #### Lista de Livros #### \n$textoFormatado")
}