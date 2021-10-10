package ru.yandex.contest.medium

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import problem4

internal class Problem4KtTest{

    @Test
    fun `problem4 test case #1`(){
        Assertions.assertEquals("azyxw",problem4("azyxwa"))
    }

    @Test
    fun `problem4 test case #2`(){
        Assertions.assertEquals("abc",problem4("bcabc"))
    }

    @Test
    fun `problem4 test case #3`(){
        Assertions.assertEquals("acdb",problem4("cbacdcbc"))
    }

    @Test
    fun `problem4 test case #4`(){
        Assertions.assertEquals("hvojsz",problem4("hhvojhzsz"))
    }

    @Test
    fun `problem4 test case #5`(){
        Assertions.assertEquals("abcd",problem4("abcdadcbacdb"))
    }

//
//    @Test
//    fun `problem4 test case #5`(){
//        problem4()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem4 test case #6`(){
//        problem4()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem4 test case #7`(){
//        problem4()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem4 test case #8`(){
//        problem4()
//
////        Assertions.assertEquals(,)
//    }
//
//    @Test
//    fun `problem4 test case #9`(){
//        problem4()
//
////        Assertions.assertEquals(,)
//    }

}