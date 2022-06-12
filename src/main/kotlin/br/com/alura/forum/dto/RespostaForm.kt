package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class RespostaForm(
    @field:NotEmpty
    @field:Size(min = 5, max = 100)
    val mensagem: String,

    @NotNull
    val idUsuario: Long,

    @NotNull
    val idTopico: Long
)
