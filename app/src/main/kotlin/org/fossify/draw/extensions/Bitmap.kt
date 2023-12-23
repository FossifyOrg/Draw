package org.fossify.draw.extensions

import android.graphics.Bitmap
import org.fossify.draw.helpers.VectorFloodFiller
import org.fossify.draw.models.MyPath

fun Bitmap.vectorFloodFill(color: Int, x: Int, y: Int, tolerance: Int): MyPath {
    val floodFiller = VectorFloodFiller(this).apply {
        fillColor = color
        this.tolerance = tolerance
    }

    floodFiller.floodFill(x, y)
    return floodFiller.path
}
