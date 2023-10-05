package ex02.q04

class UtilitariosString(private var texto: String) {
    fun removerEspacos(): String {
        return texto.replace(" ", "")
    }

    fun quebrarEmPalavras(): Array<String> {
        return texto.split(" ").toTypedArray()
    }
}