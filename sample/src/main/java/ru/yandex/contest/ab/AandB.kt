package ru.yandex.contest.ab

import java.io.*
import java.util.*

fun main(){
    val reader: InputReader = fileReader("input.txt")

    val A: Int = reader.nextInt()
    val B: Int = reader.nextInt()

//    println(aAndB(A,B))
    println("output.txt", aAndB(A,B).toString())
}

fun stdReader(): InputReader {
    return InputReader()
}

fun fileReader(fileName: String): InputReader {
    return InputReader(FileInputStream(File(fileName)))
}

fun println(fileName: String, value: String) {
    val writer: Writer = BufferedWriter(FileWriter(File(fileName)))

    writer.write(value)
    writer.flush()
}

fun aAndB(A: Int, B: Int): Long {
    return A.toLong() + B
}


class InputReader(inputStream: InputStream = System.`in`) {
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