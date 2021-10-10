//package ru.yandex.contest.medium

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val reader: Problem4FastInputReader = Problem4FastInputReader()

    val S: String = reader.nextLine()

    println(problem4(S))
}

fun problem4(S: String): String {
    val result: MutableList<Pair<Char, Int>> = ArrayList()

    val chars: MutableList<Pair<Char, Int>> = ArrayList()
    for (i in S.indices)
        chars.add(Pair(S[i], i))
    chars.sortWith { o1, o2 -> o1.first.compareTo(o2.first) }

    var i = 0

    while (i < chars.size) { // a - 0, b - 7, c - ?
        var pair = chars[i]

        var j = result.size
        while (i < chars.size && j >= 0) {
            val position: Int = if (j > 0) result[result.size - 1].second else -1
            val char = chars[i]

            if(position == -1){
                while (++i< chars.size && char.first == chars[i].first) {/*SKIP*/}
                break;
            } else if (char.second > position) {
                while (++i < chars.size && char.first == chars[i].first) {/*SKIP*/}
                pair = char
                break;
            } else {
                j -= 1
            }
        }

        result.add(pair)
        result.sortWith { o1, o2 -> o1.second.compareTo(o2.second) }
    }

    result.sortWith { o1, o2 -> o1.second.compareTo(o2.second) }
    val builder: StringBuilder = StringBuilder()
    for (k in result.indices)
        builder.append(result[k].first)

    return builder.toString()
}

internal class Problem4FastInputReader(inputStream: InputStream = System.`in`) {
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