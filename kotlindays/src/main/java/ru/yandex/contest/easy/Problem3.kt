//package ru.yandex.contest.easy

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

fun main() {
    val reader: Problem3FastInputReader = Problem3FastInputReader()
    val pattern: CharArray = reader.nextLine().toCharArray()
    val dictionary: MutableMap<Char, String> = HashMap()
    val already: MutableSet<String> = HashSet()

    var result: Boolean = true

    for (i in pattern.indices) {
        val char: Char = pattern[i]
        val next = reader.next()

        if (dictionary.containsKey(char)) {
            if (next != dictionary.get(char)) {
                result = false
                break
            }
        } else {
            if (already.contains(next)) {
                result = false
                break
            }

            already.add(next)
            dictionary.put(char, next)
        }
    }

    println(result)
}

fun problem3() {
}

internal class Problem3FastInputReader(inputStream: InputStream = System.`in`) {
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