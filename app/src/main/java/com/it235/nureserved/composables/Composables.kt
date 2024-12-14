package com.it235.nureserved.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.it235.nureserved.R
import com.it235.nureserved.ui.theme.brandColorBlue

@Composable
fun RowHeader(textHeader: String = "ROOM RESERVATIONS", modifier: Modifier = Modifier.width(10.dp)){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(brandColorBlue)
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
            style = LocalTextStyle.current.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            ),
        )
    }
}

@Composable
fun Space(dimension: String, dimensionValue: Int){
    when(dimension){
        "h" -> Spacer(modifier = Modifier.height(dimensionValue.dp))
        "w" -> Spacer(modifier = Modifier.width(dimensionValue.dp))
    }
}