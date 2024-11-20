package com.yuna.selfgrowthapp.presentation.screens.session_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuna.selfgrowthapp.R

@Composable
fun TopAppBar(
    onBackClick: () -> Unit,
    onRightButtonClick1: () -> Unit,
    onRightButtonClick2: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onBackClick) {
            Icon(
                painterResource(R.drawable.ic_back),
                contentDescription = stringResource(R.string.back),
                modifier = Modifier.size(40.dp),
                tint = Color.White
            )
        }

        Row {
            IconButton(
                onClick = onRightButtonClick1,
            ) {
                Icon(
                    painterResource(R.drawable.ic_chat),
                    contentDescription = stringResource(R.string.button_1),
                    modifier = Modifier.size(40.dp),
                    tint = Color.White
                )
            }
            Spacer(Modifier.size(8.dp))
            IconButton(onClick = onRightButtonClick2) {
                Icon(
                    painterResource(R.drawable.ic_dots),
                    contentDescription = stringResource(R.string.button_2),
                    modifier = Modifier.size(40.dp),
                    tint = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomToolbarPreview() {
    TopAppBar(
        onBackClick = { /* Do nothing in preview */ },
        onRightButtonClick1 = { /* Do nothing in preview */ },
        onRightButtonClick2 = { /* Do nothing in preview */ }
    )
}