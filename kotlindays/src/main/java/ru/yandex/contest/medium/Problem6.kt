//package ru.yandex.contest.medium

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun main(){
    val reader: Problem6FastInputReader = Problem6FastInputReader()

    val N: Int = reader.nextInt()

    println(problem6())
}

fun problem6(){
    TODO()
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