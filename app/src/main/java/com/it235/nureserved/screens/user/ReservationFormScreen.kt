package com.it235.nureserved.screens.user

import User
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.material3.AlertDialog
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
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.Space
import com.it235.nureserved.data.rooms.FloorLocation
import com.it235.nureserved.data.rooms.roomList
import com.it235.nureserved.font.poppinsFamily
import com.it235.nureserved.ui.theme.brandColorBlue
import com.it235.nureserved.ui.theme.darkGray
import com.it235.nureserved.ui.theme.darkGray2
import com.it235.nureserved.ui.theme.indicatorColorRed
import com.it235.nureserved.ui.theme.textColor1
import com.it235.nureserved.ui.theme.textColor4
import com.it235.nureserved.ui.theme.white
import com.it235.nureserved.ui.theme.white2
import com.it235.nureserved.ui.theme.white6
import getUserData
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerTextField(
    modifier: Modifier = Modifier,
    labelValue: String = "",
    selectedDate: String,
    showSuppText: MutableState<Boolean> = remember { mutableStateOf(false) },
    showModal: MutableState<Boolean>,
    fromDate: Date,
    toDate: Date,
    isValid: MutableState<Boolean>,
    onDateSelected: (Long?) -> Unit,
)
{

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
                    showSuppText.value = true
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
        supportingText = {
            if(showSuppText.value){
                if(selectedDate.isEmpty()){
                    isValid.value = false
                    Text(
                        text = "This field is required",
                        color = indicatorColorRed,
                    )
                }

                else if(fromDate.compareTo(toDate) == 0 && fromDate.getDay() == 0){
                    isValid.value = false
                    Text(
                        text = "Cannot reserve on a Sunday",
                        color = indicatorColorRed,
                    )
                }

                else if(fromDate.getDay() == 0){
                    Text(
                        text = "Cannot start on a Sunday",
                        color = indicatorColorRed,
                    )
                }

                else if(fromDate.compareTo(toDate) > 0){
                    isValid.value = false
                    Text(
                        text = "Invalid order of date",
                        color = indicatorColorRed,
                    )
                }

                else if(fromDate.compareTo(Date()) < 0){

                    if(fromDate.getDate() != Date().getDate() || fromDate.getMonth() != Date().getMonth() || fromDate.getYear() != Date().getYear()){
                        isValid.value = false
                        Text(
                            text = "From date should be greater than or equal to today",
                            color = indicatorColorRed,
                        )
                    }

                    //The below condition is for selecting dates of the same month
                    else{
                        fromDate.setDate(fromDate.getDate() + 5)

                        if(fromDate.compareTo(toDate) < 0){
                            isValid.value = false
                            Text(
                                text = "The maximum number of days for reservation is 6 days",
                                color = indicatorColorRed,
                            )
                        }

                        else{
                            isValid.value = true
                        }

                        fromDate.setDate(fromDate.getDate() - 5)
                    }

                }

                //The below condition is for selecting dates of different months
                else{
                    fromDate.setDate(fromDate.getDate() + 5)

                    if(fromDate.compareTo(toDate) < 0){
                        isValid.value = false
                        Text(
                            text = "The maximum number of days for reservation is 6",
                            color = indicatorColorRed,
                        )
                    }

                    else{
                        isValid.value = true
                    }

                    fromDate.setDate(fromDate.getDate() - 5)

                }

            }
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
                modifier = Modifier.clickable{ showModal.value = !showModal.value}
            )
        },
        modifier = modifier.fillMaxWidth()
    )

    if(showModal.value){
        DatePickerModal(
            onDateSelected = onDateSelected,
            onDismiss = { showModal.value = false}
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
fun OutlineTextFieldComposable(
    modifier: Modifier = Modifier,
    keyboardType: KeyboardType = KeyboardType.Text,
    label: String = "",
    inputValue: MutableState<String>,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    showSuppText: MutableState<Boolean> = remember { mutableStateOf(false) },
    isValidInput: MutableState<Boolean> = remember { mutableStateOf(false) },
    readOnly: Boolean = false,
    selectedRooms: List<String> = listOf(),
    textStyle: TextStyle? = null,
    onValueChange: (String) -> Unit,
){

    OutlinedTextField(
        modifier = modifier
            .fillMaxWidth(),
        value = inputValue.value,
        readOnly = readOnly,
        singleLine = true,
        shape = RoundedCornerShape(10.dp),
        onValueChange = onValueChange,
        supportingText = {
            if(showSuppText.value){
                if(keyboardType != KeyboardType.Number){
                    if(inputValue.value.isEmpty()){
                        isValidInput.value = false
                        Text(
                            text = "This field is required",
                            color = indicatorColorRed,
                        )
                    }

                    else{
                        isValidInput.value = true
                    }
                }

                else{
                    if(inputValue.value.isEmpty()){
                        isValidInput.value = false
                        Text(
                            text = "This field is required",
                            color = indicatorColorRed,
                        )
                    }

                    else if(selectedRooms.size == 1 && inputValue.value.toInt() > 40){
                        isValidInput.value = false
                        Text(
                            text = "Maximum number of attendees is 40 for one venue",
                            color = indicatorColorRed,
                        )
                    }

                    else if(selectedRooms.size == 2 && inputValue.value.toInt() > 80){
                        isValidInput.value = false
                        Text(
                            text = "Maximum number of attendees is 80 for two venue",
                            color = indicatorColorRed,
                        )
                    }

                    else if(selectedRooms.size == 3 && inputValue.value.toInt() > 120){
                        isValidInput.value = false
                        Text(
                            text = "Maximum number of attendees is 120 for three venue",
                            color = indicatorColorRed,
                        )
                    }

                    else{
                        isValidInput.value = true
                    }
                }

            }
        },
        label = {
            Text(
                text = label,
                style = LocalTextStyle.current.copy(
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal,
                )
            )
        },
        textStyle = textStyle ?: LocalTextStyle.current.copy(
            fontWeight = FontWeight.Normal,
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownTextField(
    modifier: Modifier = Modifier,
    options: List<String>,
    selectedOption: String,
    label: String,
    showSuppText: MutableState<Boolean>,
    firstOption: String,
    secondOption: String,
    isValid: MutableState<Boolean>,
    onOptionSelected: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        modifier = modifier
            .fillMaxWidth(),
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {

        OutlinedTextField(
            value = selectedOption,
            onValueChange = {},
            textStyle = TextStyle(
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
            ),
            supportingText = {
                if(showSuppText.value){

                    if(selectedOption == "Select time"){
                        isValid.value = false
                        Text(
                            text = "This field is required",
                            color = indicatorColorRed,
                        )
                    }

                    else if(firstOption.substring(firstOption.length -2, firstOption.length) == "AM" &&
                        secondOption.substring(secondOption.length -2, secondOption.length) == "AM"){
                        val firstTime = firstOption.split(" ")[0].toInt()
                        val secondTime = secondOption.split(" ")[0].toInt()

                        if(firstTime > secondTime){
                            isValid.value = false
                            Text(
                                text = "Invalid time order",
                                color = indicatorColorRed,
                            )
                        }

                        else{
                            isValid.value = true
                        }
                    }

                    else if(firstOption.substring(firstOption.length -2, firstOption.length) == "PM" &&
                        secondOption.substring(secondOption.length -2, secondOption.length) == "PM"){
                        val firstTime = firstOption.split(" ")[0].toInt()
                        val secondTime = secondOption.split(" ")[0].toInt()

                        if(firstTime > secondTime){
                            if(firstTime != 12){
                                isValid.value = false
                                Text(
                                    text = "Invalid time order",
                                    color = indicatorColorRed,
                                )
                            }
                            else{
                                isValid.value = true
                            }
                        }

                        else if(secondTime == 12){
                            isValid.value = false
                            Text(
                                text = "Invalid time order",
                                color = indicatorColorRed,
                            )
                        }

                        else{
                            isValid.value = true
                        }

                    }

                    else if(firstOption.substring(firstOption.length -2, firstOption.length) == "PM" &&
                        secondOption.substring(secondOption.length -2, secondOption.length) == "AM"){
                        isValid.value = false
                        Text(
                            text = "Invalid time order",
                            color = indicatorColorRed,
                        )
                    }

                    else{
                        isValid.value = true
                    }
                }
            },
            readOnly = true,
            label = {
                Text( text = label )
            },
            trailingIcon = {
                Icon(
                    painter = if(!expanded) painterResource(R.drawable.arrow_drop_down_24dp_000000_fill0_wght400_grad0_opsz24) else painterResource(R.drawable.arrow_drop_up_24dp_000000_fill0_wght400_grad0_opsz24),
                    contentDescription = "Dropdown arrow",
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = LocalTextStyle.current.color,
                focusedBorderColor = LocalTextStyle.current.color,
                focusedTextColor = LocalTextStyle.current.color,
                cursorColor = LocalTextStyle.current.color,
            ),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
        )

        ExposedDropdownMenu(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 200.dp)
                .border(
                    width = 1.dp,
                    color = textColor1,
                    shape = RoundedCornerShape(6.dp)
                )
                .verticalScroll(rememberScrollState()),
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = selectionOption,
                            color = if (isSystemInDarkTheme()) darkGray2 else textColor1,
                            fontSize = 13.sp,
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
fun InputAndLabelLayout(
    label: String = "",
    inputName: String,
    inputValue: MutableState<String>,
    keyboardType: KeyboardType = KeyboardType.Text,
    dimension: String,
    showSuppText: MutableState<Boolean> = remember { mutableStateOf(false) },
    isValidInput: MutableState<Boolean> = remember { mutableStateOf(false) },
    selectedRooms: List<String> = listOf(),
){
    if(dimension == "col"){
        Column(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 10.dp)
        ){
            Text(
                text = inputName,
                style = LocalTextStyle.current.copy(
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                ),
            )

            Spacer(modifier = Modifier.height(5.dp))

            OutlineTextFieldComposable(
                inputValue = inputValue,
                keyboardType = keyboardType,
                label = label,
                showSuppText = showSuppText,
                isValidInput = isValidInput,
            ){
                showSuppText.value = true
                inputValue.value = it
            }
        }

    }

    else{
        Row(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ){
            Text(
                text = inputName,
                style = LocalTextStyle.current.copy(
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                ),
            )

            Spacer(modifier = Modifier.width(5.dp))

            OutlineTextFieldComposable(
                inputValue = inputValue,
                keyboardType = keyboardType,
                label = label,
                showSuppText = showSuppText,
                isValidInput = isValidInput,
                selectedRooms = selectedRooms
            ){
                showSuppText.value = true
                inputValue.value = it
            }
        }

    }

}

@Composable
fun ConfirmationDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    showConfirmDialog: () -> Unit
) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "All inputs look good") },
        icon = {
            Icon(
                imageVector = Icons.Filled.Done,
                contentDescription = null,
            )
        },
        text = {
            Text(
                text = "Please double check all of your inputs before proceeding to avoid any inconvenience.",
                textAlign = TextAlign.Center
            )
        },
        confirmButton = {
            TextButton(
                onClick = { onDismiss(); showConfirmDialog() }
            ) {
                Text("Proceed")
            }
        },
        dismissButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text("Back")
            }
        }
    )
}

@Composable
fun FilterChipsLabel(label: String){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp),
        text = label,
        style = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
        ),
    )
}

@Composable
fun FilterChipsCategoryDivider(){
    HorizontalDivider(
        modifier = Modifier
            .padding(vertical = 5.dp),
        color = white2,
        thickness = 2.dp
    )
}

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
@Composable
fun RoomReservationForm(
    navController: NavController
){
    var selectedRooms by remember { mutableStateOf(listOf<String>()) }
    val focusManager = LocalFocusManager.current

    var venueShowSuppTxt by remember { mutableStateOf(false) }
    val isVenueValid = remember { mutableStateOf(false) }

    val nameLabels = listOf("Given Name", "Middle Name", "Surname");

    val nameOfOrgDeptColg = remember { mutableStateOf("") }
    val nameOfOrgShowSuppTxt = remember { mutableStateOf(false) }
    val isNameOfOrgValid = remember { mutableStateOf(false) }

    val position = remember { mutableStateOf("") }
    val positionShowSuppTxt = remember { mutableStateOf(false) }
    val isPositionValid = remember { mutableStateOf(false) }

    val titleOfTheActivity = remember { mutableStateOf("") }
    val titleOfTheActivityShowSuppTxt = remember { mutableStateOf(false) }
    val isTitleOfTheActivityValid = remember { mutableStateOf(false) }

    val expectedNumberOfAttendees = remember { mutableStateOf("") }
    val expectedNumberOfAttendeesShowSuppTxt = remember { mutableStateOf(false) }
    val isExpectedNumberOfAttendeesValid = remember { mutableStateOf(false) }

    var fromDatesOfActivity by remember { mutableStateOf(Date()) }
    val fromDatesOfActivityShowSuppTxt = remember { mutableStateOf(false) }
    val isValidFromDatesOfActivity = remember { mutableStateOf(false) }
    var isFromDatesOfActivitySelected by remember { mutableStateOf(false) }
    val fromDatesOfActivityShowModal = remember { mutableStateOf(false) }

    var toDatesOfActivity by remember { mutableStateOf(Date()) }
    val toDatesOfActivityShowSuppTxt = remember { mutableStateOf(false) }
    val isValidToDatesOfActivity = remember { mutableStateOf(false) }
    var istoDatesOfActivitySelected by remember { mutableStateOf(false) }
    val toDatesOfActivityShowModal = remember { mutableStateOf(false) }

    var currentFloorLocation by remember { mutableStateOf<FloorLocation?>(null) }

    var user by remember { mutableStateOf<User?>(null) }
    var loadingUserData by remember { mutableStateOf(true)}

    LaunchedEffect(Unit) {
        getUserData { fetchedUser ->
            user = fetchedUser
            loadingUserData = false
        }
    }

    val givenName = remember(user) { mutableStateOf(
        if (loadingUserData) {
            "Fetching data..."
        } else {
            user?.firstName ?: "N/A"
        }
    ) }
    val middleName = remember(user) { mutableStateOf(
        if (loadingUserData) {
            "Fetching data..."
        } else {
            user?.middleName ?: "N/A"
        }
    ) }
    val lastName = remember(user) { mutableStateOf(
        if (loadingUserData) {
            "Fetching data..."
        } else {
            user?.lastName ?: "N/A"
        }
    ) }

    var showAlertDialog by remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    val timeOptions = listOf(
        "Select time",
        "8 AM",
        "9 AM",
        "10 AM",
        "11 AM",
        "12 PM",
        "1 PM",
        "2 PM",
        "3 PM",
        "4 PM",
        "5 PM",
        "6 PM",
        "7 PM",
        "8 PM",
        "9 PM",
    )


    var selectedFromTimeOption by remember { mutableStateOf(timeOptions[0]) }
    val selectedFromTimeOptionShowSuppTxt = remember { mutableStateOf(false) }
    val isValidFromTimeOption = remember { mutableStateOf(false) }

    var selectedToTimeOption by remember { mutableStateOf(timeOptions[0]) }
    val selectedToTimeOptionShowSuppTxt = remember { mutableStateOf(false) }
    val isValidToTimeOption = remember { mutableStateOf(false) }

    if(showAlertDialog){
        ConfirmationDialog(
            showDialog = showAlertDialog,
            onDismiss = { showAlertDialog = false },
            showConfirmDialog = {
                navController.navigate(ScreenRoutes.RoomUsageRules.route)
            },
        )
    }

    Scaffold(
        modifier = Modifier
            .pointerInput(Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            },
        snackbarHost = {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
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
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
        ){
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(brandColorBlue)
                        .padding(start = 20.dp, top = 15.dp, bottom = 15.dp, end = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Image(
                        modifier = Modifier.
                        width(60.dp),
                        painter = painterResource(R.drawable.logo),
                        contentDescription = "NUreserved logo",
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = "ROOM RESERVATIONS",
                        style = LocalTextStyle.current.copy(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                        ),
                    )
                }
            }

            item {
                InputAndLabelLayout(
                    inputName = "Name of Organization/Department/College:",
                    inputValue = nameOfOrgDeptColg,
                    dimension = "col",
                    showSuppText = nameOfOrgShowSuppTxt,
                    isValidInput = isNameOfOrgValid,
                )
            }

            item{
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp)
                ){
                    Text(
                        text = "Requested by:",
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    nameLabels.forEachIndexed{index, nameLabel ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(
                                modifier = Modifier
                                    .weight(3f)
                                    .padding(start = 10.dp),
                                text = nameLabel,
                                style = LocalTextStyle.current.copy(
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                ),
                            )

                            OutlineTextFieldComposable(
                                modifier = Modifier.weight(5f),
                                inputValue = when(index){
                                    0 -> givenName
                                    1 -> middleName
                                    else -> lastName
                                },
                                readOnly = true,
                                textStyle = if (loadingUserData) {
                                    LocalTextStyle.current.copy(
                                        color = textColor4
                                    )
                                } else {
                                    LocalTextStyle.current.copy(
                                        color = textColor1
                                    )
                                }
                            ){
                                when(index){
                                    0 -> givenName.value = it
                                    1 -> middleName.value = it
                                    else -> lastName.value = it
                                }
                            }

                        }
                    }

                }
            }

            item {
                InputAndLabelLayout(
                    inputName = "Position:",
                    inputValue = position,
                    dimension = "row",
                    showSuppText = positionShowSuppTxt,
                    isValidInput = isPositionValid,
                )
            }

            item {
                InputAndLabelLayout(
                    inputName = "Title of the Activity:",
                    inputValue = titleOfTheActivity,
                    dimension = "col",
                    showSuppText = titleOfTheActivityShowSuppTxt,
                    isValidInput = isTitleOfTheActivityValid,
                )
            }

            item {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp)
                ){
                    Text(
                        text = "Date/s of the Activity:",
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    Row {
                        DatePickerTextField(
                            modifier = Modifier
                                .weight(1f),
                            selectedDate = if(!isFromDatesOfActivitySelected) "" else  SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(fromDatesOfActivity),
                            showModal = fromDatesOfActivityShowModal,
                            labelValue = "From",
                            fromDate = fromDatesOfActivity,
                            toDate = toDatesOfActivity,
                            showSuppText = fromDatesOfActivityShowSuppTxt,
                            isValid = isValidFromDatesOfActivity,
                        ){
                            try {
                                val date = Date(it!!)
                                fromDatesOfActivity = date
                                fromDatesOfActivityShowModal.value = false
                                isFromDatesOfActivitySelected = true
                            }
                            catch(e: Exception){
                                //add snackbar for error message
                            }
                        }

                        Space("w", 5)

                        DatePickerTextField(
                            modifier = Modifier
                                .weight(1f),
                            selectedDate = if(!istoDatesOfActivitySelected) "" else  SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(toDatesOfActivity),
                            showModal = toDatesOfActivityShowModal,
                            labelValue = "To",
                            fromDate = fromDatesOfActivity,
                            toDate = toDatesOfActivity,
                            showSuppText = toDatesOfActivityShowSuppTxt,
                            isValid = isValidToDatesOfActivity,
                        ){
                            try {
                                val date = Date(it!!)
                                toDatesOfActivity = date
                                toDatesOfActivityShowModal.value = false
                                istoDatesOfActivitySelected = true
                            }
                            catch(e: Exception){
                                //add snackbar for error message
                            }
                        }
                    }
                }

                Space("h", 10)
            }

            item {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp)
                ){
                    Text(
                        text = "Time of the Activity:",
                        style = LocalTextStyle.current.copy(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    Row {
                        DropdownTextField(
                            modifier = Modifier
                                .weight(1f),
                            options = timeOptions,
                            selectedOption = selectedFromTimeOption,
                            firstOption = selectedFromTimeOption,
                            secondOption = selectedToTimeOption,
                            label = "From",
                            showSuppText = selectedFromTimeOptionShowSuppTxt,
                            isValid = isValidFromTimeOption,
                            onOptionSelected = {
                                selectedFromTimeOption = it
                                selectedFromTimeOptionShowSuppTxt.value = true
                            },
                        )

                        Space("w", 5)

                        DropdownTextField(
                            modifier = Modifier
                                .weight(1f),
                            options = timeOptions,
                            selectedOption = selectedToTimeOption,
                            firstOption = selectedFromTimeOption,
                            secondOption = selectedToTimeOption,
                            label = "To",
                            showSuppText = selectedToTimeOptionShowSuppTxt,
                            isValid = isValidToTimeOption,
                            onOptionSelected = {
                                selectedToTimeOption = it
                                selectedToTimeOptionShowSuppTxt.value = true
                            },
                        )
                    }
                }

                Space("h", 10)
            }

            item {
                InputAndLabelLayout(
                    inputName = "Expected # of attendees:",
                    inputValue = expectedNumberOfAttendees,
                    dimension = "row",
                    keyboardType = KeyboardType.Number,
                    showSuppText = expectedNumberOfAttendeesShowSuppTxt,
                    isValidInput = isExpectedNumberOfAttendeesValid,
                    selectedRooms = selectedRooms,
                )

                HorizontalDivider(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp),
                    color = white2,
                    thickness = 2.dp
                )
            }

            item {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp),
                ){
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

                            roomList.forEachIndexed {index, room ->
                                if (currentFloorLocation == null) {
                                    FilterChipsLabel(label = room.location.value)
                                } else {
                                    if (room.location != currentFloorLocation) {
                                        FilterChipsLabel(label = room.location.value)
                                    }
                                }

                                FilterChipComposable(
                                    roomNumber = room.name,
                                    selectedRooms = selectedRooms,
                                    onRoomSelected = {
                                        selectedRooms = selectedRooms + it
                                        venueShowSuppTxt = true
                                    },
                                    onRoomDeselected = {
                                        selectedRooms = selectedRooms - it
                                    }
                                )

                                if (index < roomList.size - 1 && room.location != roomList[index + 1].location) {
                                    FilterChipsCategoryDivider()
                                }

                                currentFloorLocation = room.location
                            }
                        }

                        if(venueShowSuppTxt){
                            if(selectedRooms.isEmpty()){
                                isVenueValid.value = false
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    text = "This section is required",
                                    fontSize = 13.sp,
                                    color = indicatorColorRed,
                                )
                            }

                            else if(selectedRooms.size >= 4){
                                isVenueValid.value = false
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    text = "Maximum number of venues is 3",
                                    fontSize = 13.sp,
                                    color = indicatorColorRed,
                                )

                            }

                            else{
                                isVenueValid.value = true
                            }

                        }
                    }
                }

                Space("h", 10)
            }

            item {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.End,
                ){
                    Button(
                        onClick = { navController.popBackStack() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = darkGray,
                            contentColor = white
                        ),
                        shape = RoundedCornerShape(10.dp),
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

                            // Dismiss the currently shown Snackbar, if any
                            snackbarHostState.currentSnackbarData?.dismiss()

                            if(!isNameOfOrgValid.value || !isPositionValid.value ||
                                !isTitleOfTheActivityValid.value || !isExpectedNumberOfAttendeesValid.value || !isValidFromDatesOfActivity.value ||
                                !isValidToDatesOfActivity.value || !isValidFromTimeOption.value || !isValidToTimeOption.value || !isVenueValid.value){
                                nameOfOrgShowSuppTxt.value = true
                                positionShowSuppTxt.value = true
                                titleOfTheActivityShowSuppTxt.value = true
                                expectedNumberOfAttendeesShowSuppTxt.value = true
                                fromDatesOfActivityShowSuppTxt.value = true
                                toDatesOfActivityShowSuppTxt.value = true
                                selectedFromTimeOptionShowSuppTxt.value = true
                                selectedToTimeOptionShowSuppTxt.value = true
                                venueShowSuppTxt = true

                                scope.launch {
                                    snackbarHostState.showSnackbar(
                                        message = "Make sure your inputs are correct",
                                        duration = SnackbarDuration.Short
                                    )
                                }
                            }

                            else{
                                showAlertDialog = true
                            }

                        },
                        colors =  ButtonDefaults.buttonColors(
                            containerColor = brandColorBlue,
                            contentColor = white,
                        ),
                        shape = RoundedCornerShape(10.dp),
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