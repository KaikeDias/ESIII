package ex02.q11

class Usuario {
    private val conteudos = mutableListOf<Conteudo>()

    fun criarConteudo(conteudo: String, tipo: String) {
        val novoConteudo: Conteudo = when (tipo) {
            "Post" -> Post(conteudo)
            "Comentario" -> Comentario(conteudo)
            else -> throw IllegalArgumentException("Tipo de conteúdo desconhecido: $tipo")
        }
        conteudos.add(novoConteudo)
    }
}