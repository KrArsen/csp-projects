package com.example.project3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform