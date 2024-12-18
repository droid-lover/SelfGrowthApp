package com.nmb.feature1.presentation.screens.session_details.components

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nmb.feature1.data.dto.Emotion
import com.nmb.logging.AppLogger
import ir.ehsannarmani.compose_charts.PieChart
import ir.ehsannarmani.compose_charts.models.Pie

@Composable
fun PieChartComponent(emotions: List<Emotion>) {
    var data = emotionsToPies(emotions)

    Column(
        modifier = Modifier
            .wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PieChart(
            modifier = Modifier.size(192.dp),
            data = data,
            onPieClick = {
                println("${it.label} Clicked")
                val pieIndex = data.indexOf(it)
                data =
                    data.mapIndexed { mapIndex, pie -> pie.copy(selected = pieIndex == mapIndex) }
            },
            selectedScale = 1.2f,
            scaleAnimEnterSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            ),
            colorAnimEnterSpec = tween(300),
            colorAnimExitSpec = tween(300),
            scaleAnimExitSpec = tween(300),
            spaceDegreeAnimExitSpec = tween(300),
            style = Pie.Style.Stroke(34.dp),
            spaceDegree = 7f,
            selectedPaddingDegree = 4f,
        )


        Spacer(Modifier.size(18.dp))

        data.forEach { item ->
            EmotionListItem(
                name = item.label ?: "",
                color = item.color,
                value = item.data.toString()
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

fun emotionsToPies(emotions: List<Emotion>): List<Pie> {
    val colors = listOf(
        Color(0xFFFF8400),
        Color(0xFF005CE7),
        Color(0xFF6A0090),
        Color(0xFF66BA24),
        Color(0xFFFFD770),
    )

    val selectedColors = listOf(
        Color.Green, Color.Blue, Color.Yellow, Color.Red, Color.Magenta
    )

    return emotions.mapIndexed { index, emotion ->
        AppLogger.d(message = "emotion: ${emotion.name} and value: ${emotion.value} and color: ${colors[index].value}")
        Pie(
            label = emotion.name,
            data = emotion.value,
            color = colors.getOrElse(index) { Color.Gray },
            selectedColor = selectedColors.getOrElse(index) { Color.DarkGray }
        )
    }
}