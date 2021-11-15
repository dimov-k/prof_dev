package ru.mrroot.translator.model.data

data class Word(
    val id: Int = 0,
    val text: String = "",
    val meanings: List<Meaning> = listOf()
)