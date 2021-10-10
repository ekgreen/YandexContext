//package ru.yandex.contest.hard

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun main(){
    val reader: Problem8FastInputReader = Problem8FastInputReader()

    var array = reader.nextLine().removeSurrounding("[", "]").split(",").map { it.toInt() }.toMutableList()

    println(problem8(array))
}

fun problem8(array: MutableList<Int>): Int {
    for (i in array.indices) {
        if (array[i] % 2 != 0) {
            array[i] *= 2
        }
    }

    var flag = true
    var diff = Integer.MAX_VALUE

    var max: Int
    var min: Int

    while (flag) {
        max = array.maxOrNull()!!
        min = array.minOrNull()!!

        if (max - min < diff) {
            diff = max - min
        }

        if (max % 2 == 0) {
            array[array.indexOf(max)] = max / 2
        } else {
            flag = false
        }
    }

    return diff
}

private class Problem8FastInputReader(inputStream: InputStream = System.`in`) {
    private val reader: BufferedReader = BufferedReader(InputStreamReader(inputStream))
    private var tokenizer: StringTokenizer? = null

    fun next(): String{
        while (tokenizer == null || !tokenizer!!.hasMoreElements()) tokenizer = StringTokenizer(nextLine())
        return tokenizer!!.nextToken()
    }

    fun nextInt(): Int {
        return next().toInt()
    }

    fun nextLong(): Long {
        return next().toLong()
    }

    fun nextDouble(): Double {
        return next().toDouble()
    }

    fun nextLine(): String {
        return reader.readLine()
    }
}