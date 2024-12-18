package com.nmb.feature1.presentation.screens.session_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nmb.feature1.R
import com.nmb.feature1.data.dto.PastSummary
import com.nmb.feature1.presentation.commoncomponents.NormalTextComponent
import com.nmb.feature1.presentation.commoncomponents.SubHeadingTextComponent

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

        MultipleColorTextComponent(
            firstText = stringResource(R.string.your),
            firstTextColor = Color.Black,
            secondText = stringResource(R.string.highlights),
            secondTextColor = Color.Green
        )


        SubHeadingTextComponent(
            textValue = stringResource(R.string.during_the_session),
            textColor = Color.Black
        )

        Spacer(Modifier.size(18.dp))

        NormalTextComponent(
            textValue = stringResource(R.string.let_s_take_a_closer_look_at_your_change_talk_from_our_conversation),
            textColor = Color.Black
        )

        Spacer(Modifier.size(18.dp))

        summary.highlights.forEach { item ->
            HighlightListItem(text = item)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HighlightsSectionPreview() {
//    HighlightsSection()
}