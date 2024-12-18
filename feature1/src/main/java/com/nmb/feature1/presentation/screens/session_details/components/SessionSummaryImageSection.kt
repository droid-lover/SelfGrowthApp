package com.nmb.feature1.presentation.screens.session_details.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nmb.feature1.R
import com.nmb.feature1.data.dto.PastSummary
import com.nmb.feature1.presentation.commoncomponents.ButtonComponent
import com.nmb.feature1.presentation.commoncomponents.SubHeadingTextComponent


@Composable
fun SessionSummaryImageSection(summary: PastSummary?) {

        Box(
            modifier = Modifier.fillMaxWidth().height( height = 320.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()

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

                SubHeadingTextComponent(
                    modifier = Modifier.wrapContentSize(),
                    textValue = summary?.quote ?: "",
                    textColor = Color.White
                )

                Spacer(modifier = Modifier.size(18.dp))

                ButtonComponent(
                    modifier = Modifier
                        .wrapContentWidth()
                        .defaultMinSize(minWidth = 97.dp),
                    value = "share",
                    onButtonClicked = {},
                    textSize = 12.sp,
                    icon = R.drawable.ic_share,
                    iconTintColor = Color.White,
                    backgroundColor = Color.Transparent,
                    textColor = Color.White
                )
            }

        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SessionSummaryImageSectionPreview() {
//    SessionSummaryImageSection()
}