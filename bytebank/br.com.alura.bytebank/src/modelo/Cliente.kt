package modelo

import Endereco

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
    var endereco: Endereco?
): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha;
    }
}