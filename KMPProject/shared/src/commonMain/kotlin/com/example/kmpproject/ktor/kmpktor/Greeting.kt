package com.example.kmpproject.ktor.kmpktor

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class KtorGreeting {
    private val client = HttpClient()

    suspend fun greet(): String {
        val response = client.get("https://ktor.io/docs/")
        return response.bodyAsText()
    }
}