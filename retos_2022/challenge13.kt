package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #13
 * FACTORIAL RECURSIVO
 * Fecha publicación enunciado: 28/03/22
 * Fecha publicación resolución: 04/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 *
 *
 */

fun main(){
    println(factorial(9))
}

fun factorial(n: Int): Int? {

    return if (n < 0) null else if (n <= 1) 1 else n * (factorial(n - 1)!!)
}
