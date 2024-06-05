package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

fun main(){
    invertiCadena("Hola mundo")
}

fun invertiCadena(frase: String){
    val tam = frase.length - 1
    var inverso:String = ""

    for(i in 0..tam){
        inverso+=frase[tam-i]
    }
    println(inverso)
}