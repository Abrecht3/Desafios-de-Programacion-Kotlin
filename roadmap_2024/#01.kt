package com.albrecht3.retosdeprogramacion.roadmap_2024

/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 */

fun main(){
    operadorSigno()
    operadorAritmetico()
    operadorAsigComp()
    aumentaDisminuye()
    relacionales()
    oLogicos()
    nivelDeBits()
    condicional()
    ejercicioExtra()
}

//operador signo '+' y '-'
fun operadorSigno(){
    val a = -5
    val b = +9
    println("operadores de signo")
    println("$a y $b")
}

//operador Aritmetico "+ - * / %"
fun operadorAritmetico(){
    var a = 50
    var b = 7

    println("operadores Aritmeticos")
    println("($a + $b) = ${a + b}") //equivalente a.plus(b) suma
    println("($a - $b) = ${a - b}") //equivalente a.minus(b) resta
    println("($a * $b) = ${a * b}") //equivalente a.times(b) multiplicacion
    println("($a / $b) = ${a / b}") //equivalente a.div(b) division
    println("($a % $b) = ${a % b}") //equivalente a.rem(b) residuo
}

//operadores de asignacion compuesta += -= *= /= %=
fun operadorAsigComp() {
    var a = 40
    var b = 23

    println("operadores de asignacion compuesta")

    a+=b
    println("+= $a")
    a-=b
    println("-= $a")
    a*=b
    println("*= $a")
    a/=b
    println("/= $a")
    a%=b
    println("%= $a")
}

//operadores de incremento y decremento '++' y '--'
fun aumentaDisminuye(){
    var aum = 2

    for( i in 0 .. 5){
        println("i++ = ${aum++}")
    }

    for( i in 0 .. 5){
        println("i-- = ${aum--}")
    }
}

//Operadores Relacionales
fun relacionales(){
    val a = 34
    val b = 23

    println("$a == $b : ${a==b}")
    println("$a != $b : ${a!=b}")
    println("$a <= $b : ${a<=b}")
    println("$a >= $b : ${a>=b}")
    println("$a  < $b : ${a<b}")
    println("$a  > $b : ${a>b}")

}

//Operadores Lógicos
fun oLogicos() {
    val verdad = true
    val falso = false

    println("$verdad && $falso: ${verdad && falso}")
    println("$verdad || $falso: ${verdad || falso}")
    println("!$verdad: ${!verdad}")

}

//Operadores A Nivel De Bits
fun nivelDeBits(){
    val a = 6
    val b = 4

    println("$a and $b: ${a and b}")
    println("$a or $b: ${a or b}")
    println("$a xor $b: ${a xor b}")
    println("   not $a: ${a.inv()}")
    println("$a shl $b: ${a shl b}")
    println("$a shr $b: ${a shr b}")
    println("$a ushr $b: ${a ushr b}")

}

fun condicional(){
    val a = 9
    val b = 3

    if(a >= b){
        println("$a >= $b")
    }

    if(a < (b*4)){
        println("pero $a es menor que $b*4")
    }else{
        println("jaja")
    }

}

fun ejercicioExtra(){
    var a = 0
    for(it in 10..55){
        if ( it != 16 && it % 3 != 0){
            println("$it")
        }
    }
}