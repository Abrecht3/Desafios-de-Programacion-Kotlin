package com.albrecht3.retosdeprogramacion.retos_2022


/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 */

val dictionary = mapOf("A" to ".-","B" to "-...","C" to "-.-.","D" to "-..",
    "E" to ".","F" to "..-.","G" to "--.","H" to "....",
    "I" to "..", "J" to ".---","K" to "-.-", "L" to ".-..",
    "M" to "--", "N" to "-.", "O" to "---", "P" to ".--.",
    "Q" to "--.-", "R" to ".-.", "S" to "...", "T" to "-",
    "U" to "..-", "V" to "...-", "W" to ".--", "X" to "-..-",
    "Y" to "-.--", "Z" to "--..",  "0" to "-----", "1" to ".----",
    "2" to "..---", "3" to "...--", "4" to "....—", "5" to ".....",
    "6" to "-....", "7" to "--...",  "8" to "---..", "9" to "----.",
    "." to ".-.-.-", "," to "--..--", "?" to "..--..", "\"" to ".-..-.",
    "/" to "-..-.")

fun main(){
    val nText = "Una cabra sentada en pegamento"
    val mText = decoder(nText)
    println(mText)
    println(decoder(mText))
}

fun decoder(input: String): String {

    var decoded = " "

    if (input.contains("[a-zA-Z0-9]".toRegex())){
        decoded = decoderToMorse(input)
    }
    if (input.contains("-") || input.contains(".")){
        decoded = decoderToNatural(input)
    }

    return decoded
}

fun decoderToMorse(input: String): String {

    var decodedInput = ""

    var index = 0

    input.uppercase().forEach { character->
        if (character.toString() != " "){
            decodedInput += dictionary[character.toString()]
            decodedInput += " "
        }else {
            decodedInput += " "
        }
        index++
    }
    return decodedInput
}

fun decoderToNatural(decoded: String): String {
    var toDecoded =""

    val morseDictionary = mutableMapOf<String, String>()

    dictionary.forEach {
        morseDictionary[it.value] = it.key
    }

    decoded.split(" ").forEach { word->
        word.split(" ").forEach { symbol->
            if (symbol.isNotEmpty()){
                toDecoded+= morseDictionary[symbol]
            }
        }
        toDecoded+=" "
    }

    return toDecoded
}
