package com.it235.nureserved.ui.screens

import android.icu.util.Calendar
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePicker
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.RowHeader
import com.it235.nureserved.composables.Space
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.darkGray
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.white
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFieldAndLabel(
    inputWidth: Modifier = Modifier,
    inputLabel: String, modifier: Modifier,
    showErrorMessage: MutableState<Boolean> = remember { mutableStateOf(false) },
    errorMessage: MutableState<String> = remember { mutableStateOf("") },
    value: MutableState<String> = remember { mutableStateOf("") },
    colorValue: MutableState<Color> = remember { mutableStateOf(Color(0xFFBDBDBD)) },
    inputType: @Composable (() -> Unit)? = null,
){

    Text(
        modifier = inputWidth,
        text = inputLabel,
        style = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
        ),
    )

    Spacer(modifier = modifier)

    when{
        inputType == null && inputLabel == "Date Filled:" -> DatePickerTextField(value = value, showErrorMessage = showErrorMessage,
            colorValue = colorValue, errorMessage = errorMessage)
        inputType == null -> OutlineTextFieldComposable(value = value, colorValue = colorValue, errorMessage = errorMessage,
            showErrorMessage = showErrorMessage)
        else -> inputType()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickerDialog(
    onDismiss: () -> Unit,
    onConfirm: () -> Unit,
    content: @Composable () -> Unit
){
    AlertDialog(
        onDismissRequest = onDismiss,
        dismissButton = {
            TextButton(onClick = { onDismiss() }){
                Text("Dismiss")
            }
        },
        confirmButton = {
            TextButton(onClick = { onConfirm() }){
                Text("Ok")
            }
        },
        text = { content() }
    )
}

@Composable
fun AdvanceTimePickerDialog(
    title: String = "Select Time",
    onDismiss: () -> Unit,
    onConfirm: () -> Unit,
    toggle: @Composable () -> Unit = {},
    content: @Composable () -> Unit
){
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            shape = MaterialTheme.shapes.extraLarge,
            tonalElevation = 6.dp,
            modifier = Modifier
                .width(IntrinsicSize.Min)
                .height(IntrinsicSize.Min)
                .background(
                    shape = MaterialTheme.shapes.extraLarge,
                    color = MaterialTheme.colorScheme.surface
                )
        ){
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    text = title,
                    style = MaterialTheme.typography.labelMedium
                )
                content()
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth()
                ){
                    toggle()
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(onClick = onDismiss) { Text ( text = "Cancel") }
                    TextButton(onClick = onConfirm) { Text ( text = "Confirm") }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePicker(
    modifier: Modifier = Modifier,
    labelValue: String,
    showErrorMessage: MutableState<Boolean> = remember { mutableStateOf(false) },
    errorMessage: MutableState<String> = remember { mutableStateOf("") },
    colorValue: MutableState<Color> = remember { mutableStateOf(Color(0xFFBDBDBD)) },
    value: MutableState<String> = remember { mutableStateOf("") }
){
//    var selectedTime by remember { mutableStateOf("00:00") }
    var showDialog by remember { mutableStateOf(false) }

    // Determines whether the time picker is dial or input
    var showDial by remember { mutableStateOf(true) }

    @Composable
    fun CustomPlaceholder(text: String = "", showError: Boolean, errorText: String) {
        if (showError) {
            Text(
                text = errorText,
                color = Color.Red,
                fontSize = 13.sp
            ) // Display error message
        } else {
            Text(text = text) // Display normal placeholder
        }
    }

    OutlinedTextField(
        modifier = modifier,
        value = value.value,
        onValueChange = { value.value = it },
        shape = RoundedCornerShape(10.dp),
        readOnly = true,
        label = {
            Text(
                text = labelValue,
                fontSize = 13.sp,
            )
        },
        placeholder = {
            CustomPlaceholder(
                showError = showErrorMessage.value,
                errorText = errorMessage.value
            )
        },
        textStyle = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
        ),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = colorValue.value,
            focusedBorderColor = LocalTextStyle.current.color,
            focusedTextColor = LocalTextStyle.current.color,
            cursorColor = LocalTextStyle.current.color,
        ),
        trailingIcon = {
            IconButton(onClick = { showDialog = !showDialog}){
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = "Select time"
                )
            }
        }
    )

    if(showDialog){
        val currentTime = Calendar.getInstance()

        val timePickerState = rememberTimePickerState(
            initialHour =  currentTime.get(Calendar.HOUR_OF_DAY),
            initialMinute = currentTime.get(Calendar.MINUTE),
            is24Hour = true
        )

        val toggleIcon = if(showDial){
            Icons.Filled.DateRange
        } else{
            ImageVector.vectorResource(R.drawable.ic_access_time)
        }

        AdvanceTimePickerDialog(
            onDismiss = { showDialog = false },
            onConfirm = {
                value.value = "${timePickerState.hour}:${timePickerState.minute}"
                showDialog = false
            },
            toggle = {
                IconButton(onClick = { showDial = !showDial}){
                    Icon(
                        imageVector = toggleIcon,
                        contentDescription = null
                    )
                }
            },
        ) {
            if(showDial){
                TimePicker(
                    state = timePickerState
                )
            } else{
                TimeInput(
                    state = timePickerState
                )
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerTextField(
    modifier: Modifier = Modifier,
    labelValue: String = "",
    showErrorMessage: MutableState<Boolean> = remember { mutableStateOf(false) },
    errorMessage: MutableState<String> = remember { mutableStateOf("") },
    colorValue: MutableState<Color> = remember { mutableStateOf(Color(0xFFBDBDBD)) },
    value: MutableState<String> = remember { mutableStateOf("") }){
//    var selectedDate by remember { mutableStateOf("") }
    var showModal by remember { mutableStateOf(false)}

    @Composable
    fun CustomPlaceholder(text: String = "", showError: Boolean, errorText: String) {
        if (showError) {
            Text(
                text = errorText,
                color = Color.Red,
                fontSize = 13.sp
            ) // Display error message
        } else {
            Text(text = text) // Display normal placeholder
        }
    }

    @Composable
    fun DatePickerModal(
        onDateSelected: (Long?) -> Unit,
        onDismiss: () -> Unit,
    ){
        val datePickerState = rememberDatePickerState()

        DatePickerDialog(
            onDismissRequest = onDismiss,
            confirmButton = {
                TextButton(onClick = {
                    onDateSelected(
                        datePickerState.selectedDateMillis
                    )
                    onDismiss()
                }){
                    Text ( text = "Ok" )
                }
            },
            dismissButton = {
                TextButton(onClick = onDismiss){
                    Text( text = "Cancel")
                }
            }
        ) {
            DatePicker(state = datePickerState)
        }
    }

    OutlinedTextField(
        value = value.value ?: "",
        onValueChange = { },
        readOnly = true,
        label = {
          Text (
              text = labelValue,
              style = LocalTextStyle.current.copy(
                  fontSize = 13.sp,
                  fontWeight = FontWeight.Normal
              )
          )
        },
        placeholder = {
            CustomPlaceholder(
                showError = showErrorMessage.value,
                errorText = errorMessage.value
            )
        },
        textStyle = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
        ),
        shape = RoundedCornerShape(10.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = colorValue.value,
            focusedBorderColor = LocalTextStyle.current.color,
            focusedTextColor = LocalTextStyle.current.color,
            cursorColor = LocalTextStyle.current.color,
        ),
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "Select Date",
                modifier = Modifier.clickable{ showModal = !showModal}
            )
        },
        modifier = modifier.fillMaxWidth()
    )

    if(showModal){
        DatePickerModal(
            onDateSelected = {
                try {
                    val date = Date(it!!)
                    val formattedDate =
                        SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(date)
                    value.value = formattedDate
                    showModal = false
                }
                catch(e: Exception){
                    //add snackbar for error message
                }
            },
            onDismiss = { showModal = false}
        )
    }
}

@Composable
fun FilterChipComposable(
    roomNumber: String,
    selectedRooms: List<String>,
    onRoomSelected: (String) -> Unit,
    onRoomDeselected: (String) -> Unit,
){
    val isSelected = selectedRooms.contains(roomNumber)

    FilterChip(
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = LocalTextStyle.current.color
        ),
        onClick = {
            if(isSelected){
                onRoomDeselected(roomNumber)
            } else{
                onRoomSelected(roomNumber)
            }
        },
        label = {
            Text(text = roomNumber)
        },
        selected = isSelected,
        leadingIcon = if (isSelected) {
            {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Done Icon",
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else {
            null
        }
    )
}

@Composable
fun OutlineTextFieldComposable(modifier: Modifier = Modifier, keyboardType: KeyboardType = KeyboardType.Text, labelValue: String = "",
                               value: MutableState<String> = remember { mutableStateOf("") },
                               showErrorMessage: MutableState<Boolean> = remember { mutableStateOf(false) },
                               colorValue: MutableState<Color> = remember { mutableStateOf(Color(0xFF000000)) },
                               errorMessage: MutableState<String> = remember { mutableStateOf("")}){

    @Composable
    fun CustomPlaceholder(text: String = "", showError: Boolean, errorText: String) {
        if (showError) {
            Text(
                text = errorText,
                color = Color.Red,
                fontSize = 13.sp
            ) // Display error message
        } else {
            Text(text = text) // Display normal placeholder
        }
    }

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth(),
        value = value.value,
        singleLine = true,
        placeholder = {
            CustomPlaceholder(
                showError = showErrorMessage.value,
                errorText = errorMessage.value
            )
        },
        shape = RoundedCornerShape(10.dp),
        onValueChange = { value.value = it },
        label = {
            Text(
                text = labelValue,
                style = LocalTextStyle.current.copy(
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal,
                )
            )
        },
        textStyle = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
        ),
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = colorValue.value,
            focusedBorderColor = LocalTextStyle.current.color,
            focusedTextColor = LocalTextStyle.current.color,
            cursorColor = LocalTextStyle.current.color,
        )
    )
}

@Composable
fun RowLayout(modifier: Modifier = Modifier, content: @Composable () -> Unit){
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        content()
    }
}

fun setError(
    inputErrorMsg: MutableState<String>,
    showError: MutableState<Boolean>,
    borderColor: MutableState<Color>,
    errorMessage: String,
    isValidInput: MutableState<Boolean>,
){
    borderColor.value = Color(0xFFFF0000)
    showError.value = true
    inputErrorMsg.value = errorMessage
    isValidInput.value = false
}

fun setSuccess(
    inputErrorMsg: MutableState<String>,
    showError: MutableState<Boolean>,
    borderColor: MutableState<Color>,
    isValidInput: MutableState<Boolean>
){
    borderColor.value = Color(0xFF000000)
    showError.value = true
    inputErrorMsg.value = ""
    isValidInput.value = true
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RoomReservationForm(
    navController: NavController
){
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 100.dp),
                contentAlignment = Alignment.BottomEnd,
            ){
                SnackbarHost(
                    hostState = snackbarHostState,
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ){
            var selectedRooms by remember { mutableStateOf(listOf<String>()) }

            var showSuccessDialog = remember { mutableStateOf(false) }

            var nameOrgDeptClgValid = remember { mutableStateOf(false) }
            var dateFilledValid = remember { mutableStateOf(false) }
            var givenNameValid = remember { mutableStateOf(false) }
            var middleNameValid = remember { mutableStateOf(false) }
            var surnameValid = remember { mutableStateOf(false) }
            var positionValid = remember { mutableStateOf(false) }
            var titleOfActivityValid = remember { mutableStateOf(false) }
            var dateActivityFromValid = remember { mutableStateOf(false) }
            var dateActivityToValid = remember { mutableStateOf(false) }
            var timeActivityFromValid = remember { mutableStateOf(false) }
            var timeActivityToValid = remember { mutableStateOf(false) }
            var venueValid = remember { mutableStateOf(false) }
            var attendeesValid = remember { mutableStateOf(false) }
            var emailValid = remember { mutableStateOf(false) }

            var email = remember { mutableStateOf("") }
            var emailBorderColor = remember { mutableStateOf(Color(0xFF000000)) }
            var emailErrorMsg = remember { mutableStateOf("") }
            var emailShowError = remember { mutableStateOf(false) }

            var attendees = remember { mutableStateOf("") }
            var attendeesBorderColor = remember { mutableStateOf(Color(0xFF000000)) }
            var attendeesErrorMsg = remember { mutableStateOf("") }
            var attendeesShowError = remember { mutableStateOf(false) }

            var timeActivityFrom = remember { mutableStateOf("") }
            var timeActivityFromBorderColor = remember { mutableStateOf(Color(0xFF000000)) }
            var timeActivityFromErrorMsg = remember { mutableStateOf("") }
            var timeActivityFromShowError = remember { mutableStateOf(false) }

            var timeActivityTo = remember { mutableStateOf("") }
            var timeActivityToBorderColor = remember { mutableStateOf(Color(0xFF000000)) }
            var timeActivityToErrorMsg = remember { mutableStateOf("") }
            var timeActivityToShowError = remember { mutableStateOf(false) }

            var dateActivityFrom = remember { mutableStateOf("") }
            var dateActivityFromBorderColor = remember { mutableStateOf(Color(0xFF000000)) }
            var dateActivityFromErrorMsg = remember { mutableStateOf("") }
            var dateActivityFromShowError = remember { mutableStateOf(false) }

            var dateActivityTo = remember { mutableStateOf("") }
            var dateActivityToBorderColor = remember { mutableStateOf(Color(0xFF000000)) }
            var dateActivityToErrorMsg = remember { mutableStateOf("") }
            var dateActivityToShowError = remember { mutableStateOf(false) }

            var position = remember { mutableStateOf("") }
            var position_border_color = remember { mutableStateOf(Color(0xFF000000)) }
            var position_error_msg = remember { mutableStateOf("") }
            var position_show_error = remember { mutableStateOf(false) }

            var selected_date = remember { mutableStateOf("") }
            var selected_date_border_color = remember { mutableStateOf(Color(0xFF000000)) }
            var selected_date_error_msg = remember { mutableStateOf("") }
            var selected_date_show_error = remember { mutableStateOf(false) }

            var given_name = remember { mutableStateOf("") }
            var given_name_border_color = remember { mutableStateOf(Color(0xFF000000)) }
            var given_name_error_msg = remember { mutableStateOf("") }
            var given_name_show_error = remember { mutableStateOf(false) }

            var middle_name = remember { mutableStateOf("") }
            var middle_name_border_color = remember { mutableStateOf(Color(0xFF000000)) }
            var middle_name_error_msg = remember { mutableStateOf("") }
            var middle_name_show_error = remember { mutableStateOf(false) }

            var surname = remember { mutableStateOf("") }
            var surname_border_color = remember { mutableStateOf(Color(0xFF000000)) }
            var surname_error_msg = remember { mutableStateOf("") }
            var surname_show_error = remember { mutableStateOf(false) }

            var nameOrgDeptClg = remember { mutableStateOf("") }
            var name_org_border_color = remember { mutableStateOf(Color(0xFF000000)) }
            var name_org_error_msg = remember { mutableStateOf("") }
            var name_org_show_error = remember { mutableStateOf(false) }

            var titleOfActivity = remember { mutableStateOf("") }
            var title_act_border_color = remember { mutableStateOf(Color(0xFF000000)) }
            var title_act_error_msg = remember { mutableStateOf("") }
            var title_act_show_error = remember { mutableStateOf(false) }

            var name_state = listOf<MutableState<String>>(
                given_name,
                middle_name,
                surname,
            )

            var name_state_color = listOf<MutableState<Color>>(
                given_name_border_color,
                middle_name_border_color,
                surname_border_color,
            )

            var name_error_message = listOf<MutableState<String>>(
                given_name_error_msg,
                middle_name_error_msg,
                surname_error_msg,
            )

            var name_show_error = listOf<MutableState<Boolean>>(
                given_name_show_error,
                middle_name_show_error,
                surname_show_error,
            )

            var input_state = listOf<MutableState<String>>(
                nameOrgDeptClg,
                titleOfActivity
            )

            var input_state_color = listOf<MutableState<Color>>(
                name_org_border_color,
                title_act_border_color
            )

            var input_state_error_msg = listOf<MutableState<String>>(
                name_org_error_msg,
                title_act_error_msg
            )

            var input_state_show_error = listOf<MutableState<Boolean>>(
                name_org_show_error,
                title_act_show_error
            )

            if (showSuccessDialog.value) {
                SuccessAlertDialog(showSuccessDialog, navController)
            }

            RowHeader("ROOM RESERVATIONS FORM")

            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp)
            ){
                val inputLabels = listOf(
                    "Name of Organization/Department/College:",
                    "Title of the Activity:"
                );
                
                val nameLabels = listOf("Given Name", "Middle Name", "Surname");

                inputLabels.forEachIndexed{ index, inputLabel ->
                    Column(){
                        InputFieldAndLabel(
                            inputLabel = inputLabel,
                            modifier = Modifier.height(5.dp),
                            value = input_state[index],
                            colorValue = input_state_color[index],
                            errorMessage = input_state_error_msg[index],
                            showErrorMessage = input_state_show_error[index]
                        )
                    }

                    if(index != inputLabels.lastIndex) {
                        Space("h", 20)

                        RowLayout(){
                            InputFieldAndLabel(
                                inputLabel = "Date Filled:",
                                modifier = Modifier.width(5.dp),
                                value = selected_date,
                                colorValue = selected_date_border_color,
                                errorMessage = selected_date_error_msg,
                                showErrorMessage = selected_date_show_error
                            )
                        }

                        Space("h", 20)

                        Text(
                            text = "Requested by:",
                            style = LocalTextStyle.current.copy(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                            ),
                        )

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                        ){
                            nameLabels.forEachIndexed{index, nameLabel ->

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically
                                ){
                                    InputFieldAndLabel(
                                        inputLabel = nameLabel,
                                        modifier = Modifier.width(0.dp),
                                        inputWidth = Modifier.weight(3f)
                                    ){
                                        OutlineTextFieldComposable(
                                            modifier = Modifier.weight(6f),
                                            value = name_state[index],
                                            showErrorMessage = name_show_error[index],
                                            colorValue = name_state_color[index],
                                            errorMessage = name_error_message[index])
                                    }
                                }

                            }
                        }

                        Space("h", 20)

                        RowLayout(){
                            InputFieldAndLabel(
                                inputLabel = "Position:",
                                modifier = Modifier.width(5.dp),
                                showErrorMessage = position_show_error,
                                errorMessage = position_error_msg,
                                value = position,
                                colorValue = position_border_color
                            )
                        }

                        Space("h", 20)
                    }
                }

                Space("h", 20)

                Column (
                    modifier = Modifier
                        .fillMaxWidth(),
                ){

                    val dateAndTimePickers = listOf<@Composable () -> Unit>(
                        {
                            DatePickerTextField(
                                labelValue = "From",
                                modifier = Modifier.weight(1f),
                                value = dateActivityFrom,
                                showErrorMessage = dateActivityFromShowError,
                                colorValue = dateActivityFromBorderColor,
                                errorMessage = dateActivityFromErrorMsg
                            )
                            Space("w", 10)
                            DatePickerTextField(
                                labelValue = "To",
                                modifier = Modifier.weight(1f),
                                value = dateActivityTo,
                                showErrorMessage = dateActivityToShowError,
                                colorValue = dateActivityToBorderColor,
                                errorMessage = dateActivityToErrorMsg
                            )
                        },
                        {
                            TimePicker(
                                labelValue = "From",
                                modifier = Modifier.weight(1f),
                                value = timeActivityFrom,
                                showErrorMessage = timeActivityFromShowError,
                                colorValue = timeActivityFromBorderColor,
                                errorMessage = timeActivityFromErrorMsg
                            )
                            Space("w", 10)
                            TimePicker(
                                labelValue = "To",
                                modifier = Modifier.weight(1f),
                                value = timeActivityTo,
                                showErrorMessage = timeActivityToShowError,
                                colorValue = timeActivityToBorderColor,
                                errorMessage = timeActivityToErrorMsg
                            )
                        }
                    )

                    val dateAndTimePickersLabels = listOf<@Composable () -> Unit>(
                        {
                            Text(
                                text = "Date/s of the Activity:",
                                style = LocalTextStyle.current.copy(
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                ),
                            )
                        },
                        {
                            Text(
                                text = "Time of the Activity",
                                style = LocalTextStyle.current.copy(
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                ),
                            )
                        },
                    )


                    dateAndTimePickers.forEachIndexed{index, dateAndTimePicker ->
                        if (index == 1){
                            Space("h", 10)
                        }
                        dateAndTimePickersLabels[index]()
                        Space("h", 5)
                        Row(modifier = Modifier.fillMaxWidth()){
                            dateAndTimePicker()
                        }
                    }

                }

                Space("h", 20)

                RowLayout(){
//                    InputFieldAndLabel(inputLabel = "Expected # of Attendees:", modifier = Modifier.width(5.dp)){
//                        OutlineTextFieldComposable(keyboardType = KeyboardType.Number)
//                    }
                }

                Space("h", 20)

                HorizontalDivider(
                    color = Color(0xFFEEEEEE),
                    thickness = 2.dp,
                )

                Space("h", 20)

                Text(
                    text = "Venue:",
                    style = LocalTextStyle.current.copy(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                )

                Space("h", 10)

                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                ){

                    FlowRow(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                    ) {
                        val rooms = listOf("Room 202", "Room 205", "Room 259", "Room 316", "Room 317", "Room 215")
                        rooms.forEach { room ->
                            FilterChipComposable(
                                roomNumber = room,
                                selectedRooms = selectedRooms,
                                onRoomSelected = { selectedRooms = selectedRooms + it },
                                onRoomDeselected = { selectedRooms = selectedRooms - it },
                            )
                        }
                    }
                }

                Space("h", 20)

                Column(){
//                    InputFieldAndLabel(inputLabel = "Recommending Approval:", modifier = Modifier.height(5.dp)){
//                        OutlineTextFieldComposable(labelValue = "Email of your Adviser/Program Chair/Dean/Teacher")
//                    }
                }

                Space("h", 20)

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){

                    Button(
                        onClick = { navController.popBackStack() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = darkGray,
                            contentColor = white
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ){
                        Text(
                            text = "Back",
                            style = LocalTextStyle.current.copy(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }

                    Space("w", 10)

                    Button(
                        onClick = {
                            snackbarHostState.currentSnackbarData?.dismiss()

                            if(nameOrgDeptClg.value.isEmpty()){
                                setError(
                                    name_org_error_msg,
                                    name_org_show_error,
                                    name_org_border_color,
                                    "Please fill out this field",
                                    nameOrgDeptClgValid,
                                )
                            }

                            else{
                                setSuccess(
                                    name_org_error_msg,
                                    name_org_show_error,
                                    name_org_border_color,
                                    nameOrgDeptClgValid,
                                )
                            }

                            if(selected_date.value.isEmpty()){
                                setError(
                                    selected_date_error_msg,
                                    selected_date_show_error,
                                    selected_date_border_color,
                                    "Please fill out this field",
                                    dateFilledValid
                                )
                            }

                            else{
                                setSuccess(
                                    selected_date_error_msg,
                                    selected_date_show_error,
                                    selected_date_border_color,
                                    dateFilledValid
                                )
                            }

                            if(given_name.value.isEmpty()){
                                setError(
                                    given_name_error_msg,
                                    given_name_show_error,
                                    given_name_border_color,
                                    "Please fill out this field",
                                    givenNameValid
                                )
                            }

                            else{
                                setSuccess(
                                    given_name_error_msg,
                                    given_name_show_error,
                                    given_name_border_color,
                                    givenNameValid
                                )
                            }

                            if(middle_name.value.isEmpty()){
                                setError(
                                    middle_name_error_msg,
                                    middle_name_show_error,
                                    middle_name_border_color,
                                    "Please fill out this field",
                                    middleNameValid
                                )
                            }

                            else{
                                setSuccess(
                                    middle_name_error_msg,
                                    middle_name_show_error,
                                    middle_name_border_color,
                                    middleNameValid
                                )
                            }

                            if(surname.value.isEmpty()){
                                setError(
                                    surname_error_msg,
                                    surname_show_error,
                                    surname_border_color,
                                    "Please fill out this field",
                                    surnameValid
                                )
                            }

                            else{
                                setSuccess(
                                    surname_error_msg,
                                    surname_show_error,
                                    surname_border_color,
                                    surnameValid
                                )
                            }

                            if(position.value.isEmpty()){
                                setError(
                                    position_error_msg,
                                    position_show_error,
                                    position_border_color,
                                    "Please fill out this field",
                                    positionValid
                                )
                            }

                            else{
                                setSuccess(
                                    position_error_msg,
                                    position_show_error,
                                    position_border_color,
                                    positionValid
                                )
                            }

                            if(titleOfActivity.value.isEmpty()){
                                setError(
                                    title_act_error_msg,
                                    title_act_show_error,
                                    title_act_border_color,
                                    "Please fill out this field",
                                    titleOfActivityValid
                                )
                            }

                            else{
                                setSuccess(
                                    title_act_error_msg,
                                    title_act_show_error,
                                    title_act_border_color,
                                    titleOfActivityValid
                                )
                            }

                            if(dateActivityFrom.value.isEmpty()){
                                setError(
                                    dateActivityFromErrorMsg,
                                    dateActivityFromShowError,
                                    dateActivityFromBorderColor,
                                    "Empty Field",
                                    dateActivityFromValid
                                )
                            }

                            else{
                                setSuccess(
                                    dateActivityFromErrorMsg,
                                    dateActivityFromShowError,
                                    dateActivityFromBorderColor,
                                    dateActivityFromValid
                                )
                            }

                            if(dateActivityTo.value.isEmpty()){
                                setError(
                                    dateActivityToErrorMsg,
                                    dateActivityToShowError,
                                    dateActivityToBorderColor,
                                    "Empty Field",
                                    dateActivityToValid
                                )
                            }

                            else{
                                setSuccess(
                                    dateActivityToErrorMsg,
                                    dateActivityToShowError,
                                    dateActivityToBorderColor,
                                    dateActivityToValid
                                )
                            }

                            if(timeActivityFrom.value.isEmpty()){
                                setError(
                                    timeActivityFromErrorMsg,
                                    timeActivityFromShowError,
                                    timeActivityFromBorderColor,
                                    "Empty Field",
                                    timeActivityFromValid
                                )
                            }

                            else{
                                setSuccess(
                                    timeActivityFromErrorMsg,
                                    timeActivityFromShowError,
                                    timeActivityFromBorderColor,
                                    timeActivityFromValid
                                )
                            }

                            if(timeActivityTo.value.isEmpty()){
                                setError(
                                    timeActivityToErrorMsg,
                                    timeActivityToShowError,
                                    timeActivityToBorderColor,
                                    "Empty Field",
                                    timeActivityToValid
                                )
                            }

                            else{
                                setSuccess(
                                    timeActivityToErrorMsg,
                                    timeActivityToShowError,
                                    timeActivityToBorderColor,
                                    timeActivityToValid
                                )
                            }

                            if(!(nameOrgDeptClgValid.value && dateFilledValid.value && givenNameValid.value && middleNameValid.value &&
                                        surnameValid.value && positionValid.value && titleOfActivityValid.value &&
                                        dateActivityFromValid.value && dateActivityToValid.value && timeActivityFromValid.value && timeActivityToValid.value))
                            {
                                    scope.launch {
                                        snackbarHostState.showSnackbar(
                                            message = "Make sure your inputs are correct",
                                            duration = SnackbarDuration.Short
                                        )
                                    }
                            }

                            else if(selectedRooms.isEmpty()){
                                scope.launch {
                                    snackbarHostState.showSnackbar(
                                        message = "Choose at least 1 venue",
                                        duration = SnackbarDuration.Short
                                    )
                                }
                            }

                            else{
                                showSuccessDialog.value = true
                            }

                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF35408E),
                            contentColor = Color(0xFFFEFEFE)
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ){
                        Text(
                            text = "Next",
                            style = LocalTextStyle.current.copy(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }

                Space("h", 20)

            }

        }
    }
}

@Composable
fun SuccessAlertDialog(showSuccessDialog: MutableState<Boolean>, navController: NavController){
    AlertDialog(
        onDismissRequest = {
            showSuccessDialog.value = false
            navController.navigate(ScreenRoutes.RoomUsageRules.route)
                           },
        title = { Text("Congratulations!") },
        text = { Text("All input fields are valid") },
        confirmButton = {
            Button(onClick = {
                showSuccessDialog.value = false
                navController.navigate(ScreenRoutes.RoomUsageRules.route)
            }) {
                Text("OK")
            }
        },
        icon = {
            Icon(
                imageVector = Icons.Filled.CheckCircle,
                contentDescription = "Success"
            )
        }
    )
}

@Preview(showBackground = true, heightDp = 3000)
@Composable
fun RoomReservationFormPreview() {
    val navController = rememberNavController()
    RoomReservationForm(navController)
}