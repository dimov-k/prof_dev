package ru.mrroot.translator.repository

interface Repository<T> {
    suspend fun getData(word: String): T
}