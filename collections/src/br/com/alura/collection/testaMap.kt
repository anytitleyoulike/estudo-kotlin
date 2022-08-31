package br.com.alura.collection

import java.math.BigDecimal

fun testaMap() {
    val pedidosMutable = mutableMapOf<Int, Double>(
        1 to 30.0,
        2 to 10.0,
        3 to 40.0,
        Pair(4, 60.0),
        Pair(5, 25.0)
    )
    // Para escrever novos elementos dentro do map é necessário que seja utilizado o mutableMap
    // Pode-se adicionar novos elementos dessas formas
    pedidosMutable[4] = 15.0
    pedidosMutable.put(5, 60.0)

    // Caso deseja atualizar um indice no map, basta utilizar o mesmo método put ou putIfAbsent
    pedidosMutable.putIfAbsent(5, 62.0) // atualiza apenas se existir
    //   pedidosMutable.put(5, 78.0)

    //Para remover um elemento é necessário utilizar o método remove()
    //   pedidosMutable.remove(4)
    pedidosMutable.remove(4, 12.0) // dessa forma só remove se o indice e o elemento forem IGUAIS

    println("===== MUTABLE =====")
    for (pedido in pedidosMutable) {
        println("Pedido: ${pedido.key} R$${pedido.value}")
    }

    val objetivo = Objetivo(
        "Acumular 100 pontos",
        currentValue = BigDecimal(90),
        goalCompletedValue = BigDecimal(100),
        status = STATUS.INCOMPLETE
    )
   pedidosMutable += mapOf<Int, Double>(Pair(6, 90.0), 7 to 200.0)


    println("subtract ${pedidosMutable - listOf(4)}");
    pedidosMutable -= 2;
    println(pedidosMutable);

    // para remover 1 ou mais chaves de um map
    println(pedidosMutable - setOf(1,4));

    pedidosMutable.keys.remove(5)
    println(pedidosMutable);

    pedidosMutable.values.remove(90.0)
    println(pedidosMutable)
}