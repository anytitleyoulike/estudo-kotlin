import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val alex = Cliente("Alex","000.111.222-33",1234,
        Endereco("av. castelo branco",1500,"cachoeirinha","am","69065010",""))
    val contaCorrente = ContaCorrente(alex, 1000);
    val marcello = Cliente("Marcello","000.111.222-33",1234,
        Endereco("Rua parintins", 63, "barra funda", "sp", "01155020",""))
    val contaMarcello = ContaPoupanca(marcello, 1001);

    val luciana = Cliente("Luciana Valente", "222.222.444-22", 12345, Endereco("rua machado bittencourt", 29, "vila clementino"))

    val contaDaLulu = ContaCorrente(luciana, 99999);

    contaDaLulu.deposita(100000.00)

    contaMarcello.deposita(1000.00)

    contaDaLulu.transfere(500.00, contaMarcello);

    println("A conta do marcello tem ${contaMarcello.saldo}")
    println("A conta da luciana tem ${contaDaLulu.saldo}")

}