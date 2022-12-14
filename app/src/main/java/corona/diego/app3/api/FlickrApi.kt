package corona.diego.app3.api

import corona.diego.app3.FlickrResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "yourApiKeyHere"

interface FlickrApi
{
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse
    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}


