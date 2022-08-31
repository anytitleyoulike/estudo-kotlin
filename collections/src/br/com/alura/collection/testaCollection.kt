package br.com.alura.collection

fun testaCopia() {
    val banco = BancoDeNomes();
    banco.salva("Marcello")
    println(banco.nomes)
    BancoDeNomes().salva("HENRIQUE")
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes get() = dados.toList();
    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados: MutableList<String> = mutableListOf()
    }
}