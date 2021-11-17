package ru.mrroot.translator.widget.remote

import com.google.gson.annotations.SerializedName

data class DoggyResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
)
