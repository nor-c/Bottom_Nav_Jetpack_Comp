package com.example.bottom_nav_jetpack_comp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottom_nav_jetpack_comp.ui.topbar.NavBarColor
import com.example.bottom_nav_jetpack_comp.ui.topbar.TopBarColor

@Composable
fun ProfileScreen() {
    val topBarColor: Color = Color.DarkGray
    val navBarColor: Color = MaterialTheme.colors.primary

    TopBarColor(color = topBarColor)
    NavBarColor(color = navBarColor)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(topBarColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Profile Screen",
            fontSize = MaterialTheme.typography.h2.fontSize,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            color = Color.White
        )
    }
}

@Composable
@Preview
fun ProfileScreenPreview() {
    ProfileScreen()
}