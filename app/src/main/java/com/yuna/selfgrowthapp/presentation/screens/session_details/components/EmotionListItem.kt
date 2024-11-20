package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yuna.selfgrowthapp.presentation.commoncomponents.NormalTextComponent
import com.yuna.selfgrowthapp.presentation.theme.bgColor

@Composable
fun EmotionListItem(name:String,value: String, color: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(
                bgColor,
                RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(16.dp)
                .background(color, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        NormalTextComponent(textValue = name)

        Spacer(modifier = Modifier.weight(1f))

        NormalTextComponent(textValue = "${value}%")
    }
}