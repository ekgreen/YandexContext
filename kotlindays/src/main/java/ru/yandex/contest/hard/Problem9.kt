//package ru.yandex.contest.hard

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

fun main() {
    val reader: Problem9FastInputReader = Problem9FastInputReader()

    val startTime: IntArray =
        reader.nextLine().removeSurrounding("[", "]").split(",").map { it.trim().toInt() }.toIntArray()
    val endTime: IntArray =
        reader.nextLine().removeSurrounding("[", "]").split(",").map { it.trim().toInt() }.toIntArray()
    val profit: IntArray =
        reader.nextLine().removeSurrounding("[", "]").split(",").map { it.trim().toInt() }.toIntArray()

    println(problem9(startTime, endTime, profit))
}

fun problem9(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
    val matrix: IntArray = IntArray(profit.size)

    val triplets: MutableList<Triple<Int, Int, Int>> = ArrayList()
    for (i in profit.indices)
        triplets.add(Triple(startTime[i], endTime[i], profit[i]))
    triplets.sortWith(TripletsComparator)

    for (i in profit.indices) {// interval
        val triple = triplets[i]

        var _profit: Int = triple.third
        for (k in i - 1 downTo 0) {
            val step = triplets[k]
            if (step.second <= triple.first) {
                _profit = max(_profit, matrix[k] + triple.third)
            }
        }

        matrix[i] = _profit
    }

    var max = -1
    for (i in profit.indices)
        max = max(max, matrix[i])

    return max
}

fun findPreviousTripleByFor(p: Int, triple: Triple<Int, Int, Int>, triplets: MutableList<Triple<Int, Int, Int>>): Int {
    var max: Int = -1
    var index: Int = -1

    for (i in p - 1 downTo 0) {
        val step = triplets[i]
        if (step.second <= triple.first && max < step.third) {
            max = step.third
            index = i
        }
    }

    return index
}

fun findPreviousTripleByBS(p: Int, triple: Triple<Int, Int, Int>, triplets: MutableList<Triple<Int, Int, Int>>): Int {
    return triplets.binarySearch(fromIndex = 0, toIndex = p) { if (it.second <= triple.first) 1 else -1 }
}

internal object TripletsComparator : Comparator<Triple<Int, Int, Int>> {
    override fun compare(o1: Triple<Int, Int, Int>, o2: Triple<Int, Int, Int>): Int {
        val compare = o1.first.compareTo(o2.first)

        return if (compare != 0) compare else o1.second.compareTo(o2.second)
    }
}

internal class Problem9FastInputReader(inputStream: InputStream = System.`in`) {
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