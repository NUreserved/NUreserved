package com.it235.nureserved.screens.core.authscreenui.signup

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.screens.core.AuthInputPlaceholderTextStyle
import com.it235.nureserved.screens.core.SignUpText
import com.it235.nureserved.screens.core.Space
import com.it235.nureserved.ui.theme.NUreservedTheme
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white3
import com.it235.nureserved.ui.theme.white5
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun ProgramStudentNumberSignUpScreen(
    navController: NavController,
    firstName: String,
    middleName: String,
    lastName: String
){
    NUreservedTheme {
        val scope = rememberCoroutineScope()
        val snackbarHostState = remember { SnackbarHostState() }

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

                        val options = listOf(
                            "Program",
                            "ABCOMM",
                            "BS Accountancy",
                            "BS Architecture",
                            "BSBA-FM",
                            "BSBA-MM",
                            "BSCpE",
                            "BSCE",
                            "BSHM",
                            "BSIT",
                            "BSPSY",
                            "BSTM",
                        )

                        var program by remember { mutableStateOf(options[0]) }
                        var showProgramSupportTxt by remember { mutableStateOf(false) }
                        var isValidProgram = remember { mutableStateOf(false) }

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
                            text = "What's your program?",
                            fontSize = 18.sp,
                        )

                        Space("h", 15)
                        DropdownTextField(
                            options = options,
                            selectedOption = program,
                            showProgramSupportTxt,
                            isValidProgram,
                            onOptionSelected = {
                                program = it
                                showProgramSupportTxt = true
                            },
                        )

                        Space("h", 5)

                        NextButton(
                            navController,
                            firstName,
                            middleName,
                            lastName,
                            program,
                            scope,
                            snackbarHostState,
                            isValidProgram,
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
    selectedOption: String,
    showSupportText: Boolean,
    isValid: MutableState<Boolean>,
    onOptionSelected: (String) -> Unit
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
            value = selectedOption,
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                Icon(
                    painter = if(!expanded) painterResource(R.drawable.baseline_arrow_drop_down_24) else painterResource(R.drawable.baseline_arrow_drop_up_24),
                    contentDescription = "Dropdown arrow",
                    tint = white3
                )
            },
            supportingText = {
                if(showSupportText){
                    if(selectedOption == "Program"){
                        isValid.value = false
                        Text(
                            text = "Please select a program.",
                            color = indicatorColorRed
                        )
                    }
                    else {
                        isValid.value = true
                        Text( text = "" )
                    }
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = white5,
                focusedTextColor = white3,
                unfocusedTextColor = white3,
                cursorColor = white3,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
        )

        ExposedDropdownMenu(
            modifier = Modifier
                .fillMaxWidth()
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
    firstName: String,
    middleName: String,
    lastName: String,
    program: String,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    isValidProgram: MutableState<Boolean>,
){
    val keyboardController = LocalSoftwareKeyboardController.current

    Button(
        onClick = {
            keyboardController?.hide()
            snackbarHostState.currentSnackbarData?.dismiss()

            if(isValidProgram.value){
                navController.navigate("${ScreenRoutes.NameSignUp.route}/${selectedRole}/${""}/${program}")
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