package org.fossify.paint.extensions

import android.content.Context
import org.fossify.paint.helpers.Config

val Context.config: Config get() = Config.newInstance(applicationContext)
