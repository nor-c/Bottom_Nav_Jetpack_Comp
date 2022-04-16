package com.example.bottom_nav_jetpack_comp.ui.topbar

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun TopBarColor(color: Color){
    val systemUiController = rememberSystemUiController()
    val darkTheme = isSystemInDarkTheme()
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = if(darkTheme) Color.Black else color
        )
    }
}
@Composable
fun NavBarColor(color: Color){
    val systemUiController = rememberSystemUiController()
    val darkTheme = isSystemInDarkTheme()
    SideEffect {
        systemUiController.setNavigationBarColor(
            color = if (darkTheme) Color.Black else color
        )
    }
}

