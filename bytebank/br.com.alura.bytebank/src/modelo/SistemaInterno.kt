package modelo


class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int, retorno: () -> Unit = {}): Boolean{
        if(admin.autentica(senha)) {
            retorno(); // high-order function: quando uma funçao é passada por argumento para outra
            println("Funcionario logado com sucesso")
            return true;
        }
        retorno(); // high-order function: quando uma funçao é passada por argumento para outra
        println("Erro ao efetuar o login")
        return false
    }

    fun entra(admin: Autenticavel, senha: Int, receiver: Autenticavel.() -> Unit = {}) : Boolean {
        if(admin.autentica(senha)) {
            println("Usuário logado com sucesso")
            return true
        }
        println("Erro ao efetuar login")
        return false
    }
}