package teste

import modelo.Autenticavel
import modelo.SistemaInterno

fun testaHighOrderFunction() {
    soma(10, 30) { println(it) }

    val objTeste = object : Autenticavel {
        val senha: Int = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(objTeste, 5343) {
        println("entrou na high order function por lambda")
    }
    SistemaInterno().run {
        entra(objTeste, 1234) {
            println("entrou na high order function pela scope function RUN")
        }
    }

    somaReceiver(10,65) {
        println("Soma receiver $this")
    }
}

fun soma (a: Int, b: Int, retorno: (Int) -> Unit) {
    retorno(a + b)
}

fun somaReceiver(a:Int, b: Int, receiver: Int.() -> Unit) {
    val result = a + b;
    result.receiver()
}
