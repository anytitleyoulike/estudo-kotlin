package br.com.alura.forum.application.service

import br.com.alura.forum.application.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService {

    val usuarios = listOf<Usuario>(Usuario(1,"marc@ello.com", "Marcello"))
    fun buscarUsuario(idUsuario: Long): Usuario {
        return usuarios.filter { it.id == idUsuario }.first()
    }
}
