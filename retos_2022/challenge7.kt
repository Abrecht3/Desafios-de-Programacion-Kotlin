package com.albrecht3.retosdeprogramacion.retos_2022

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 *
 */

fun main(){
    cuentaPalabras("Ayuda! necesito ayuda, mucha ayuda")
}

fun cuentaPalabras(text: String) {

    //genera un mapa muteable
    val words = mutableMapOf<String, Int>()

    //reemplaza lo que no sea numero o letra por un espacio vacio
    text.lowercase().replace("[^a-z0-9]".toRegex()," ").split(" ").forEach { key->
        if(key.isEmpty()){
            //si la llave es vacia regresa al ciclo
            return@forEach
        }
        if (words[key] != null){
            words[key] = words.getValue(key)+1
        } else{
          words[key] = 1
        }
    }

    words.forEach { word->
        println("${word.key} se ha repetido ${word.value} ${if (word.value == 1)"vez" else "veces"}")
    }
}
