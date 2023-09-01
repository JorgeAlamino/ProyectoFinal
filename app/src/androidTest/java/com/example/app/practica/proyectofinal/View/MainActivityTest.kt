package com.example.app.practica.proyectofinal.View

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.app.practica.proyectofinal.R
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    //Esta cintaxis nos permite q rule nos probea un escenario y q este vinculado a esta activity
    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun mainActivity_Button(){
        //Espresso: una biblioteca que nos permite manipular la activity
        Espresso.onView(
            ViewMatchers.withId(R.id.button)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.result)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("It´s the same text :D")
            )
        )
    }
}