package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.yuna.selfgrowthapp.R
import com.yuna.selfgrowthapp.presentation.commoncomponents.CircularTextComponent
import com.yuna.selfgrowthapp.presentation.commoncomponents.SubHeadingTextComponent
import com.yuna.selfgrowthapp.presentation.theme.greenColor
import com.yuna.selfgrowthapp.presentation.theme.greenTextColor

@Composable
fun MultipleColorTextComponent(
    firstText:String,
    firstTextColor:Color,
    secondText:String,
    secondTextColor:Color
){
    Row(
        modifier = Modifier.wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        SubHeadingTextComponent(
            textValue = firstText,
            textColor = firstTextColor
        )
        SubHeadingTextComponent(
            textValue = secondText,
            textColor = secondTextColor
        )

        CircularTextComponent(
            modifier = Modifier
                .size(32.dp)
                .padding(2.dp),
            textValue = stringResource(R.string.i),
            textColor = greenColor,
            backgroundColor = greenTextColor
        )
    }
}