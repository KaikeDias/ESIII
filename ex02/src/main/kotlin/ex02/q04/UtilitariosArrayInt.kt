package ex02.q04

class UtilitariosArrayInt(private val array: IntArray) {
    fun ordenar() {
        return array.sort()
    }

    fun embaralhar() {
        return array.shuffle()
    }
}