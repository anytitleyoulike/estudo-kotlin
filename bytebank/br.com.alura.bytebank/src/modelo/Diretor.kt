package modelo

class Diretor(
    nome: String,
    salario: Double,
    cpf: String,
    senha: Int,
    val plr: Double
): FuncionarioAdmin(nome, cpf, salario, senha), Autenticavel {

    override val bonificacao: Double
        get() {
            return (salario * 0.1) + plr + salario
        }

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha;
    }
}