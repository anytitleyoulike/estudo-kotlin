package br.com.alura.collection

fun testaComportamentoMap() {
    val pedidos = mutableMapOf<Int, Double>(1 to 30.0, 2 to 10.0, 3 to 40.0, 5 to 320.0)


    pedidos.get(4);
//    pedidos.getValue(4); // se o valor do indice não existir, uma exception(NoSuchElementException) é lançada
    println("===== NON MUTABLE =====")

    for (pedido in pedidos) {
        println("Pedido ${pedido.key} R$${pedido.value}")
    }

    /* Comportamentos MAP */
    val mensagem = pedidos.getOrElse(4) {
        "Não existe essa chave"
    }
    println("=== COMPORTAMENTOS MAP ===")
    println(mensagem)
    println(pedidos.getOrDefault(key = 4, defaultValue = 0.0))
    println("pedido com filter: ${pedidos.filter { (key, value) -> value == 10.0 }}");
    println("pedido com filter keys ${pedidos.filterKeys { key -> key % 2 != 0 }}")
    println("pedido pares maior que 10.0: ${pedidos.filterValues { value -> value % 2 == 0.0 && value > 10.0 }}");

    val map1 = mutableMapOf<String, Int>("one" to 1, "two" to 2)
    var map2 = mutableMapOf<String, Int>("one" to 1, "three" to 3, "four" to 4)

    map1 += map2;
    println(map1)
    map1 -= listOf("two", "three");
    println(map1)
    map1.keys.remove("four")
    println(map1)
    println(map2.getValue("three"));
}
