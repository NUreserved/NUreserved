package com.it235.nureserved

import android.app.TimePickerDialog
import android.icu.util.Calendar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.it235.nureserved.composables.RowHeader
import com.it235.nureserved.font.poppinsFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputFieldAndLabel(inputWidth: Modifier = Modifier, inputLabel: String, modifier: Modifier, inputType: @Composable () -> Unit){

    Text(
        modifier = inputWidth,
        text = inputLabel,
        color = Color(0xFF0F0F0F),
        style = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
        )
    )

    Spacer(modifier = modifier)

    inputType()

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePicker(modifier: Modifier = Modifier){
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
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xFFEEEEEE),
            focusedContainerColor = Color(0xFFEEEEEE),
            unfocusedBorderColor = Color(0xFF0F0F0F),
            focusedBorderColor = Color(0xFF0F0F0F),
            focusedTextColor = Color(0xFF0F0F0F),
            cursorColor = Color(0xFF0F0F0F),
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
fun DatePickerTextField(){
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
        shape = RoundedCornerShape(10.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xFFEEEEEE),
            focusedContainerColor = Color(0xFFEEEEEE),
            unfocusedBorderColor = Color(0xFF0F0F0F),
            focusedBorderColor = Color(0xFF0F0F0F),
            focusedTextColor = Color(0xFF0F0F0F),
            cursorColor = Color(0xFF0F0F0F),
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
fun FilterChipComposable(roomNumber: String, modifier: Modifier = Modifier){
    var selected by remember { mutableStateOf(false) }

    FilterChip(
        modifier = modifier,
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Color(0xFFEEEEEE)
        ),
        onClick = { selected = !selected},
        label = {
            Text( text = roomNumber )
        },
        selected = selected,
        leadingIcon = if(selected){
            {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Done Icon",
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else{
            null
        }
    )
}

@Composable
fun OutlineTextFieldComposable(keyboardType: KeyboardType = KeyboardType.Text){
    var inputValue by remember { mutableStateOf("") }


    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = inputValue,
        singleLine = true,
        onValueChange = { inputValue = it },
        textStyle = TextStyle(
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
        ),
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xFFEEEEEE),
            focusedContainerColor = Color(0xFFEEEEEE),
            unfocusedBorderColor = Color(0xFF0F0F0F),
            focusedBorderColor = Color(0xFF0F0F0F),
            focusedTextColor = Color(0xFF0F0F0F),
            cursorColor = Color(0xFF0F0F0F),
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

@Composable
fun RoomReservationForm(modifier: Modifier = Modifier){

    Scaffold(

    ){ innerPadding ->
        Column(
            modifier = modifier
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
                            InputFieldAndLabel(inputLabel = "From:", modifier = Modifier.width(5.dp), inputWidth = Modifier.weight(1f)){
                                Row(modifier = Modifier.weight(3f)) {
                                    DatePickerTextField()
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        RowLayout(){
                            InputFieldAndLabel(inputLabel = "From:", modifier = Modifier.width(5.dp), inputWidth = Modifier.weight(1f)){
                                Row(modifier = Modifier.weight(3f)){
                                    TimePicker()
                                }
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
                            InputFieldAndLabel(inputLabel = "To:", modifier = Modifier.width(0.dp), inputWidth = Modifier.weight(1f)){
                                Row(modifier = Modifier.weight(3f)) {
                                    DatePickerTextField()
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        RowLayout(){
                            InputFieldAndLabel(inputLabel = "To:", modifier = Modifier.width(0.dp), inputWidth = Modifier.weight(1f)){
                                Row(modifier = Modifier.weight(3f)){
                                    TimePicker()
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Requested by:",
                    color = Color(0xFF0F0F0F),
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                    )
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
                    color = Color(0xFF0F0F0F),
                    style = TextStyle(
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                    )
                )

                Spacer(modifier = Modifier.height(10.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    //row 1
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        FilterChipComposable(roomNumber = "Room 202", modifier = Modifier.weight(1f))

                        Spacer(modifier = Modifier.width(3.dp))

                        FilterChipComposable(roomNumber = "Room 205", modifier = Modifier.weight(1f))

                        Spacer(modifier = Modifier.width(3.dp))

                        FilterChipComposable(roomNumber = "Room 215", modifier = Modifier.weight(1f))
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    //row 2
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        FilterChipComposable(roomNumber = "Room 316", modifier = Modifier.weight(1f))

                        Spacer(modifier = Modifier.width(3.dp))

                        FilterChipComposable(roomNumber = "Room 317", modifier = Modifier.weight(1f))

                        Spacer(modifier = Modifier.width(3.dp))

                        FilterChipComposable(roomNumber = "Room 215", modifier = Modifier.weight(1f))
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    Button(
                        onClick = {},
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