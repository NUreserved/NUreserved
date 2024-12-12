package com.it235.nureserved.ui.screens.homesreenui.roomdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoomDetails(navController: NavController) {
    NUreservedTheme {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())


        Scaffold (
            topBar = {
                RDTopBar(scrollBehavior, navController)
            }
        ) { innerPadding ->
            RoomDetailsContent(innerPadding)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RDTopBar(scrollBehavior: TopAppBarScrollBehavior, navController: NavController) {
    TopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow_back),
                    contentDescription = "Back",
                )
            }
        },
        title = {
            Text(
                text = "Room Details",
                fontFamily = poppinsFamily,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
        },
        scrollBehavior = scrollBehavior,
    )
}


@Composable
fun RoomDetailsContent(innerPaddingValues: PaddingValues) {
    Column(
        modifier = Modifier.padding(innerPaddingValues)
    ) {
        RoomImage()
        Spacer(modifier = Modifier.size(16.dp))
        RoomDetails()
    }
}

@Composable
private fun RoomImage() {
    Image(
        painter = painterResource(id = R.drawable.sample_lab_room),
        contentDescription = "Room Image",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}

@Composable
private fun RoomDetails() {
    Text(
        text = "Room 312",
        fontFamily = poppinsFamily,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        ),
        modifier = Modifier.padding(start = 32.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.location_on),
            contentDescription = "Location Icon",
            modifier = Modifier.size(16.dp),
            colorFilter = ColorFilter.tint(
                if (isSystemInDarkTheme()) Color(0xFFFEFEFE) else Color(
                    0xFF333333
                )
            )
        )
        Text(
            text = "3rd Floor",
            fontFamily = poppinsFamily,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            ),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.meeting_room),
            contentDescription = "Classroom Icon",
            modifier = Modifier.size(16.dp),
            colorFilter = ColorFilter.tint(
                if (isSystemInDarkTheme()) Color(0xFFFEFEFE) else Color(
                    0xFF333333
                )
            )
        )
        Text(
            text = "Classroom",
            fontFamily = poppinsFamily,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            ),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview (showBackground = true)
@Composable
fun RoomDetailsPreview() {
    val navController = rememberNavController()
    RoomDetails(navController)
}