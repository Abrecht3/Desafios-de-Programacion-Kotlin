package com.albrecht3.retosdeprogramacion.ejercicios

/**
 * Precio de la entrada de cine
 *
 * Las entradas de cine suelen tener un precio diferente segun la edad de los espectadores.
 *
 * Escribe un programa que calcule los precios de esas entradas basados en la edad:
 *
 *  -Un precio de entrada infantil de USD 15 para personas de 12 años o menos
 *  -un precio de entrada estandar de USD 30 para personas de entre 13 y 60 años.
 *  -Los Lunes, un precio estandar con descuento de USD 25 para el mismo grupo etario
 *  -Un precio para adultos mayores de USD 20 para personas de 61 años o más
 *      (asumir que la edad maxima de un espectador es de 100 años)
 *  -Un valor de -1 para indicar que el precio no es valido cuando un usuario ingresa una edad
 *      fuera de las especificaiones
 *
 * Resultados
 * the movie ticket price for a person aged 5 is $15
 * the movie ticket price for a person aged 28 is $25
 * the movie ticket price for a person aged 87 is $20
 */
fun main(){
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("the movie ticket price for a person aged $child is \$${ticketPrice(child,isMonday)}")
    println("the movie ticket price for a person aged $adult is \$${ticketPrice(adult,isMonday)}")
    println("the movie ticket price for a person aged $senior is \$${ticketPrice(senior,isMonday)}")
}

fun ticketPrice(age:Int,isMonday:Boolean): Int {
    //fill in the code
    return when(age){
        in 1..12-> 15
        in 13..60-> if(isMonday) 25 else 30
        in 61..100-> 20
        else -> -1
    }
}