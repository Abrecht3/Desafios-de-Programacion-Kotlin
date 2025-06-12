package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 *
 */

fun main(){

    println(esEquilibrada("( { a + b }) "))

}

fun esEquilibrada( expresion: String): Boolean {

    val simbolos = mapOf("{" to "}","[" to "]","(" to ")")
    val stack = arrayListOf<String>()

    expresion.forEach {
        val simbolo = it.toString()
        val containKey = simbolos.containsKey(simbolo)

        if (containKey || simbolos.containsValue(simbolo)){
            if (containKey){
                stack.add(simbolo)
            }else if (stack.isEmpty() || simbolo != simbolos[stack.removeAt(stack.lastIndex)]){
                return false
            }
        }
    }
    return stack.isEmpty()
}
