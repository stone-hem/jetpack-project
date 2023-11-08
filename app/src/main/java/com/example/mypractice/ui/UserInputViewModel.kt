package com.example.mypractice.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mypractice.data.UserDataUiEvents
import com.example.mypractice.data.UserInputScreenState

class UserInputViewModel: ViewModel() {
    var uiState= mutableStateOf(UserInputScreenState())

    fun onEvent(events: UserDataUiEvents){
        when(events){
            is UserDataUiEvents.UserNameEntered->{
                uiState.value=uiState.value.copy(
                    nameEntered=events.name
                )
            }
            is UserDataUiEvents.UserAnimalEntered->{
                uiState.value=uiState.value.copy(
                    animalSelected=events.animal
                )
            }
        }
    }
}



