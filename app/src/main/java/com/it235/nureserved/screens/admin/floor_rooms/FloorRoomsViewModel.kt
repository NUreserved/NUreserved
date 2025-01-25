package com.it235.nureserved.screens.admin.floor_rooms

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.it235.nureserved.data.rooms.FloorLocation
import com.it235.nureserved.data.rooms.Room
import com.it235.nureserved.data.rooms.roomList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FloorRoomsViewModel : ViewModel() {
    private val _rooms = MutableStateFlow<List<Room>>(emptyList())
    val rooms: StateFlow<List<Room>> = _rooms

    fun loadRooms(floorName: FloorLocation) {
        viewModelScope.launch {
            _rooms.value = roomList.filter { it.location == floorName }
        }
    }
}