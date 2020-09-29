package com.example.bitriseandroidkata

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class WelcomeMessageTest {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun Test_sameActivity() {

        onView(withId(R.id.editTextName))
            .perform(typeText("UserName"), closeSoftKeyboard())
        onView(withId(R.id.buttonShow)).perform(click())

        // Check that the text was changed.
        onView(withId(R.id.text_home))
            .check(matches(withText("Hello UserName")))
    }
}