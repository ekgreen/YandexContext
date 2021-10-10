//package ru.yandex.contest.medium

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import java.util.ArrayList
import java.util.Arrays


fun main() {
    val reader: Problem7FastInputReader = Problem7FastInputReader()

    println(threeSumDanya(reader.nextLine().removeSurrounding("[", "]").split(", ").map { it.toInt() }.toIntArray()))
}

fun threeSumDanya(input: IntArray): String {
//    if (input.isEmpty()){
//        return "[]"
//    }
    if (input.size == 1){
        return "[${input[0]}]"
    }

    Arrays.sort(input)
    val result: MutableList<List<Int>> = ArrayList()
    val n = input.size
    var a = 0

    while (a < n) {
        var b = a + 1
        var c = n - 1
        while (b < c) {
            if (input[b] + input[c] == -input[a]) {
                val temp: MutableList<Int> = ArrayList()
                temp.add(input[a])
                temp.add(input[b])
                temp.add(input[c])
                result.add(temp)
                while (b + 1 < c && input[b + 1] == input[b]) b++
                while (c - 1 > b && input[c - 1] == input[c]) c--
                b++
                c--
            } else if (input[b] + input[c] < -input[a]) b++ else c--
        }
        while (a + 1 < n && input[a + 1] == input[a]) a++
        a++
    }

    return result.joinToString(", ", "[", "]")
}


fun problem5() {
    TODO()
}

private class Problem5FastInputReader(inputStream: InputStream = System.`in`) {
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

