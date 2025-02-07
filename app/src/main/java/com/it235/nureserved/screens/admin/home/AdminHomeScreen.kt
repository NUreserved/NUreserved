package com.it235.nureserved.screens.admin.home

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.domain.rooms.FloorLocation
import com.it235.nureserved.preferences.AppPreferences
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.screens.admin.reservations.ReservationStatusScreen
import com.it235.nureserved.screens.admin.reservations.ReservationsHistoryScreen
import com.it235.nureserved.screens.core.LogoutConfirmationDialog
import com.it235.nureserved.screens.core.ThemeSettingsDialog
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.primaryLight
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminHomeScreen(
    navController: NavController,
    viewModel: AdminHomeViewModel
) {
    val appPreferences = AppPreferences(LocalContext.current)
    val themeOption by appPreferences.themeOption.collectAsState(initial = ThemeOption.SYSTEM)
    val coroutineScope = rememberCoroutineScope()

    val selectedItem by viewModel.selectedItem.collectAsState()
    val showThemeSettingsDialog by viewModel.showThemeSettingsDialog.collectAsState()
    val showLogoutConfirmationDialog by viewModel.showLogoutConfirmationDialog.collectAsState()

    BackHandler {
        if (viewModel.isIndexStackAtDefault()) {
            navController.popBackStack()
        } else {
            viewModel.updateIndexStack()
        }
    }

    NUreservedTheme(themeOption) {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        Scaffold (
            topBar = {
                TopBar(
                    scrollBehavior = scrollBehavior,
                    showThemeSettingsDialog = { viewModel.toggleThemeSettingsDialog() },
                    showLogoutConfirmationDialog = { viewModel.toggleLogoutConfirmationDialog() },
                )
            },
            bottomBar = {
                NavigationBar(
                    selectedItem,
                    onItemSelected = { viewModel.onItemSelected(it) }
                )
            },

        ){ innerPadding ->
            if (showThemeSettingsDialog) {
                ThemeSettingsDialog(
                    onDismiss = { viewModel.toggleThemeSettingsDialog() },
                    currentTheme = themeOption,
                    onThemeChange = { newTheme ->
                        coroutineScope.launch {
                            appPreferences.saveThemeOption(newTheme)
                        }
                    },
                )
            }

            if (showLogoutConfirmationDialog) {
                LogoutConfirmationDialog(
                    navController = navController,
                    onDismiss = { viewModel.toggleLogoutConfirmationDialog() },
                    accountType = viewModel.accountType,
                )
            }

            when (selectedItem) {
                0 -> { HomeScreenContent(innerPadding = innerPadding, navController) }
                1 -> { ReservationStatusScreen(innerPadding = innerPadding) }
                2 -> { ReservationsHistoryScreen(innerPadding = innerPadding) }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar(
    scrollBehavior: TopAppBarScrollBehavior,
    showThemeSettingsDialog: () -> Unit,
    showLogoutConfirmationDialog: () -> Unit
) {
    var showSettingsPopup by remember { mutableStateOf(false) }
    
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
            IconButton(onClick = { showSettingsPopup = !showSettingsPopup }) {
                Icon(
                    painter = painterResource(id = R.drawable.more_vert),
                    contentDescription = "Contains important settings"
                )
                DropdownMenu(
                    expanded = showSettingsPopup,
                    onDismissRequest = { showSettingsPopup = false}
                ) {
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
private fun NavigationBar(
    selectedItem: Int,
    onItemSelected: (Int) -> Unit
) {
    val items = listOf("Home", "Reservations", "History")
    val selectedIcons = listOf(
        painterResource(id = R.drawable.home_24dp_e8eaed_fill1),
        painterResource(id = R.drawable.auto_stories_24dp_e8eaed_fill1),
        painterResource(id = R.drawable.history_24dp_e8eaed_fill0_wght400_grad0_opsz24)
    )
    val unselectedIcons = listOf(
        painterResource(id = R.drawable.home_24dp_e8eaed_fill0),
        painterResource(id = R.drawable.auto_stories_24dp_e8eaed_fill0),
        painterResource(id = R.drawable.history_24dp_e8eaed_fill0_wght400_grad0_opsz24)
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
private fun HomeScreenContent(
    innerPadding: PaddingValues,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
    ) {
        LazyColumn (
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item { Spacer(modifier = Modifier.size(0.dp)) }
            item { FloorCard(FloorLocation.SECOND_FLOOR, 4, navController) }
            item { FloorCard(FloorLocation.THIRD_FLOOR, 2, navController) }
            item { FloorCard(FloorLocation.FOURTH_FLOOR, 5, navController) }
            item { FloorCard(FloorLocation.FIFTH_FLOOR, 0, navController) }
            item { Spacer(modifier = Modifier.size(0.dp)) }
        }
    }
}

@Composable
private fun ReservationsScreenContent(
    innerPadding: PaddingValues
) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
    ) {
        // TODO: Add content to the ReservationsScreenContent function
    }
}

@Composable
private fun FloorCard(
    floorName: FloorLocation,
    numberOfReservations: Int,
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable {
                navController.navigate("${ScreenRoutes.FloorRooms.route}/${floorName}")
            }
    ) {
        BackgroundImage()

        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Text(
                text = floorName.value.split(" ")[0],
                fontSize = 36.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = floorName.value.split(" ")[1],
                fontSize = 18.sp,
                color = Color(0xFFFFC107) // Yellow color
            )
        }

        // Pending Reservations
        Text(
            text = if (numberOfReservations > 1) {
                "Pending Reservations: $numberOfReservations"
            } else {
                "No Pending Reservations"
            },
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xAA000000)) // Semi-transparent background
                .padding(horizontal = 8.dp, vertical = 4.dp)
        )

    }
}

@Composable
private fun BackgroundImage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.room_420), // Replace with your image resource
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(if (isSystemInDarkTheme()) primaryLight.copy(alpha = 0.6f) else brandColorBlue.copy(alpha = 0.6f)) // Semi-transparent black overlay
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun Default() {
    AdminHomeScreen(
            navController = rememberNavController(),
            viewModel = AdminHomeViewModel()
    )
}

@Preview(
    showBackground = true,
    widthDp = 480
)
@Composable
fun Preview480() {
    AdminHomeScreen(
        navController = rememberNavController(),
        viewModel = AdminHomeViewModel()
    )
}

@Preview(
    showBackground = true,
    widthDp = 550
)
@Composable
fun Preview550() {
    AdminHomeScreen(
        navController = rememberNavController(),
        viewModel = AdminHomeViewModel()
    )
}

@Preview(
    showBackground = true,
    widthDp = 720
)
@Composable
fun Preview720() {
    AdminHomeScreen(
        navController = rememberNavController(),
        viewModel = AdminHomeViewModel()
    )
}