package com.aqeel.simplemorty

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyService {
    @GET(value = "character/{characterId}")
   suspend fun getCharacterById(
        @Path(value = "characterId") characterId:Int
    ):Response<GetCharacterByIdResponse>
}