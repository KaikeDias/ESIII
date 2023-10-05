package ex02.q04

import kotlin.math.pow
import kotlin.math.sqrt

class UtilitariosCalculo(private val numeros: DoubleArray) {
    fun calcularMedia(): Double {
        if (numeros.isEmpty()) {
            return 0.0
        }

        val soma = numeros.sum()
        return soma / numeros.size
    }

    fun calcularDesvioPadrao(): Double {
        val media = calcularMedia()
        val somatorioDiferencasQuadradas = numeros.map { (it - media).pow(2) }.sum()
        val variancia = somatorioDiferencasQuadradas / numeros.size
        return sqrt(variancia)
    }
}