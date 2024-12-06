package com.it235.nureserved.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.it235.nureserved.R
import com.it235.nureserved.font.poppinsFamily

@Composable
fun RowHeader(textHeader: String = "ROOM RESERVATIONS", modifier: Modifier = Modifier.width(10.dp)){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF8F5F5))
            .padding(start = 20.dp, top = 15.dp, bottom = 15.dp, end = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Image(
            modifier = Modifier.
            width(60.dp),
            painter = painterResource(R.drawable.logo),
            contentDescription = "NUreserved logo",
        )

        Spacer(modifier = modifier)

        Text(
            text = textHeader,
            color = Color(0xFF0F0F0F),
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        )
    }
}