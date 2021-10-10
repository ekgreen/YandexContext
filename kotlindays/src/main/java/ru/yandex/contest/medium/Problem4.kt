//package ru.yandex.contest.medium

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun main() {
    val reader: Problem4FastInputReader = Problem4FastInputReader()

    val S: String = reader.nextLine()

    println(problem4(S))
}

fun problem4(S: String): String {
    val set: MutableSet<Char> = HashSet<Char>()
    val stack: Stack<Char> = Stack<Char>()
    val array = IntArray(26)

    for (i in S)
        array[i - 'a'] += 1

    for (ch in S) {
        if (set.contains(ch)) {
            array[ch - 'a'] -= 1
            continue
        }

        while (!stack.isEmpty() && stack.peek() > ch && array[stack.peek() - 'a'] > 0) {
            set.remove(stack.pop())
        }

        stack.add(ch)
        array[ch - 'a'] -= 1
        set.add(ch)
    }

    return stack.joinToString("")
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