package corona.diego.app3

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import corona.diego.app3.api.GalleryItem


@JsonClass(generateAdapter = true)
data class PhotoResponse(
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)
