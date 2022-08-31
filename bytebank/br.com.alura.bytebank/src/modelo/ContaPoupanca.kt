package modelo
class ContaPoupanca (
    titular: Cliente,
    numero: Int
): Conta(numero = numero) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.saca(valorComTaxa)
    }
}