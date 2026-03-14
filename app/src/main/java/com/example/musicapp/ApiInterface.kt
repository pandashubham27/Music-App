package com.example.musicapp

import retrofit2.Call;
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers("x-rapidapi-key: 8028c45f1fmsh08e3160afbff660p1096f2jsn673e5b78bde2",
        "x-rapidapi-host: deezerdevs-deezer.p.rapidapi.com")

    @GET("search")
    fun getData(@Query("q") query: String) :Call<MyData>
}