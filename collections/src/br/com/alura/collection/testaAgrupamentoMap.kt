package br.com.alura.collection

fun testaAgrupamentoMap() {
    data class Pedido(val numero: Int, val valor: Double);

    val pedidos = listOf<Pedido>(
        Pedido(1, 60.0),
        Pedido(2, 30.0),
        Pedido(3, 50.0),
        Pedido(4, 20.0)
    )

    println(pedidos)

    val pedidosMap = pedidos.associate { pedido: Pedido ->
        pedido.numero to pedido
    }

    println(pedidosMap)

    val associateBy: Map<Int, Pedido> = pedidos.associateBy { it.numero }

    println(associateBy)

    // associa o resultado dentro  a um objeto
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { it.valor > 50 }

    println(pedidosFreteGratis)

    val groupingBy = pedidos.groupBy { pedido -> pedido.valor > 50 }
    println(groupingBy)

    val nomes = listOf("MArcello", "Henrique", "Marcos", "Joana", "Maria", "Isabella", "Natalia", "Luciana")

    val agendaNomes = nomes.groupBy { nome -> nome.first() }

    println(agendaNomes)
    println(agendaNomes['M'])
}