package com.example.bottom_nav_jetpack_comp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottom_nav_jetpack_comp.ui.MainScreen
import com.example.bottom_nav_jetpack_comp.ui.theme.Bottom_Nav_Jetpack_CompTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bottom_Nav_Jetpack_CompTheme {
                MainScreen()
            }
        }
    }
}

