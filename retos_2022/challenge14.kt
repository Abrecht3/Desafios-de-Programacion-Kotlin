package com.albrecht3.retosdeprogramacion.retos_2022

import kotlin.math.pow

/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 *
 * Número de Armstrong:
 * Un número que es igual a la suma de sus dígitos, cada uno elevado a la potencia del número total de dígitos en el número.
 */

fun main(){
    println(armstrong(9))
    println(armstrong(-39))
    println(armstrong(153))
    println(armstrong(945))
}

fun armstrong(num: Int): Boolean {

    return if (num >= 0){
        var suma = 0
        val potencia = num.toString().length

        num.toString().forEach { character->
            suma += character.toString().toDouble().pow(potencia.toDouble()).toInt()
        }
        num == suma
    }else{
        false
    }
}

