package teste

import modelo.Auxiliar

fun testaFuncaoAnonima() {
    val funcaoAnonima: () -> String = fun(): String {
        return "Executando função anônima"
    }
    println(funcaoAnonima())

    val anomFunct = fun(): Auxiliar {
        return Auxiliar("Marcello cordeiro", 10000.00, "96297930244")
    }

    println(anomFunct().nome)

}


val lambdaFunction: (String) -> String = { s: String ->
    s
}
