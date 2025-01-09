package com.it235.nureserved.ui.screens

import android.icu.util.Calendar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePicker
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
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
import com.it235.nureserved.composables.Space
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.darkGray
import com.it235.nureserved.ui.theme.textColor1
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white2
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

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
fun TimePicker(modifier: Modifier = Modifier, labelValue: String){
    var selectedTime by remember { mutableStateOf("00:00") }
    var showDialog by remember { mutableStateOf(false) }

    // Determines whether the time picker is dial or input
    var showDial by remember { mutableStateOf(true) }

    OutlinedTextField(
        modifier = modifier,
        value = selectedTime,
        onValueChange = { selectedTime = it },
        shape = RoundedCornerShape(10.dp),
        readOnly = true,
        label = {
            Text(
                text = labelValue
            )
        },
        textStyle = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
        ),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = LocalTextStyle.current.color,
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

    if(showDialog){        val currentTime = Calendar.getInstance()

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
                selectedTime = "${timePickerState.hour}:${timePickerState.minute}"
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
fun DatePickerTextField(modifier: Modifier = Modifier, labelValue: String = ""){
    var selectedDate by remember { mutableStateOf("") }
    var showModal by remember { mutableStateOf(false)}

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
        value = selectedDate ?: "",
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
        textStyle = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
        ),
        shape = RoundedCornerShape(10.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = LocalTextStyle.current.color,
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
                    selectedDate = formattedDate
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
    onRoomDeselected: (String) -> Unit
) {
    val isSelected = selectedRooms.contains(roomNumber)

    FilterChip(
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = LocalTextStyle.current.color
        ),
        onClick = {
            if (isSelected) {
                onRoomDeselected(roomNumber)
            } else {
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
fun OutlineTextFieldComposable(modifier: Modifier = Modifier, keyboardType: KeyboardType = KeyboardType.Text, labelValue: String = ""){
    var inputValue by remember { mutableStateOf("") }


    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth(),
        value = inputValue,
        singleLine = true,
        shape = RoundedCornerShape(10.dp),
        onValueChange = { inputValue = it },
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
            unfocusedBorderColor = LocalTextStyle.current.color,
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

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RoomReservationForm(
    navController: NavController
){
    var selectedRooms by remember { mutableStateOf(listOf<String>()) }
    val focusManager = LocalFocusManager.current

    Scaffold(
        modifier = Modifier
            .pointerInput(Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ){

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
                        InputFieldAndLabel(inputLabel = inputLabel, modifier = Modifier.height(5.dp))
                    }

                    if(index != inputLabels.lastIndex) {
                        Space("h", 20)

                        RowLayout(){
                            InputFieldAndLabel(inputLabel = "Date Filled:", modifier = Modifier.width(5.dp))
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
                                    InputFieldAndLabel(inputLabel = nameLabel, modifier = Modifier.width(0.dp), inputWidth = Modifier.weight(3f)){
                                        OutlineTextFieldComposable(modifier = Modifier.weight(6f))
                                    }
                                }

                            }
                        }

                        Space("h", 20)

                        RowLayout(){
                            InputFieldAndLabel(inputLabel = "Position:", modifier = Modifier.width(5.dp))
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
                            DatePickerTextField(labelValue = "From", modifier = Modifier.weight(1f))
                            Space("w", 10)
                            DatePickerTextField(labelValue = "To", modifier = Modifier.weight(1f))
                        },
                        {
                            TimePicker(labelValue = "From", modifier = Modifier.weight(1f))
                            Space("w", 10)
                            TimePicker(labelValue = "To", modifier = Modifier.weight(1f))
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
                    InputFieldAndLabel(inputLabel = "Expected # of Attendees:", modifier = Modifier.width(5.dp)){
                        OutlineTextFieldComposable(keyboardType = KeyboardType.Number)
                    }
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
                                onRoomDeselected = { selectedRooms = selectedRooms - it }
                            )
                        }
                    }
                }

                Space("h", 20)

                Column(){
                    InputFieldAndLabel(inputLabel = "Recommending Approval:", modifier = Modifier.height(5.dp)){
                        OutlineTextFieldComposable(labelValue = "Email of Immediate Head (Adviser/Coordinator/Supervisor)")
                    }
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
                        onClick = { navController.navigate(ScreenRoutes.RoomUsageRules.route) },
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

@Preview(showBackground = true, heightDp = 3000)
@Composable
fun RoomReservationFormPreview() {
    val navController = rememberNavController()
    RoomReservationForm(navController)
}