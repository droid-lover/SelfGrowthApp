package com.yuna.selfgrowthapp.presentation.screens.session_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.yuna.selfgrowthapp.presentation.commoncomponents.HeadingTextComponent
import com.yuna.selfgrowthapp.presentation.screens.session_details.components.HighlightsSection
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

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 18.dp, end = 18.dp),
                contentPadding = PaddingValues(top = 72.dp)
            ) {
                // TopAppBar
                item {
                    TopAppBar(
                        onBackClick = {},
                        onRightButtonClick1 = {},
                        onRightButtonClick2 = {}
                    )
                    Spacer(Modifier.size(24.dp))
                }

                // Heading
                item {
                    HeadingTextComponent(
                        textValue = sessionDetails?.sessionTitle ?: "",
                        textSize = 32.sp,
                        centerAligned = true,
                        textColor = Color.White
                    )
                    Spacer(Modifier.size(24.dp))
                }

                // Horizontal Buttons
                item {
                    HorizontalButtonsSection(
                        firstButtonTitle = "PAST SUMMARIES",
                        secondButtonTitle = "CONTINUE SESSION"
                    )
                    Spacer(Modifier.size(24.dp))
                }

                // Session Summary Image with title
                item {
                    SessionSummaryImageSection()
                    Spacer(Modifier.size(24.dp))
                }

                //Highlights section
                item {
                    sessionDetails?.pastSummaries?.get(0)?.also {
                        HighlightsSection(summary = it)
                    }
                }

            }
        }
    }
}


@Preview
@Composable
fun SessionDetailsScreenPreview() {
    SessionDetailsScreen()
}
