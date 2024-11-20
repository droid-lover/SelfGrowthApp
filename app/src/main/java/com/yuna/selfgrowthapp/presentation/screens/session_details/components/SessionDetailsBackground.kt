package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.yuna.selfgrowthapp.R

@Composable
fun SessionDetailsBackground(){

    var sizeImage by remember { mutableStateOf(IntSize.Zero) }

    val gradient = Brush.verticalGradient(
        colors = listOf(Color.Transparent, Color.White),
        startY = sizeImage.height.toFloat()/4 ,
        endY = sizeImage.height.toFloat()
    )

    Box {
        Image(painter = painterResource(id = R.drawable.ic_session_image),
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .fillMaxSize()
                .onGloballyPositioned {
                    sizeImage = it.size
                })
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(gradient)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SessionDetailsBackgroundPreview(){
    SessionDetailsBackground()
}