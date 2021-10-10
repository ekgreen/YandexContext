//package ru.yandex.contest.medium

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.*

fun main() {
    val reader: Problem6FastInputReader = Problem6FastInputReader()
    val list = reader.nextLine().split("x").map { it.toInt() }.toList()

    println(numberOfPaths(list[0], list[1]))
}

fun numberOfPaths(n: Int, m: Int): BigInteger {
    if(n == 1 && m == 1)
        return BigInteger.ZERO

    var path = BigInteger.ONE
    val unit = BigInteger.ONE

    for (i in n until m + n - 1) {
        path *= i.toBigInteger()
        path /= i.toBigInteger() - n.toBigInteger() + unit
    }

    return path
}

internal class Problem6FastInputReader(inputStream: InputStream = System.`in`) {
    private val reader: BufferedReader = BufferedReader(InputStreamReader(inputStream))
    private var tokenizer: StringTokenizer? = null

    fun next(): String {
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