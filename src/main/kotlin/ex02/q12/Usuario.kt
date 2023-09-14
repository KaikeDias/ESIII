package ex02.q12

class Usuario(private val relacionamentos: MutableList<Relacionamento>) {

    fun addRelacionamento(outroUsuario: Usuario, tipo: TipoRelacionamento) {
        val relacionamento: Relacionamento = Relacionamento(iniciador = this, receptor = outroUsuario, tipo = tipo)

        relacionamentos.add(relacionamento)
    }
}