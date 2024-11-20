package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yuna.selfgrowthapp.R
import com.yuna.selfgrowthapp.presentation.commoncomponents.ButtonComponent
import com.yuna.selfgrowthapp.presentation.commoncomponents.NormalTextComponent

@Composable
fun SessionSummaryImageSection() {
    Box(
        modifier = Modifier.size(width = 361.dp, height = 320.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(24.dp))
                .border(4.dp, Color.White, RoundedCornerShape(24.dp)),
            painter = painterResource(id = R.drawable.ic_session_image),
            contentDescription = "Image description",
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            NormalTextComponent(
                modifier = Modifier.wrapContentSize(),
                textValue = "Keep shining; you're\n" +
                        "making remarkable\n progress!",
                textColor = Color.White
            )

            Spacer(modifier = Modifier.size(18.dp))

            ButtonComponent(
                modifier = Modifier
                    .wrapContentWidth()
                    .defaultMinSize(minWidth = 97.dp),
                value = "Share",
                onButtonClicked = {},
                textSize = 12.sp,
                icon = R.drawable.ic_share,
                iconTintColor = Color.White,
                backgroundColor = Color.Transparent,
                outlineColor = Color.White,
                textColor = Color.White
            )
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SessionSummaryImageSectionPreview() {
    SessionSummaryImageSection()
}