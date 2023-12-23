package org.fossify.draw.extensions

import android.content.Context
import org.fossify.draw.helpers.Config

val Context.config: Config get() = Config.newInstance(applicationContext)
