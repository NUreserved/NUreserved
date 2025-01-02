package com.it235.nureserved.ui.screens.homesreenui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import com.it235.nureserved.data.User
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.Space
import com.it235.nureserved.data.getUserData
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.textColor3
import com.it235.nureserved.ui.theme.textColor4

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    // State variable to control the selected item
    var selectedItem by rememberSaveable { mutableIntStateOf(0) }
    // State variable to control the visibility of text
    var showText by rememberSaveable { mutableStateOf(false) }
    // State variable to control the visibility of the date picker
    var showDatePicker by rememberSaveable { mutableStateOf(false) }
    // State variable to store the previous selected item
    var previousSelectedItem by rememberSaveable { mutableIntStateOf(0) }
    // State variable to control the visibility of logout confirmation dialog
    var showLogoutConfirmationDialog by remember { mutableStateOf(false) }
    // State variable to control the visibility of filter icon when the current
    // tab is in the home screen
    var showFilterButton by rememberSaveable { mutableStateOf(true) }

    BackHandler {
        if (selectedItem != 0) {
            selectedItem = previousSelectedItem
        } else {
            navController.popBackStack()
        }
    }

    NUreservedTheme {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        Scaffold(
            topBar = {
                TopBar(
                    scrollBehavior = scrollBehavior,
                    showLogoutConfirmationDialog = { showLogoutConfirmationDialog = true},
                )
            }
        ){ innerPadding ->
            // Handles the visibility of logout dialog
            if (showLogoutConfirmationDialog) {
                LogoutConfirmationDialog(
                    navController = navController,
                    showDialog = showLogoutConfirmationDialog,
                    onDismiss = { showLogoutConfirmationDialog = false },
                )
            }

            when (selectedItem) {
                0 -> {
                    showFilterButton = true

                    HomeScreenContent(
                        innerPadding = innerPadding,
                    )
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    scrollBehavior: TopAppBarScrollBehavior,
    showLogoutConfirmationDialog: () -> Unit, ) {

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
                    painter = painterResource(id = R.drawable.account_circle),
                    contentDescription = "Contains important settings"
                )
                DropdownMenu(
                    expanded = showProfilePopup,
                    onDismissRequest = { showProfilePopup = false}
                ) {
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
fun HomeScreenContent(
    innerPadding: PaddingValues,
) {
}

@Composable
private fun LogoutConfirmationDialog(
    navController: NavController,
    showDialog: Boolean,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Log out?") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.logout),
                contentDescription = "Question mark icon"
            )
        },
        text = {
            Text(
                text = "Are you sure you want to log out? You may need to log in again to access the features.",
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(
                onClick = {
                    FirebaseAuth.getInstance().signOut()
                    navController.navigate(ScreenRoutes.Login.route) {
                        popUpTo(ScreenRoutes.Home.route) { inclusive = true }
                    }
                }
            ) {
                Text("Confirm")
            }
        },
        dismissButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text("Cancel")
            }
        }
    )
}

@Preview(
    showBackground = true
)
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController)
}