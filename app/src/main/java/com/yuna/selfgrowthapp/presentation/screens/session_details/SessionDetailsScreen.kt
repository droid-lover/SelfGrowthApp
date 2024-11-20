package com.yuna.selfgrowthapp.presentation.screens.session_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.yuna.selfgrowthapp.presentation.commoncomponents.HeadingTextComponent
import com.yuna.selfgrowthapp.presentation.screens.session_details.components.HorizontalButtonsSection
import com.yuna.selfgrowthapp.presentation.screens.session_details.components.SessionDetailsBackground
import com.yuna.selfgrowthapp.presentation.screens.session_details.components.SessionSummaryImageSection
import com.yuna.selfgrowthapp.presentation.screens.session_details.components.TopAppBar

@Composable
fun SessionDetailsScreen(
    viewModel: SessionDetailsViewModel = hiltViewModel()
) {
    val sessionDetails = viewModel.state.value.sessionDetails

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
        ) {
            SessionDetailsBackground()

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(start = 18.dp, end = 18.dp)

            ) {

                Spacer(Modifier.size(72.dp))

                TopAppBar(
                    onBackClick = {},
                    onRightButtonClick1 = {},
                    onRightButtonClick2 = {}
                )

                Spacer(Modifier.size(24.dp))

                HeadingTextComponent(
                    textValue = sessionDetails?.sessionTitle ?: "",
                    textSize = 32.sp,
                    centerAligned = true,
                    textColor = Color.White
                )

                Spacer(Modifier.size(24.dp))

                HorizontalButtonsSection(
                    firstButtonTitle = "PAST SUMMARIES",
                    secondButtonTitle = "CONTINUE SESSION"
                )

                Spacer(Modifier.size(24.dp))

                SessionSummaryImageSection()
            }
        }

    }
}


@Preview
@Composable
fun SessionDetailsScreenPreview() {
    SessionDetailsScreen()
}
