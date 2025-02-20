package com.aqeel.simplemorty

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class NetworkLayer {
val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://rickandmortyapi.com/api/").addConverterFactory(
    MoshiConverterFactory.create(moshi)).build()

val rickAndMortyService:RickAndMortyService by lazy {
    retrofit.create(RickAndMortyService::class.java)
}
    val apiClient=ApiClient(
        rickAndMortyService
    )


}