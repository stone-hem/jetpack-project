package com.example.mypractice.ui

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mypractice.data.UserDataUiEvents
import com.example.mypractice.data.UserInputScreenState

class UserInputViewModel: ViewModel() {
    companion object {
        const val TAG="UserInputViewModel"
    }
    var uiState= mutableStateOf(UserInputScreenState())

    fun onEvent(events: UserDataUiEvents){
        when(events){
            is UserDataUiEvents.UserNameEntered->{
                uiState.value=uiState.value.copy(
                    nameEntered=events.name
                )
                Log.d(TAG, "onEvent:UserNameEntered->> ")
                Log.d(TAG, "${uiState.value}")
            }
            is UserDataUiEvents.UserAnimalEntered->{
                uiState.value=uiState.value.copy(
                    animalSelected=events.animal
                )
                Log.d(TAG, "onEvent:UserAnimalEntered->> ")
                Log.d(TAG, "${uiState.value}")
            }
        }
    }

    fun isValidState():Boolean{
        return !uiState.value.nameEntered.isNullOrEmpty() && !uiState.value.animalSelected.isNullOrEmpty()
    }
}



