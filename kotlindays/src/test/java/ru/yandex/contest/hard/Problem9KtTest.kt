package ru.yandex.contest.hard

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import problem9

internal class Problem9KtTest{

    @Test
    fun `problem9 test case #1`(){
        val result = problem9(intArrayOf(1), intArrayOf(1), intArrayOf(1))

        Assertions.assertEquals(1,result)
    }

    @Test
    fun `problem9 test case #2`(){
        val result = problem9(intArrayOf(6,15,7,11,1,3,16,2), intArrayOf(19,18,19,16,10,8,19,8), intArrayOf(2,9,1,19,5,7,3,19))

        Assertions.assertEquals(41,result)
    }

    @Test
    fun `problem9 test case #3`(){
        val result = problem9(intArrayOf(11,10,14,24,5,9,3,17,27,20), intArrayOf(20,23,22,29,9,13,9,23,28,30), intArrayOf(2,2,3,2,4,3,4,4,7,2))

        Assertions.assertEquals(18,result)
    }
//
//    @Test
//    fun `problem9 test case #4`(){
//        problem9()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem9 test case #5`(){
//        problem9()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem9 test case #6`(){
//        problem9()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem9 test case #7`(){
//        problem9()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem9 test case #8`(){
//        problem9()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem9 test case #9`(){
//        problem9()
//
////        Assertions.assertEquals(,)
//    }

}