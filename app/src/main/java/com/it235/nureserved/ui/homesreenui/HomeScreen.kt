package com.it235.nureserved.ui.homesreenui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Scale
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.NUreservedTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    // State variable to control the visibility of text
    var showText by remember { mutableStateOf(false) }
    // State variable to control the visibility of the date picker
    var showDatePicker by remember { mutableStateOf(false) }

    NUreservedTheme {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        Scaffold(
            topBar = {
                TopBar(scrollBehavior = scrollBehavior, onFilterClick = { showText = !showText })
            },

            bottomBar = {
                NavigationBar()
            }
        ){ innerPadding ->
            HomeScreenContent(
                innerPadding = innerPadding,
                navController = navController,
                showText = showText,
                onShowDatePickerChange = { showDatePicker = it }
            )
        }

        if (showDatePicker) {
            DatePickerModal(
                onDateSelected = { selectedDate ->
                    showDatePicker = false
                },
                onDismiss = { showDatePicker = false }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(scrollBehavior: TopAppBarScrollBehavior, onFilterClick: () -> Unit) {

    var showNotificationPopup by remember { mutableStateOf(false) }
    var showProfilePopup by remember { mutableStateOf(false) }

    TopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.size(32.dp),
            )
        },
        actions = {
            IconButton(onClick = onFilterClick) {
                Icon(
                    painter = painterResource(id = R.drawable.filter_alt),
                    contentDescription = "Filter icon to filter content based on chosen criteria"
                )
            };
            IconButton(onClick = { showNotificationPopup = !showNotificationPopup }) {
                Icon(
                    painter = painterResource(id = R.drawable.notifications),
                    contentDescription = "Notification icon about the status of reservation"
                )
                DropdownMenu(
                    expanded = showNotificationPopup,
                    onDismissRequest = { showNotificationPopup = false }
                ) {
                    Text(
                        text = "Notifications",
                        modifier = Modifier.padding(start = 16.dp, top = 8.dp, bottom = 8.dp),
                        style = TextStyle(
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    )
                    DropdownMenuItem(
                        text = {
                            Text(
                                buildAnnotatedString {
                                    append("Greetings! The room you reserved with tracking number #131256 is now ")
                                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                        append("Approved")
                                    }
                                }
                            )
                        },
                        onClick = { /* Handle notification click */ },
                        leadingIcon = {
                            Canvas(modifier = Modifier.size(16.dp)) {
                                drawCircle(color = Color(0xFF49844b))
                            }
                        }
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    DropdownMenuItem(
                        text = {
                            Text(
                                buildAnnotatedString {
                                    append("Greetings! Due to unforeseen circumstances, your reservation request with tracking number #54764 got ")
                                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                        append("Declined")
                                    }
                                }
                            )
                        },
                        onClick = { /* Handle notification click */ },
                        leadingIcon = {
                            Canvas(modifier = Modifier.size(16.dp)) {
                                drawCircle(color = Color(0xFFDB5E5F))
                            }
                        }
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                }
            };
            IconButton(onClick = { showProfilePopup = !showProfilePopup }) {
                Icon(
                    painter = painterResource(id = R.drawable.account_circle),
                    contentDescription = "Contains important settings"
                )
                DropdownMenu(
                    expanded = showProfilePopup,
                    onDismissRequest = { showProfilePopup = false}
                ) {
                    DropdownMenuItem(
                        text = { Text("Theme") },
                        onClick = { /* Handle settings click */ },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.dark_mode),
                                contentDescription = "Theme icon"
                            )
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Terms and Conditions") },
                        onClick = { /* Handle settings click */ },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.article),
                                contentDescription = "Terms and conditions icon"
                            )
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Logout") },
                        onClick = { /* Handle settings click */ },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.logout),
                                contentDescription = "Logout icon"
                            )
                        }
                    )
                }
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
fun HomeScreenContent(
    innerPadding: PaddingValues,
    navController: NavController,
    showText: Boolean,
    onShowDatePickerChange: (Boolean) -> Unit
) {
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

    Column(
        modifier = Modifier
            .padding(innerPadding)
    ) {
        if (showText) {
            ReservationDatePickerChip(onShowDatePickerChange)
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item { Spacer(modifier = Modifier.size(0.dp))}
            item { Floor("2nd Floor", secondFloorList, navController) }
            item { Floor("3rd Floor", thirdFloorList, navController) }
            item { Floor("4th Floor", fourthFloorList, navController) }
            item { Spacer(modifier = Modifier.size(0.dp))}
        }
    }
}

@Composable
private fun ReservationDatePickerChip(onShowDatePickerChange: (Boolean) -> Unit) {
    Column(
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp)
    ) {
        Text(
            text = "Show rooms available for reservation on",
            style = TextStyle(
                fontFamily = poppinsFamily,
                fontStyle = FontStyle.Italic,
                fontSize = 16.sp
            )
        )
        AssistChip(
            onClick = { onShowDatePickerChange(true) },
            label = { Text("Select date") },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.calendar_today),
                    contentDescription = "Calendar icon"
                )
            },
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerModal(
    onDateSelected: (Long?) -> Unit,
    onDismiss: () -> Unit
) {
    val datePickerState = rememberDatePickerState()

    DatePickerDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = {
                onDateSelected(datePickerState.selectedDateMillis)
                onDismiss()
            }) {
                Text("OK")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    ) {
        DatePicker(state = datePickerState)
    }
}

@Composable
fun Floor(floorName: String, floorList: List<Pair<String, String>>, navController: NavController) {
    Text(
        text = floorName,
        modifier = Modifier
            .padding(start = 16.dp),
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
            Card(roomNameAndStatus, navController)
        }
    }
}

@Composable
fun Card(roomNameAndStatus: Pair<String, String>, navController: NavController) {
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
            .clickable { navController.navigate(ScreenRoutes.RoomDetails.route) }
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