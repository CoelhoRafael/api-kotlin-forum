package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class NovoTopicoForm(
    @field:NotEmpty(message = "titulo não pode ser em branco!")
    @field:Size(min = 5, max = 100, message = "titulo deve ter entre 5 e 100 caracteres!")
    val titulo: String,

    @field:NotEmpty(message = "mensagem não pode ser em branco!")
    @field:Size(min = 5, max = 100)
    val mensagem: String,

    @field:NotNull
    val idCurso: Long,

    @field:NotNull
    val idAutor: Long
)
