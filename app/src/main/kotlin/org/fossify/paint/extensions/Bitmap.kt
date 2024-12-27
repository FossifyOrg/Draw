package org.fossify.paint.extensions

import android.graphics.Bitmap
import org.fossify.paint.helpers.VectorFloodFiller
import org.fossify.paint.models.MyPath

fun Bitmap.vectorFloodFill(color: Int, x: Int, y: Int, tolerance: Int): MyPath {
    val floodFiller = VectorFloodFiller(this).apply {
        fillColor = color
        this.tolerance = tolerance
    }

    floodFiller.floodFill(x, y)
    return floodFiller.path
}
