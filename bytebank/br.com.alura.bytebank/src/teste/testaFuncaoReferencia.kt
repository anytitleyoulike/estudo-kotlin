package teste

// Função por referência com parâmetro
fun testaReferenciaParam(){
    val kfunction = ::funcaoRefParametro;

    println(kfunction(20, 800))
}

fun funcaoRefParametro(a:Int, b: Int): Int {
    return a + b
}


// sem parâmetro
fun testaFunReferencia() {
    val funReferencia = ::funcaoPorReferencia;

    println(funReferencia());
}

fun funcaoPorReferencia(): String {
    return "Essa é uma função executando por referência"
}