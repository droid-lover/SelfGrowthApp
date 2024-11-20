package com.yuna.selfgrowthapp.presentation.commoncomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yuna.selfgrowthapp.presentation.theme.frauncesFamily
import com.yuna.selfgrowthapp.presentation.theme.staraFamily

@Composable
fun HeadingTextComponent(
    textSize: TextUnit = 24.sp,
    textValue: String,
    centerAligned: Boolean = false,
    textColor: Color = Color.Black

) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(8.dp),
        text = textValue,
        style = TextStyle(
            fontSize = textSize,
            fontFamily = frauncesFamily,
            fontWeight = FontWeight.Bold,
            color = textColor
        ),
        textAlign = if (centerAligned) TextAlign.Center else TextAlign.Start,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun NormalTextComponent(
    modifier: Modifier = Modifier,
    textValue: String, textColor: Color = Color.Black
) {
    Text(
        text = textValue,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontFamily = frauncesFamily,
            fontWeight = FontWeight.SemiBold,
        ),
        color = textColor,
        textAlign = TextAlign.Center
    )
}


@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    value: String,
    backgroundColor: Color = Color.Transparent,
    outlineColor: Color = Color.Transparent,
    onButtonClicked: () -> Unit,
    isEnabled: Boolean = false,
    textSize: TextUnit = 18.sp,
    icon: Int,
    iconTintColor: Color = Color.White,
    textColor: Color
) {
    val buttonModifier = modifier
        .heightIn(42.dp)
        .then(
            if (backgroundColor == Color.Transparent) {
                Modifier.border(1.dp, Color.White, RoundedCornerShape(40.dp))
            } else {
                Modifier
            }
        )

    Button(
        modifier = buttonModifier,
        onClick = {
            onButtonClicked.invoke()
        },
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(40.dp),
        enabled = isEnabled
    ) {
        Box(
            modifier = modifier
                .heightIn(42.dp)
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(40.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) { // Add Row
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = "Drawable description",
                    modifier = Modifier.size(16.dp),
                    tint = iconTintColor
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = value,
                    fontSize = textSize,
                    color = textColor,
                    fontWeight = FontWeight.Bold,
                    fontFamily = staraFamily
                )

            }
        }
    }
}