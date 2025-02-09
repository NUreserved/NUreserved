package com.it235.nureserved.screens.admin.floor_rooms

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.it235.nureserved.domain.rooms.FloorLocation
import com.it235.nureserved.domain.rooms.Room
import com.it235.nureserved.domain.rooms.roomList
import com.it235.nureserved.domain.rooms_v2.RoomDataV2
import com.it235.nureserved.domain.rooms_v2.RoomV2
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FloorRoomsViewModel : ViewModel() {
    private val _rooms = MutableStateFlow<List<RoomV2>>(emptyList())
    val rooms: StateFlow<List<RoomV2>> = _rooms

    fun loadRooms(floorName: com.it235.nureserved.domain.rooms_v2.FloorLocation) {
        viewModelScope.launch {
            _rooms.value = RoomDataV2.rooms.filter { it.location == floorName }
        }
    }
}