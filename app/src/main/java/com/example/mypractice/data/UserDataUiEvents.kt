package com.example.mypractice.data

sealed class UserDataUiEvents{
    data class UserNameEntered(val name:String):UserDataUiEvents()
    data class UserAnimalEntered(val animal:String):UserDataUiEvents()
}