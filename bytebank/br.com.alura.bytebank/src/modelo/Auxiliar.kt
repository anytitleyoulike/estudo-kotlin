package modelo

class Auxiliar (
    nome: String,
    sal: Double,
    cpf: String
): Funcionario(
    nome = nome,
    salario = sal,
    cpf = cpf
) {
    override val bonificacao: Double
        get() {
            return salario * 0.1
        }
}