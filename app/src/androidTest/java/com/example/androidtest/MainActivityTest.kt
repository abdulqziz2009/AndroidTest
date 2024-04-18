package com.example.androidtest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.regex.Pattern.matches

@RunWith(JUnit4::class)
class MainActivityTest {
    @Rule
    val rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testplus() {
        onView(withId(R.id.ed_1)).perform(typeText("2"))
        onView(withId(R.id.ed_2)).perform(typeText("2"))
        onView(withId(R.id.btn_plus)).perform(click())
        onView(withId(R.id.btn_minus)).check(matches(withText("4")))
    }
    @Test
    fun testMinus() {
        onView(withId(R.id.ed_1)).perform(typeText("2"))
        onView(withId(R.id.ed_2)).perform(typeText("2"))
        onView(withId(R.id.btn_plus)).perform(click())
        onView(withId(R.id.btn_minus)).check(matches(withText("4")))
    }
    @Test
    fun testEd1(){

    }
    @Test
    fun testEd2(){

    }
}

