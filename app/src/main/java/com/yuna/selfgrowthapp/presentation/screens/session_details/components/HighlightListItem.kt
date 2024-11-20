package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuna.selfgrowthapp.R
import com.yuna.selfgrowthapp.presentation.commoncomponents.NormalTextComponent
import com.yuna.selfgrowthapp.presentation.theme.bgColor


@Composable
fun HighlightListItem(text: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(
                bgColor,
                RoundedCornerShape(8.dp)
            )
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_quote_icon),
            contentDescription = stringResource(R.string.quote_image),
            modifier = Modifier
                .wrapContentSize()
                .defaultMinSize(minHeight = 40.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        NormalTextComponent(
            textValue = text,
            fontWeight = FontWeight.SemiBold
        )
    }

}

@Preview
@Composable
fun HighlightItemPreview() {
    HighlightListItem(text = stringResource(R.string.item))
}