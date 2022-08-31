import modelo.*

fun testaFuncionario() {
    val diretor = Diretor(cpf = "111.111.111-22", nome = "Marcello", salario = 2000.00, plr = 400.00, senha = 12345)
    val gerente = Gerente("Henrique", sal = 1000.00, cpf = "222.222.222-11", senha = 1111)
    val analistaLucas = Analista("Lucas", 600.00, "222.111.333-55")
    val analista = Analista("Maria", 1000.00, "111.222.333-44")
    val calculadoraBonificacao = CalculadoraBonificacao();

    calculadoraBonificacao.registra(analista);
    calculadoraBonificacao.registra(diretor);
    println(diretor.bonificacao);
    println(gerente.bonificacao);
    println(analistaLucas.bonificacao);
    println("total bonificação: ${calculadoraBonificacao.total}")

    var lucas = Gerente(
        nome = "Lucas Bastos",
        cpf = "111.111.222-12",
        sal = 1000.00,
        senha = 4321
    )

    var marcello = Diretor(
        "Marcello Cordeiro",
        4000.00,
        "962.979.302-44",
        1234,
        500.00,
    )
    println("Oi meu nome é ${lucas.nome} sou funcionário com salario de R$${lucas.salario}")
    println("Oi meu nome é ${marcello.nome} sou funcionário com salario de R$${marcello.salario}")
}