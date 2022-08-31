package teste

import Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        completo()
    }.let {
        println(it)
    }
}