package com.it235.nureserved.screens.user

import AuthService.Companion.getUserData
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.screens.shared.RoomReservationFAB
import com.it235.nureserved.screens.shared.Space
import com.it235.nureserved.domain.auth.User
import com.it235.nureserved.domain.rooms_v2.FloorLocation
import com.it235.nureserved.domain.rooms_v2.RoomDataV2
import com.it235.nureserved.domain.rooms_v2.RoomV2
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.preferences.AppPreferences
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.screens.shared.LogoutConfirmationDialog
import com.it235.nureserved.screens.shared.ThemeSettingsDialog
import com.it235.nureserved.utils.rescalePicture
import com.it235.nureserved.screens.user.reservations.RoomReservationStatusScreen
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.textColor3
import com.it235.nureserved.ui.theme.textColor4
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    // State variable to control the selected item
    var selectedItem by rememberSaveable { mutableIntStateOf(0) }
    // State variable to control the visibility of the date picker
    var showDatePicker by rememberSaveable { mutableStateOf(false) }
    // State variable to store the previous selected item
    var previousSelectedItem by rememberSaveable { mutableIntStateOf(0) }
    // State variable to control the visibility of logout confirmation dialog
    var showLogoutConfirmationDialog by remember { mutableStateOf(false) }
    // State variable to control the visibility of theme settings dialog
    var showThemeSettingsDialog by remember { mutableStateOf(false) }
    // State variable to control the visibility of profile dialog
    var showProfileDialog by remember { mutableStateOf(false) }

    BackHandler {
        if (selectedItem != 0) {
            selectedItem = previousSelectedItem
        } else {
            navController.popBackStack()
        }
    }

    val appPreferences = AppPreferences(LocalContext.current)
    val themeOption by appPreferences.themeOption.collectAsState(initial = ThemeOption.SYSTEM)
    val coroutineScope = rememberCoroutineScope()

    NUreservedTheme(themeOption) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        Scaffold(
            topBar = {
                TopBar(
                    navController,
                    scrollBehavior = scrollBehavior,
                    showLogoutConfirmationDialog = { showLogoutConfirmationDialog = true},
                    showThemeSettingsDialog = { showThemeSettingsDialog = true},
                    showProfileDialog = { showProfileDialog = true}
                )
            },
            bottomBar = {
                NavigationBar(
                    navController,
                    selectedItem,
                    onItemSelected = {
                        previousSelectedItem = selectedItem
                        selectedItem = it
                })
            },
            floatingActionButton = { RoomReservationFAB(navController) }
        ){ innerPadding ->
            // Handles the visibility of logout dialog
            if (showLogoutConfirmationDialog) {
                LogoutConfirmationDialog(
                    navController = navController,
                    onDismiss = { showLogoutConfirmationDialog = false },
                    accountType = "user"
                )
            }

            if (showThemeSettingsDialog) {
                ThemeSettingsDialog(
                    onDismiss = { showThemeSettingsDialog = false },
                    currentTheme = themeOption,
                    onThemeChange = { newTheme ->
                        coroutineScope.launch {
                            appPreferences.saveThemeOption(newTheme)
                        }
                    },
                )
            }

            if (showProfileDialog) {
                ProfileDialog(
                    onDismiss = { showProfileDialog = false}
                )
            }

            when (selectedItem) {
                0 -> {
                    HomeScreenContent(
                        innerPadding = innerPadding,
                        navController = navController,
                        onShowDatePickerChange = { showDatePicker = it },
                        showDatePicker = showDatePicker
                    )
                }
                1 -> {
                    RoomReservationStatusScreen(navController, innerPadding)
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    navController: NavController,
    scrollBehavior: TopAppBarScrollBehavior,
    showLogoutConfirmationDialog: () -> Unit,
    showThemeSettingsDialog: () -> Unit,
    showProfileDialog: () -> Unit) {

    var showProfilePopup by remember { mutableStateOf(false) }

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
            IconButton(onClick = { showProfilePopup = !showProfilePopup }) {
                Icon(
                    painter = painterResource(id = R.drawable.more_vert),
                    contentDescription = "Contains important settings"
                )
                DropdownMenu(
                    expanded = showProfilePopup,
                    onDismissRequest = { showProfilePopup = false}
                ) {
                    DropdownMenuItem(
                        text = { Text("Profile") },
                        onClick = { showProfileDialog() },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.account_circle),
                                contentDescription = "Profile icon"
                            )
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Theme") },
                        onClick = { showThemeSettingsDialog() },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.dark_mode),
                                contentDescription = "Theme icon"
                            )
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Terms and Conditions") },
                        onClick = {
                            showProfilePopup = false;
                            navController.navigate(ScreenRoutes.TermsAndConditions.route) },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.article),
                                contentDescription = "Terms and conditions icon"
                            )
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("Logout") },
                        onClick = { showLogoutConfirmationDialog() },
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
fun NavigationBar(
    navController: NavController,
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    val items = listOf("Home", "Reservations")
    val selectedIcons = listOf(
        painterResource(id = R.drawable.home_24dp_e8eaed_fill1),
        painterResource(id = R.drawable.auto_stories_24dp_e8eaed_fill1)
    )
    val unselectedIcons =
        listOf(
            painterResource(id = R.drawable.home_24dp_e8eaed_fill0),
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
                onClick = { onItemSelected(index) }
            )
        }
    }
}

@Composable
fun HomeScreenContent(
    innerPadding: PaddingValues,
    navController: NavController,
    onShowDatePickerChange: (Boolean) -> Unit,
    showDatePicker: Boolean
) {
    if (showDatePicker) {
        DatePickerModal(
            onDateSelected = { selectedDate ->
                onShowDatePickerChange(false)
            },
            onDismiss = { onShowDatePickerChange(false) }
        )
    }

    Column(
        modifier = Modifier
            .padding(innerPadding)
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item { Spacer(modifier = Modifier.size(0.dp))}
            item { Floor(FloorLocation.SECOND_FLOOR, RoomDataV2.rooms, navController) }
            item { Floor(FloorLocation.THIRD_FLOOR, RoomDataV2.rooms, navController) }
            item { Floor(FloorLocation.FOURTH_FLOOR, RoomDataV2.rooms, navController) }
            item { Floor(FloorLocation.FIFTH_FLOOR, RoomDataV2.rooms, navController) }
            item { Spacer(modifier = Modifier.size(64.dp))}
        }
    }
}

@Composable
private fun ProfileDialog(
    onDismiss: () -> Unit
) {
    var user by remember { mutableStateOf<User?>(null) }
    var loading by remember { mutableStateOf(true) }

    getUserData { fetchedUser ->
        user = fetchedUser
        loading = false
    }

    Dialog(
        onDismissRequest = { onDismiss() }
    ) {
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
        ){
            Space("h", 16)
            HeadingComposable("Personal Information")
            Space("h", 8)

            if (loading) {
                IndeterminateCircularIndicator()
            } else {
                TextContentComposable(
                    field = "First Name",
                    value = user?.firstName ?: "N/A"
                )
                TextContentComposable(
                    field = "Middle Name",
                    value = user?.middleName ?: "N/A"
                )
                TextContentComposable(
                    field = "Last Name",
                    value = user?.lastName ?: "N/A"
                )
                TextContentComposable(
                    field = "Email",
                    value = user?.email ?: "N/A"
                )
                TextContentComposable(
                    field = "Program",
                    value = user?.program ?: "N/A"
                )
            }
            Space("h", 16)
        }
    }
}

@Composable
private fun HeadingComposable(
    value: String
) {
    Text(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp),
        text = value.uppercase(),
        style = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
        ),
    )
}

@Composable
private fun TextContentComposable(
    field: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(0.5f)
                .widthIn(max = 200.dp),
            color = if (isSystemInDarkTheme()) textColor4 else textColor3,
            text = field,
            style = LocalTextStyle.current.copy(
                fontSize = 13.sp,
                lineHeight = 16.sp
            ),
        )
        Text(
            modifier = Modifier
                .weight(0.5f)
                .padding(end = 16.dp),
            text = value,
            style = LocalTextStyle.current.copy(
                fontSize = 13.sp,
                lineHeight = 16.sp
            ),
        )
    }
}

@Composable
fun IndeterminateCircularIndicator(
) {
    CircularProgressIndicator(
        modifier = Modifier
            .padding(top = 8.dp, start = 16.dp)
            .width(32.dp),
        color = MaterialTheme.colorScheme.secondary,
        trackColor = MaterialTheme.colorScheme.surfaceVariant,
    )
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
fun Floor(
    floorName: FloorLocation,
    roomList: List<RoomV2>,
    navController: NavController
) {
    Text(
        text = floorName.value,
        modifier = Modifier
            .padding(start = 16.dp),
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp
        )
    )

    Space("h", 8)

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(roomList.filter { it.location == floorName }) { room ->
            Card(room, navController)
        }
    }
}

@Composable
fun Card(room: RoomV2, navController: NavController) {
    val imagePainter = rescalePicture(room.imageResId)

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF49844b), // Modify later to reflect color changes when there are no available reservations
        ),
        modifier = Modifier
            .width(240.dp)
            .clickable { navController.navigate("${ScreenRoutes.RoomDetails.route}/${room.id}/${true}") }
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
                text = room.name,
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