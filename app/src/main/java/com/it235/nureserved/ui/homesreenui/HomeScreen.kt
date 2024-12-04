package com.it235.nureserved.ui.homesreenui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.size.Scale
import com.it235.nureserved.R
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    NUreservedTheme {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        Scaffold(
            topBar = {
                TopBar(scrollBehavior)
            },

            bottomBar = {
                NavigationBar()
            }
        ){ innerPadding ->
            HomeScreenContent(innerPadding)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(scrollBehavior: TopAppBarScrollBehavior) {

    TopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "App logo",
                modifier = Modifier.size(32.dp),
            )
        },
        actions = {
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.filter_alt),
                    contentDescription = "Filters content based on chosen criteria"
                )
            };
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.notifications),
                    contentDescription = "Notifications about the status of reservation"
                )
            };
            IconButton(onClick = { /* do something */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.account_circle),
                    contentDescription = "Contains important settings"
                )
            }
        },
        scrollBehavior = scrollBehavior,
    )
}

@Composable
fun NavigationBar() {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home", "Reserve", "Reservations")
    val selectedIcons = listOf(
        painterResource(id = R.drawable.home_24dp_e8eaed_fill1),
        painterResource(id = R.drawable.edit_24dp_e8eaed_fill1),
        painterResource(id = R.drawable.auto_stories_24dp_e8eaed_fill1)
    )
    val unselectedIcons =
        listOf(
            painterResource(id = R.drawable.home_24dp_e8eaed_fill0),
            painterResource(id = R.drawable.edit_24dp_e8eaed_fill0),
            painterResource(id = R.drawable.auto_stories_24dp_e8eaed_fill0)
        )

    androidx.compose.material3.NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}

@Composable
fun HomeScreenContent(innerPadding: PaddingValues) {
    val secondFloorList = listOf(
        "Room 201" to "Available",
        "Room 202" to "Unavailable",
        "Room 203" to "Available",
    )

    val thirdFloorList = listOf(
        "Room 301" to "Unavailable",
        "Room 302" to "Available",
        "Room 303" to "Unavailable",
    )

    val fourthFloorList = listOf(
        "Room 401" to "Available",
        "Room 402" to "Available",
        "Room 403" to "Unavailable",
    )

    LazyColumn(
        modifier = Modifier
            .padding(innerPadding), // Adjust padding here
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        item { Floor("2nd Floor", secondFloorList) }
        item { Floor("3rd Floor", thirdFloorList) }
        item { Floor("4th Floor", fourthFloorList) }
    }
}

@Composable
fun Floor(floorName: String, floorList: List<Pair<String, String>>) {
    Text(
        text = floorName,
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp, bottom = 8.dp),
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp
        )
    )

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(floorList) { roomNameAndStatus ->
            Card(roomNameAndStatus)
        }
    }
}

@Composable
fun Card(roomNameAndStatus: Pair<String, String>) {
    val imagePainter = // Set the size to match the modifier dimensions
        rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current).data(data = R.drawable.sample_lab_room)
                .apply(block = fun ImageRequest.Builder.() {
                    size(240, 120) // Set the size to match the modifier dimensions
                    scale(Scale.FILL)
                }).build()
        )


    Card(
        colors = CardDefaults.cardColors(
            containerColor = if (roomNameAndStatus.second == "Unavailable") Color(0xFFdb5e5f) else Color(0xFF49844b),
        ),
        modifier = Modifier
            .width(240.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp),
                contentScale = ContentScale.Crop // Scales the image to fill the entire content area
            )
            Text(
                text = roomNameAndStatus.first,
                modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp, start = 24.dp, end = 24.dp),
                color = Color(0xFFFEFEFE),
                style = TextStyle(
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Medium,
                )
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController)
}