package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

fun main(){
    val numero:Int = 29

    esPrimo(numero)
    mostrarPrimos()
}

fun esPrimo(num:Int) {
    val cont = comprobar(num)

    if (cont ==2) {
        println("$num es un numero Primo")
    }else{
        println("$num no es un numero Primo")
    }
}

fun comprobar(num: Int):Int{
    var comprobar:Int
    var cont:Int = 0

    for(index in 1..num){
        comprobar= num%index
        if (comprobar == 0) {
            cont += 1
        }
    }
    return cont
}
fun mostrarPrimos(){
    var cont:Int = 0
    for (num in 1..100){
        cont = comprobar(num)
        if (cont == 2) println(num)
    }
}