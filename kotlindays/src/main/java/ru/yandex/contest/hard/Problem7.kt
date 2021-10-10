//package ru.yandex.contest.hard

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

fun main(){
    val reader: Problem7FastInputReader = Problem7FastInputReader()

    val a = reader.nextLine().toCharArray()
    val b = reader.nextLine().toCharArray()

    println(editDistance(a, b))
}

/**
 * Вычисление минимального расстояния между строками
 *
 * A - первая строка
 * B - вторая строка
 *
 * insertion = вставка в первую строку A    = +1
 * deletion  = вставка во вторую строку B   = +1
 * match     = A[i] == B[j]                 = +0
 * mismatch  = A[i] != B[j]                 = +1
 *
 * Example comparing:
 *
 * A[1....n] = EDITING
 * B[1....m] = DISTANCE
 *
 * @see <a href="notes/edit.distance.algorighm.png"></a>
 */
fun editDistance(A: CharArray, B: CharArray): Int {
    return distanceArray(A,B)[A.size][B.size]
}

fun distanceArray(A: CharArray, B: CharArray): Array<IntArray>{
    fun min(insertion: Int, deletion: Int, mathOrMismatch: Int): Int {
        return min(min(insertion, deletion), mathOrMismatch)
    }

    val n = A.size + 1
    val m = B.size + 1

    val D: Array<IntArray> = Array(n) { IntArray(m) }

    for (i in 0 until n)
        D[i][0] = i // i - строки
    for (j in 0 until m)
        D[0][j] = j // j - столбцы

    for (j in 1 until m) {
        for (i in 1 until n) {
            val insertion = D[i][j - 1] + 1
            val deletion = D[i - 1][j] + 1
            val match = D[i - 1][j - 1]
            val mismatch = D[i - 1][j - 1] + 1

            if (A[i - 1] == B[j - 1])
                D[i][j] = min(insertion, deletion, match)
            else
                D[i][j] = min(insertion, deletion, mismatch)
        }
    }

    return D
}

internal class Problem7FastInputReader(inputStream: InputStream = System.`in`) {
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