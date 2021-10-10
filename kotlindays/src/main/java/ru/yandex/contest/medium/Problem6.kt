//package ru.yandex.contest.medium

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun main(){
    val reader: Problem6FastInputReader = Problem6FastInputReader()
    var list = reader.nextLine().split("x").map { it.toInt() }.toList()

    //println(uniquePaths(list[0], list[1]))
    println(numberOfPaths(list[0], list[1]))
}

fun numberOfPaths(n: Int, m: Int): ULong {
    var path = 1UL
    for (i in n until m + n - 1) {
        path *= i.toULong()
        path /= i.toULong() - n.toULong() + 1UL
    }
    return path
}
 fun uniquePathsUtil(m: Int, n: Int, dp: Array<LongArray>): Long {
    if (m == 1 || n == 1) return 1

     if (dp[m][n] != 0L)
         return dp[m][n]
     else
         return uniquePathsUtil(m - 1, n, dp) + uniquePathsUtil(m, n - 1, dp)
}

 fun uniquePaths(m: Int, n: Int): Long {
    val dp = Array(m + 1) { LongArray(n + 1) }

    return uniquePathsUtil(m, n, dp)
}

internal class Problem6FastInputReader(inputStream: InputStream = System.`in`) {
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