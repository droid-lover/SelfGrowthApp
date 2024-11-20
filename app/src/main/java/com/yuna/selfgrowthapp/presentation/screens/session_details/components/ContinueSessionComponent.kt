package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yuna.selfgrowthapp.R
import com.yuna.selfgrowthapp.presentation.commoncomponents.ButtonComponent
import com.yuna.selfgrowthapp.presentation.theme.darkGreen

@Composable
fun ContinueSessionComponent() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        ButtonComponent(
            modifier = Modifier.wrapContentWidth(),
            value = stringResource(R.string.continue_session),
            onButtonClicked = {},
            textSize = 14.sp,
            backgroundColor = darkGreen,
            textColor = Color.White,
            padding = PaddingValues(horizontal = 34.dp, vertical = 18.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ContinueSessionComponentPreview() {
    ContinueSessionComponent()
}