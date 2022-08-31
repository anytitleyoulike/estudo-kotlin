package br.com.alura.list

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor():List<Livro> {
        println("Ordenado por autor")
        return livros.sortedBy { it.autor };
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        println("Ordenado por ano")
        return livros.sortedBy { it.anoPublicacao };
    }
}