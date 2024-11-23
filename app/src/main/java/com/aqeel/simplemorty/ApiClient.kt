package com.aqeel.simplemorty

import retrofit2.Response

class ApiClient (
    private val rickAndMortyService: RickAndMortyService
){
    suspend fun getCharacterById(characterInt: Int):Response<GetCharacterByIdResponse>{
        return rickAndMortyService.getCharacterById(characterInt)
    }
}