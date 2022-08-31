package teste

import modelo.Autenticavel
import modelo.SistemaInterno

fun testaObject() {
    val fran = object: Autenticavel {
        val nome: String = "Marcello";
        val senha: Int = 1000
        override fun autentica(senha: Int): Boolean {
            return this.senha == senha;
        }
    }
    val sistemaInterno = SistemaInterno();
    sistemaInterno.entra(fran, 1000);
}