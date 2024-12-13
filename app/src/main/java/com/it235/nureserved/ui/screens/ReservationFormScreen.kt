package com.it235.nureserved.ui.screens

import android.app.TimePickerDialog
import android.icu.util.Calendar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
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
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.it235.nureserved.R
import com.it235.nureserved.ScreenRoutes
import com.it235.nureserved.composables.RowHeader
import com.it235.nureserved.font.poppinsFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFieldAndLabel(inputWidth: Modifier = Modifier, inputLabel: String, modifier: Modifier, inputType: @Composable () -> Unit){

    Text(
        modifier = inputWidth,
        text = inputLabel,
        style = LocalTextStyle.current.copy(
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
        ),
    )

    Spacer(modifier = modifier)

    inputType()

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePicker(modifier: Modifier = Modifier, labelValue: String){
    var selectedTime by remember { mutableStateOf("00:00") }
    var showDialog by remember { mutableStateOf(false) }

    OutlinedTextField(
//        modifier = Modifier
//            .fillMaxWidth(),
        modifier = modifier,
        value = selectedTime,
        onValueChange = { selectedTime = it },
        shape = RoundedCornerShape(10.dp),
        readOnly = true,
        label = {
            Text( text = labelValue )
        },
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

    if(showDialog){
        val context = LocalContext.current
        val calendar = Calendar.getInstance()

        TimePickerDialog(
            context,
            {_, hourOfDay, minute ->
                selectedTime = String.format("%02d:%02d", hourOfDay, minute)
                showDialog = false
            },
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            true
        ).show()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerTextField(labelValue: String = ""){
    var selectedDate by remember { mutableStateOf("") }
    val context = LocalContext.current
    val calendar = Calendar.getInstance()

    val datePickerDialog = android.app.DatePickerDialog(
        context,
        { _, year, month, dayOfMonth ->
            selectedDate = "$dayOfMonth/${month + 1}/$year"
        },
        calendar.get(Calendar.YEAR),
        calendar.get(Calendar.MONTH),
        calendar.get(Calendar.DAY_OF_MONTH)
    )

    OutlinedTextField(
        value = selectedDate,
        onValueChange = { selectedDate = it},
        readOnly = true,
        label = {
          Text ( text = labelValue )
        },
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
                modifier = Modifier.clickable{datePickerDialog.show()}
            )
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun FilterChipComposable(
    roomNumber: String,
    isSelected: Boolean,
    onRoomSelected: (String) -> Unit
){

    FilterChip(
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = LocalTextStyle.current.color
        ),
        onClick = { onRoomSelected(roomNumber) },
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
fun OutlineTextFieldComposable(keyboardType: KeyboardType = KeyboardType.Text, labelValue: String = ""){
    var inputValue by remember { mutableStateOf("") }


    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = inputValue,
        singleLine = true,
        onValueChange = { inputValue = it },
        label = {
            Text( text = labelValue )
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
    Scaffold{ innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ){
            val poppinsSemiBold = FontFamily(
                Font(R.font.poppins_semibold)
            )

            RowHeader("ROOM RESERVATIONS FORM")

            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp)
            ){

                Column(){
                    InputFieldAndLabel(inputLabel = "Name of Organization/Department/College:", modifier = Modifier.height(5.dp)){
                        OutlineTextFieldComposable()
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Column(){
                    InputFieldAndLabel(inputLabel = "Title of the Activity:", modifier = Modifier.height(5.dp)){
                        OutlineTextFieldComposable()
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                RowLayout(){
                    InputFieldAndLabel(inputLabel = "Date Filled", modifier = Modifier.width(5.dp)){
                        DatePickerTextField()
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
//                    .padding(start = 20.dp)
                ){
                    //col 1
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ){
                        RowLayout(){
                            Row(modifier = Modifier.weight(3f)) {
                                DatePickerTextField(labelValue = "From")
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        RowLayout(){
                            Row(modifier = Modifier.weight(3f)){
                                TimePicker(labelValue = "From")
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    //col 2
                    Column(
                        modifier = Modifier
                            .weight(1f)
                    ){
                        RowLayout(){
                            Row(modifier = Modifier.weight(3f)) {
                                DatePickerTextField(labelValue = "From")
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        RowLayout(){
                            Row(modifier = Modifier.weight(3f)){
                                TimePicker(labelValue = "To")
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Requested by:",
                    style = LocalTextStyle.current.copy(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                )

                Spacer(modifier = Modifier.height(10.dp))

                RowLayout(modifier = Modifier.padding(start = 20.dp)){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        InputFieldAndLabel(inputLabel = "Given Name", modifier = Modifier.width(0.dp), inputWidth = Modifier.weight(3f)){
                            Row(modifier = Modifier.weight(6f)){
                                OutlineTextFieldComposable()
                            }
                        }
                    }

                }

                Spacer(modifier = Modifier.height(10.dp))

                RowLayout(modifier = Modifier.padding(start = 20.dp)){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        InputFieldAndLabel(inputLabel = "Middle Name", modifier = Modifier.width(0.dp), inputWidth = Modifier.weight(3f)){
                            Row(modifier = Modifier.weight(6f)){
                                OutlineTextFieldComposable()
                            }
                        }
                    }

                }

                Spacer(modifier = Modifier.height(10.dp))

                RowLayout(modifier = Modifier.padding(start = 20.dp)){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        InputFieldAndLabel(inputLabel = "Surname", modifier = Modifier.width(0.dp), inputWidth = Modifier.weight(3f)){
                            Row(modifier = Modifier.weight(6f)){
                                OutlineTextFieldComposable()
                            }
                        }
                    }

                }

                Spacer(modifier = Modifier.height(20.dp))

                RowLayout(){
                    InputFieldAndLabel(inputLabel = "Position:", modifier = Modifier.width(5.dp)){
                        OutlineTextFieldComposable()
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                RowLayout(){
                    InputFieldAndLabel(inputLabel = "Expected # of Attendees:", modifier = Modifier.width(5.dp)){
                        OutlineTextFieldComposable(keyboardType = KeyboardType.Number)
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                HorizontalDivider(
                    color = Color(0xFFEEEEEE),
                    thickness = 2.dp,
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Venue",
                    style = LocalTextStyle.current.copy(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                )

                Spacer(modifier = Modifier.height(10.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                ){
                    var selectedRoom by remember { mutableStateOf<String?>(null) }

                    FlowRow(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                    ) {
                        val rooms = listOf("Room 202", "Room 205", "Room 259", "Room 316", "Room 317", "Room 215")
                        rooms.forEach { room ->
                            FilterChipComposable(
                                roomNumber = room,
                                isSelected = selectedRoom == room,
                                onRoomSelected = { selectedRoom = it }
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Column(){
                    InputFieldAndLabel(inputLabel = "Recommending Approval:", modifier = Modifier.height(5.dp)){
                        OutlineTextFieldComposable(labelValue = "Email of your Adviser/Program Chair/Dean/Teacher")
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
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
                            style = TextStyle(
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 18.sp
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

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