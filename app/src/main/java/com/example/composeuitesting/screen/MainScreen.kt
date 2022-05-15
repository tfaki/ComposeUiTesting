package com.example.composeuitesting.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeuitesting.R
import com.example.composeuitesting.ui.theme.Typography
import com.example.composeuitesting.util.Constants

/**
 * Created by talhafaki on 15.05.2022.
 */

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        var buttonText by remember {
            mutableStateOf("Click me!")
        }

        Text(
            text = stringResource(R.string.title),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(16.dp)
                .testTag(Constants.TITLE_TAG),
            style = Typography.titleMedium.copy(color = Color.Black, fontSize = 24.sp)
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(16.dp)
                .testTag(Constants.BUTTON_TAG),
            onClick = {
                buttonText = "Text changed!"
            })
        {
            Text(text = buttonText)
        }
    }
}