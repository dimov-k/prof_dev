package ru.mrroot.translator.widget.remote

import retrofit2.http.GET

interface DoggyApi {
    @GET("random")
    suspend fun getRandomDog():DoggyResponse
}