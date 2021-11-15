package ru.mrroot.translator.model.data.DTO

import com.google.gson.annotations.SerializedName

data class TranslationDTO(
    @SerializedName("text") val text: String?,
    @SerializedName("note") val note: String?
)
