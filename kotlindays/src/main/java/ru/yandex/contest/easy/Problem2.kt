//package ru.yandex.contest.easy

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun main(){
    val reader: Problem2FastInputReader = Problem2FastInputReader()

    val n: Int = reader.nextInt()
    val a = intArrayOf(0, 1, 1)

    for (i in 0 until n-2) {
        val sum = a[0] + a[1] + a[2]
        a[0] = a[1]
        a[1] = a[2]
        a[2] = sum
    }

    print(a[2])
}

fun problem2(){
    TODO()
}

private class Problem2FastInputReader(inputStream: InputStream = System.`in`) {
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