package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

fun main(){
    var polygon1="triangle"
    var polygon2="cuadrado"
    var polygon3="rectangulo"

    //println(area(polygon1))
    println(area(polygon2))
    //println(area(polygon3))
}

fun area(polygon:String): Int {
    if (polygon =="triangle") {
        println("Ingresa el valor de la base")
        var base = readln().toInt()
        println("Ingresa el valor de la altura")
        var altura = readln().toInt()
        return (base*altura)/2
    }else if (polygon == "cuadrado"){
        println("Ingresa el valor del lado")
        var lado = readln().toInt()
        return lado*lado
    }else{
        println("Ingresa el valor de la base")
        var base = readln().toInt()
        println("Ingresa el valor de la altura")
        var altura = readln().toInt()
        return (base*altura)
    }
}
