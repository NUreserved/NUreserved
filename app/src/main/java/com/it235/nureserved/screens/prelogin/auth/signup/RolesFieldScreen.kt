package com.it235.nureserved.screens.prelogin.auth.signup

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.preferences.AppPreferences
import com.it235.nureserved.preferences.ThemeOption
import com.it235.nureserved.screens.shared.SignUpText
import com.it235.nureserved.screens.shared.Space
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white5
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun RolesFieldScreen(
    navController: NavController,
){
    val appPreferences = AppPreferences(LocalContext.current)
    val themeOption by appPreferences.themeOption.collectAsState(initial = ThemeOption.SYSTEM)
    val scope = rememberCoroutineScope()

    NUreservedTheme(themeOption) {
        val snackbarHostState = remember { SnackbarHostState() }

        val roleOptions = listOf("Role", "Student", "Educator")

        val rolePreference: SharedPreferences = LocalContext.current.getSharedPreferences("signupPrefs", Context.MODE_PRIVATE)
        var role by rememberSaveable { mutableStateOf(rolePreference.getString("role", roleOptions[0])) }
        val isValidRole = rememberSaveable { mutableStateOf(rolePreference.getString("roleState", "false")) }
        var showRoleSupportTxt by remember { mutableStateOf(false) }

        val focusManager = LocalFocusManager.current

        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .pointerInput(Unit) {
                    detectTapGestures(onTap = {
                        focusManager.clearFocus()
                    })
                },
            snackbarHost = {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.BottomEnd
                ){
                    SnackbarHost(
                        hostState = snackbarHostState
                    ){data ->
                        Snackbar(
                            snackbarData = data,
                            containerColor = indicatorColorRed,
                            contentColor = white
                        )
                    }
                }
            }
        ){ innerPadding ->

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ){
                //background image
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painterResource(R.drawable.splash_background),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )

                //login
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Card(
                        modifier = Modifier
                            .fillMaxWidth(0.9f),
                        colors = CardDefaults.cardColors(
                            containerColor = white
                        )
                    ){

                        SignUpText(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 30.dp),
                            text = "Create an account",
                            fontSize = 24.sp,
                            TextAlign.Center,
                        )


                        Space("h", 30)

                        SignUpText(
                            modifier = Modifier
                                .padding(start = 20.dp),
                            text = "Which one describes you?",
                            fontSize = 18.sp,
                        )

                        Space("h", 15)
                        DropdownTextField(
                            options = roleOptions,
                            selectedOption = role,
                            showRoleSupportTxt,
                            isValidRole,
                            onOptionSelected = {
                                role = it
                                showRoleSupportTxt = true
                            },
                        )

                        Space("h", 10)

                        NextButton(
                            navController = navController,
                            scope = scope,
                            snackbarHostState = snackbarHostState,
                            isValid = isValidRole,
                            selectedRole = role,
                            rolePreference,
                        )

                    }
                }

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DropdownTextField(
    options: List<String>,
    selectedOption: String?,
    showSupportText: Boolean,
    isValid: MutableState<String?>,
    onOptionSelected: (String?) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {

        TextField(
            value = selectedOption ?: "",
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                Icon(
                    painter = if(!expanded) painterResource(R.drawable.baseline_arrow_drop_down_24) else painterResource(R.drawable.baseline_arrow_drop_up_24),
                    contentDescription = "Dropdown arrow",
                    tint = white3
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = white5,
                focusedContainerColor = white5,
                focusedTextColor = white3,
                unfocusedTextColor = white3,
                cursorColor = white3,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            supportingText = {
                if(showSupportText){
                    if(selectedOption == "Role"){
                        isValid.value = "false"
                        Text(
                            text = "Please select a role.",
                            color = indicatorColorRed
                        )
                    }
                    else {
                        isValid.value = "true"
                        Text( text = "" )
                    }
                }
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
        )

        ExposedDropdownMenu(
            modifier = Modifier
                .background(white5)
                .heightIn(max = 200.dp)
                .verticalScroll(rememberScrollState()),
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = selectionOption,
                            color = white3,
                        )
                    },
                    onClick = {
                        onOptionSelected(selectionOption)
                        expanded = false
                    }
                )
            }
        }
    }
}

@Composable
private fun NextButton(
    navController: NavController,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    isValid: MutableState<String?>,
    selectedRole: String?,
    rolePreference: SharedPreferences,
){
    val keyboardController = LocalSoftwareKeyboardController.current

    Button(
        onClick = {
            keyboardController?.hide()
            snackbarHostState.currentSnackbarData?.dismiss()

            if(isValid.value == "true"){
                if(selectedRole == "Student"){
                    rolePreference.edit().putString("role", selectedRole).apply()
                    rolePreference.edit().putString("roleState", "true").apply()
                    navController.navigate("${ScreenRoutes.ProgramStudentNumberSignUp.route}/${selectedRole}")
                }
                else{
                    rolePreference.edit().putString("role", selectedRole).apply()
                    rolePreference.edit().putString("roleState", "true").apply()
                    navController.navigate("${ScreenRoutes.SchoolSignUp.route}/${selectedRole}")
                }
            }
            else{
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "Make sure your inputs are valid.",
                        duration = SnackbarDuration.Short
                    )
                }
            }
        },
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, bottom = 30.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = brandColorBlue,
            contentColor = white3
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = "Next",
            style = LocalTextStyle.current.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}