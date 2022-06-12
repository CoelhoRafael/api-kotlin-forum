package br.com.alura.forum.service

import br.com.alura.forum.dto.AtualizacaoRespostaForm
import br.com.alura.forum.dto.NovaRespostaForm
import br.com.alura.forum.dto.RespostaView
import br.com.alura.forum.mapper.RespostaFormMapper
import br.com.alura.forum.model.Resposta
import org.springframework.stereotype.Service

@Service
class RespostaService(
    private val respostaFormMapper: RespostaFormMapper,
    private val topicoService: TopicoService
    ) {

    fun cadastrar(form: NovaRespostaForm, idTopico: Long) {
//        val reposta = reposta respostaFormMapper.map(form)
//        resposta.id = respostas.size.toLong() + 1
//        resposta.topico = topicoService.buscarPorId(idTopico)
//        respostas = respostas.plus(resposta)
    }

    fun atualizar(form: AtualizacaoRespostaForm): RespostaView {
//        val resposta = respostas.stream().filter { r ->
//            r.id == form.id
//        }.findFirst().get()
//        val respostaAtualizada = Resposta(
//            id = form.id,
//            mensagem = form.mensagem,
//            autor = resposta.autor,
//            topico = resposta.topico,
//            dataCriacao = resposta.dataCriacao
//        )
//        respostas = respostas.minus(resposta).plus(respostaAtualizada)
//        return respostaViewMapper.map(respostaAtualizada)
        return RespostaView()
    }

    fun deletar(id: Long) {
//        val resposta = respostas.stream().filter { r ->
//            r.id == id
//        }.findFirst().get()
//        respostas = respostas.minus(resposta)
    }
}