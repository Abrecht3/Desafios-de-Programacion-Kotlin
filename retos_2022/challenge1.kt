package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
*/

fun main(){
    val palabra1 = "Gato"
    val palabra2 = "Pato"

    val respuesta = anagrama(palabra1, palabra2)

    println(respuesta)

}

private fun anagrama(word1:String, word2:String):Boolean{

    if (word1.lowercase() == word2.lowercase()){
        return false
    }
    //.lowercase()              convierte la palabra a minusculas
    // .toCharArray()           regresa los caracteres del string
    // .sortedArray()           ordena los caracteres
    // .contentEquals           compara con otra cadena, regresa un boolean
    return word1.lowercase().toCharArray().sortedArray().contentEquals(word2.lowercase().toCharArray().sortedArray())
}