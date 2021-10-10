//package ru.yandex.contest.easy

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun main(){
    val reader: Problem1FastInputReader = Problem1FastInputReader()

    var list = reader.nextLine().removeSurrounding("[", "]").split(", ").map { it.toInt() }.toList()

    println(problem1(list))
}

fun problem1(array: List<Int>): Int {
    var sum = 0
    for (i in array.indices) {
        sum += array[i]
    }

    val total: Int = (array.size + 1) * array.size / 2

    return total - sum
}

internal class Problem1FastInputReader(inputStream: InputStream = System.`in`) {
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