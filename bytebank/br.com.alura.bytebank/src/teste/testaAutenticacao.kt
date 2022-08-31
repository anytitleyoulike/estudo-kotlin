import modelo.*

fun testaAutenticacao() {
    val gerente = Gerente("Marcello", 10000.00, "999.222.111-22", 3669)
    val diretor = Diretor("Marcia", 13000.00, "888.222.666-33", 1008, 10.00);
    val cliente = Cliente("Lara", "111.222.444-99", 1234, Endereco());
    val sistemaInterno = SistemaInterno();


    sistemaInterno.entra(gerente, 3669);

    sistemaInterno.entra(diretor, 1008);
    sistemaInterno.entra(cliente, 1234);
}
