package com.example.androidtest

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class MathTest {
    lateinit var math: Math

    @Before
    fun setUp(){
        math = Math()
        println("before")
    }
    @Test
    fun testPlus(){
        assertEquals(4,math.plus(2,2))
    }
    @Test
    fun testMinus(){
        assertEquals(4,math.plus(8,4))
    }
    @Test
    fun testUmnoj(){
        assertEquals(4,math.plus(2,2))
    }
    @Test
    fun testdelit(){
        assertEquals(4,math.plus(8,2))
    }

}