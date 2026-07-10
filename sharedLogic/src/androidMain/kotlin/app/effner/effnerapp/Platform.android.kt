package app.effner.effnerapp

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android-Version ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()