//package ru.yandex.contest.medium

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.math.BigDecimal
import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main() {
    val reader: Problem6FastInputReader = Problem6FastInputReader()
    val list = reader.nextLine().split("x").map { it.toInt() }.toList()

    println(numberOfPathsDP(max(list[0], list[1]), min(list[0], list[1])))
}

fun numberOfPaths(n: Int, m: Int): BigDecimal {
    var path: BigDecimal = BigDecimal.ONE

    for (i in n until (m + n - 1)) {
        path *= i.toBigDecimal()  // path * i / ( i - n + 1 )
        path /= (i.toBigDecimal() - n.toBigDecimal() + BigDecimal.ONE)
    }

    return path
}

fun numberOfPathsDP(m: Int, n: Int): Long {
    val count = Array(m) { LongArray(n) }

    for (i in 0 until m) count[i][0] = 1

    for (j in 0 until n) count[0][j] = 1

    for (i in 1 until m) {
        for (j in 1 until n)
            count[i][j] = count[i - 1][j] + count[i][j - 1]
    }
    return count[m - 1][n - 1]
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