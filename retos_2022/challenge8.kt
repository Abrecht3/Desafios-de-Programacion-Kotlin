package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin
 * utilizar funciones propias del lenguaje que lo hagan directamente.
 */

fun main(){
    decimalABinario(5422)
}

fun decimalABinario(num: Int) {
    var numero = num
    var binario = ""
    var cont:Int

    while (numero > 0){
        cont = numero%2
        numero /= 2
        binario="$cont$binario"
    }
    println(binario.ifEmpty { "0" })
}
