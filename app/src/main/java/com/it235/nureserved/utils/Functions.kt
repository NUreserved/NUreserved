package com.it235.nureserved.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Scale
import com.it235.nureserved.R

@Composable
fun rescalePicture(
    imageResId: Int?,
    size: Pair<Int, Int> = Pair(720, 360)
): AsyncImagePainter {
    return rememberAsyncImagePainter(
        ImageRequest.Builder(LocalContext.current).data(data = imageResId ?: R.drawable.resource_default)
            .apply {
                size(size.first, size.second) // Set the size to match the modifier dimensions
                scale(Scale.FILL)
            }.build()
    )
}