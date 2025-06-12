package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 */

fun main(){
    imprimeCadena("Hola", "Adios")
    imprimeCadena("Siempre", "Nunca")
    imprimeCadena("Coser", "Cantar")

    println()
    println(comparaFiltro("Analogo", "Electrico"))
    println(comparaFiltro("Electrico", "Analogo"))
}

fun imprimeCadena(str1: String, str2: String) {
    var out1=comparaCadena(str1,str2)
    var out2=comparaCadena(str2,str1)

    println(out1)
    println(out2)
}

fun comparaCadena(str1: String, str2: String): String {
    var out=""

    str1.lowercase().forEach {
        if (!str2.lowercase().contains(it)){
            out+=it
        }
    }
    return out
}

fun comparaFiltro(str1: String,str2: String): String {

    var out= str1.lowercase().filter { !str2.lowercase().contains(it) }

    return out
}
