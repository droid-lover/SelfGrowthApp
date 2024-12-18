package com.nmb.feature1.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nmb.feature1.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

)

val frauncesFamily = FontFamily(
    Font(R.font.fraunces_9pt_soft_bold, FontWeight.Bold),
    Font(R.font.fraunces_9pt_soft_semibold, FontWeight.SemiBold),
)

val staraFamily = FontFamily(
    Font(R.font.stara_bold, FontWeight.Bold),
    Font(R.font.stara_semibold, FontWeight.SemiBold),
    Font(R.font.stara_medium, FontWeight.Normal)
)
