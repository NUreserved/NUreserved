package com.it235.nureserved

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.it235.nureserved.font.poppinsFamily


@Composable
fun Content(text: String){

    Spacer(modifier = Modifier.height(10.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 30.dp)
    ){

        Text(
            text = "•",
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = text,
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Normal
            ),
            textAlign = TextAlign.Justify
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header(
    title: String,
    onBackClick: () -> Unit,
    backgroundColor: Color = Color(0xfff8f5f5)
){

    TopAppBar(
        title = {
            Text(
                text = title,
                fontSize = 20.sp,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xff333333)
                )
        },
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back button",
                    tint = Color(0xff333333)
                )
            }
        },

        colors = topAppBarColors(
            containerColor = backgroundColor
        ),
        modifier = Modifier.fillMaxWidth()
    )

}




@Composable
fun AppTermsAndCondition(modifier: Modifier = Modifier){

    Scaffold(){ innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){
            Header(
                title = "Terms and Conditions",
                onBackClick = {},
                backgroundColor = Color(0xfff8f5f5)
            )

        }
    }


}