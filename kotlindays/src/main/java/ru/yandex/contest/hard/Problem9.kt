package ru.yandex.contest.hard

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun main(){
    val reader: Problem9FastInputReader = Problem9FastInputReader()

    val N: Int = reader.nextInt()

    println(problem9())
}

fun problem9(){
    TODO()
}

internal class Problem9FastInputReader(inputStream: InputStream = System.`in`) {
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