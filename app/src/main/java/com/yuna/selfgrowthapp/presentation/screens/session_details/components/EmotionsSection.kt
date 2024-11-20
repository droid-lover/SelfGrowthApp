package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuna.selfgrowthapp.data.local.dto.Emotion
import com.yuna.selfgrowthapp.presentation.commoncomponents.SubHeadingTextComponent
import com.yuna.selfgrowthapp.presentation.theme.greenColor

@Composable
fun EmotionsSection(emotions: List<Emotion>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(Modifier.size(18.dp))

        MultipleColorTextComponent(
            firstText = "Your Main ",
            firstTextColor = Color.Black,
            secondText = "Emotions ",
            secondTextColor = greenColor
        )

        SubHeadingTextComponent(
            textValue = "During this Session",
            textColor = Color.Black
        )

        Spacer(Modifier.size(18.dp))

        PieChartComponent(emotions)

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EmotionsSectionPreview() {
//    EmotionsSection()
}