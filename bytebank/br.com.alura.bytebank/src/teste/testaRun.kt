package teste

import modelo.Cliente
import modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05;
    val taxaMensal = taxaAnual / 12
    val contaPoupanca = ContaPoupanca(Cliente("Marcello Cordeiro", "99922233311", senha = 1234, null), 120)
    contaPoupanca.run {
        deposita(1000.00)
        println("Rendimento mensal ${saldo * taxaMensal}")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Rendimento anual $rendimentoAnual")
}