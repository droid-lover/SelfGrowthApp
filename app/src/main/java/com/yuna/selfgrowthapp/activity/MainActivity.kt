package com.yuna.selfgrowthapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.yuna.selfgrowthapp.ui.navigation.AppNavigationGraph
import com.nmb.feature1.presentation.theme.SelfGrowthAppTheme
import com.nmb.practice.FirstActivity
import com.nmb.practice.SecondActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            SelfGrowthAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.LightGray)
                ) {
//                    SelfGrowthApp()
                    startActivity(Intent(this, FirstActivity::class.java))
                }
            }
        }
    }
}

@Composable
fun SelfGrowthApp() {
//    AppNavigationGraph()
}

