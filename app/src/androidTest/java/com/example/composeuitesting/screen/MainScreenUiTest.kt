package com.example.composeuitesting.screen

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.composeuitesting.MainActivity
import com.example.composeuitesting.util.Constants
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by talhafaki on 15.05.2022.
 */

@RunWith(AndroidJUnit4::class)
class MainScreenUiTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun isDisplayed_and_check_text() {
        composeTestRule
            .onNodeWithTag(Constants.TITLE_TAG)
            .assertIsDisplayed()
            .assert(hasText("COMPOSE UI TESTING"))
    }

    @Test
    fun isDisplayed_and_check_button_text() {
        composeTestRule
            .onNodeWithTag(Constants.BUTTON_TAG)
            .assertIsDisplayed()
            .assert(hasText("Click me!"))
    }

    @Test
    fun change_button_text_when_clicked() {
        composeTestRule
            .onNodeWithTag(Constants.BUTTON_TAG)
            .performClick()
            .assert(hasText("Text changed!"))
    }

}