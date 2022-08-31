package modelo

class Gerente (
    nome: String,
    sal: Double,
    cpf: String,
    senha: Int
): FuncionarioAdmin(
    nome = nome,
    salario = sal,
    cpf = cpf,
    senha = senha
), Autenticavel {
    override val bonificacao: Double
        get() {
            return salario * 0.2
        }

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}