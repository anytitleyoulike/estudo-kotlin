package br.com.alura.list


val livro1 = Livro("A Revolução dos Bichos", "George Orwell", 1945, "marc");
val livro2 = Livro("Sapiens - Uma Breve História da Humanidade", "Yuval Harari", 2014, "marc");
val livro3 = Livro("Neuromancer", "William Gibson", 1984, "teste");
val livro4 = Livro("Blade Runner", "Phillip K. Dick", 1968, "teste");
val listaDeLivros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

val livrosComNulos: MutableList<Livro?> = mutableListOf(livro1, null, livro2);