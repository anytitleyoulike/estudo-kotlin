package teste

import java.lang.ClassCastException

class TestaCast {
    fun metodo1() {
        println("executando metodo 1")
        try {
            metodo2();
        } catch ( e: ClassCastException) {
            println(e.message);
            println(e.printStackTrace());
            println("Class cast foi pega");
        }
        println("fim metodo1")
    }

    fun metodo2() {
        println("executando metodo 2")
        for(i in 1..5) {
            println(i)
            val endereco = Any();
//        endereco as Endereco
        }
        println("fim metodo 2")
    }
}