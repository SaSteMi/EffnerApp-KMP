package app.effner.effnerapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform