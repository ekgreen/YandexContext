package ru.yandex.contest.medium

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import numberOfPaths
import numberOfPathsDP

internal class Problem6KtTest {

    @Test
    fun `problem6 test case #1`() {
        Assertions.assertTrue(numberOfPaths(100, 1).toLong() == numberOfPathsDP(1, 100))
        Assertions.assertTrue(numberOfPaths(45, 11).toLong() == numberOfPathsDP(11, 45))
        Assertions.assertTrue(numberOfPaths(52, 31).toLong() == numberOfPathsDP(31, 52))
    }
//
//    @Test
//    fun `problem6 test case #2`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem6 test case #3`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem6 test case #4`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem6 test case #5`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem6 test case #6`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem6 test case #7`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem6 test case #8`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem6 test case #9`(){
//        problem6()
//
////        Assertions.assertEquals(,)
//    }
//
}