package com.it235.nureserved.screens.core

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.it235.nureserved.R

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.splash_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .size(240.dp)
        )
    }
}