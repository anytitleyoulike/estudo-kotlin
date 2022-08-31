package teste

fun testaFunClassParam() {
    val soma = FuncaoPorClasseComParam()
    println(soma(200, 321));
}

class FuncaoPorClasseComParam: (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2;
    }
}


fun testaFuncaoPorClasse() {
    val funcaoPorClasse = FuncaoPorClasse()
    print(funcaoPorClasse());

}

class FuncaoPorClasse: () -> String {
    override fun invoke(): String {
        return "Essa é uma função executando por classe"
    }
}