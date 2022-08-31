package teste

import Endereco

fun testaScopeFunction() {
    //    Endereco("Rua Parintins", 63, "Barra funda").let {
//        endereco ->
//        "${endereco.logradouro} ${endereco.bairro}".uppercase()
//    }.let(::println)
    Endereco("Rua machado bittencourt", 29, "Vila Clementino")
        .run {
            "$logradouro $bairro".uppercase()
        }.let { it ->
            println(it);
        }

    listOf<Endereco>(
        Endereco(complemento = "casa"),
        Endereco(complemento = ""),
        Endereco(complemento = "apartamento")

    ).filter { end ->
        end.complemento.isNotEmpty()
    }.let(::println)
}
