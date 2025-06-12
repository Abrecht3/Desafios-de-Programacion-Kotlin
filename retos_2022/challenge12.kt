package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 */

fun main(){
    println(esPalindromo("Dabale arroz a la zorra el Abad"))
    println(esPalindromo("Ana lleva al oso la avellana"))
    println(esPalindromo("Merequetengue!!"))
}

fun esPalindromo(txt: String): Boolean{

    var frase = txt.lowercase().replace("[^a-zA-Z0-9]".toRegex(),"")
    val tam = frase.length - 1
    var inversa = ""

    println(frase)

    for(i in 0..tam){
        inversa+=frase[tam-i]
    }

    println(inversa)

    return frase.contentEquals(inversa)

}