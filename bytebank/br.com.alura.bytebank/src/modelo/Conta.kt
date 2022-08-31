package modelo

abstract class Conta(val numero: Int) {

    var saldo = 0.0
    private set

    companion object Contador {
        var total: Int = 0;
    }
    init {
        total++
    }
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}