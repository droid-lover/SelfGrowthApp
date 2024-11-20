package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuna.selfgrowthapp.data.local.dto.PastSummary
import com.yuna.selfgrowthapp.presentation.commoncomponents.CircularTextComponent
import com.yuna.selfgrowthapp.presentation.commoncomponents.NormalTextComponent
import com.yuna.selfgrowthapp.presentation.commoncomponents.SubHeadingTextComponent
import com.yuna.selfgrowthapp.presentation.theme.greenColor
import com.yuna.selfgrowthapp.presentation.theme.greenTextColor
import com.yuna.selfgrowthapp.presentation.theme.normalTextColor70

@Composable
fun HighlightsSection(
    summary: PastSummary
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.size(18.dp))

        Row(
            modifier = Modifier.wrapContentSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            SubHeadingTextComponent(
                textValue = "Your ",
                textColor = Color.Black
            )
            SubHeadingTextComponent(
                textValue = "Highlights ",
                textColor = greenColor
            )

            CircularTextComponent(
                modifier = Modifier
                    .size(32.dp)
                    .padding(2.dp),
                textValue = "i",
                textColor = greenColor,
                backgroundColor = greenTextColor
            )
        }

        SubHeadingTextComponent(
            textValue = "During the Session",
            textColor = Color.Black
        )

        Spacer(Modifier.size(18.dp))

        NormalTextComponent(
            textValue = "Let’s take a closer look at your change\ntalk from our conversation:",
            textColor = normalTextColor70
        )

        Spacer(Modifier.size(18.dp))

        summary.highlights.forEach { item ->
            HighlightItem(text = item)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HighlightsSectionPreview() {
//    HighlightsSection()
}