package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.yuna.selfgrowthapp.R
import com.yuna.selfgrowthapp.presentation.commoncomponents.ButtonComponent

@Composable
fun HorizontalButtonsSection(firstButtonTitle: String, secondButtonTitle: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ButtonComponent(
            modifier = Modifier.weight(1f),
            value = firstButtonTitle,
            onButtonClicked = {},
            textSize = 12.sp,
            icon = R.drawable.ic_past_summaries,
            iconTintColor = Color.White,
            backgroundColor = Color.Transparent,
            outlineColor = Color.White,
            textColor = Color.White
        )

        Spacer(modifier = Modifier.weight(0.1f))

        ButtonComponent(
            modifier = Modifier.weight(1f),
            value = secondButtonTitle,
            onButtonClicked = {},
            textSize = 12.sp,
            icon = R.drawable.ic_continue_session,
            iconTintColor = Color.Black,
            backgroundColor = Color.White,
            outlineColor = Color.White,
            textColor = Color.Black
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HorizontalButtonsSectionPreview() {
    HorizontalButtonsSection("PAST SUMMARIES", "CONTINUE SESSION")
}