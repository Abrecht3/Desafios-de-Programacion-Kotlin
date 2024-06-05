package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Fecha publicación enunciado: 10/01/22
 * Fecha publicación resolución: 17/01/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
*/


fun main(){
    fibonacci()
}

private fun fibonacci(){
    var num1:Long = 1
    var num2:Long = 0
    var suma:Long

    for (index in 0..50) {
        println(num2)
        suma =num1+num2
        num2 = num1
        num1 = suma
    }
}